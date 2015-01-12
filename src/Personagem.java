import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Personagem {

	public Personagem() throws SlickException {
		this.animacao = new Animacao(new Image("image/megaman.jpg"));
	}
	
	private Animacao animacao;
	
	public Animacao getAnimacao(){
		return animacao;
	}
}
