import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Jogo extends BasicGame {

	private float x = 0f, y = 50f;
	private Personagem personagem;
	private Animation animacao;
	
	public Jogo(String title) {
		super(title);
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.setBackground(Color.white);
		g.setColor(Color.black);
		g.drawString("USE AS SETAS < e > PARA MOVIMENTAR", 250, 500);
		animacao.draw((int)x, (int)y);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		personagem = new Personagem();
		animacao = personagem.getAnimacao().Right();
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		Input input = gc.getInput();
		
		if(input.isKeyDown(Input.KEY_LEFT)){
			animacao = personagem.getAnimacao().Left();
			if ((int)(x - (delta * 0.5f)) > -150){
				animacao.update(delta);
				x -= delta * 0.5f;
			}
		}
		else if(input.isKeyDown(Input.KEY_RIGHT)){
			animacao = personagem.getAnimacao().Right();
			if ((int)(x + (delta * 0.5f)) < 750){
				animacao.update(delta);
				x += delta * 0.5f;
			}
		}
	}

	public static void main(String[] args) throws SlickException {
		Jogo jogo = new Jogo("Animando Personagem");
		AppGameContainer container = new AppGameContainer(jogo);
		container.setDisplayMode(800, 600, false);
		container.start();
	}
}
