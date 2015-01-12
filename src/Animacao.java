import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;


public class Animacao {

	public Animacao(Image sprite) {
		this.movimentLeft = new Image[] {sprite.getSubImage(970, 385, 300, 350), sprite.getSubImage(570, 385, 400, 350)
										, sprite.getSubImage(330, 385, 220, 350), sprite.getSubImage(5, 385, 312, 350)};
		this.left = new Animation(movimentLeft, duration, false);
		
		this.movimentRight = new Image[] {sprite.getSubImage(10, 15, 300, 350), sprite.getSubImage(320, 15, 400, 350)
										, sprite.getSubImage(730, 15, 220, 350), sprite.getSubImage(965, 15, 300, 350)};
		this.right = new Animation(movimentRight, duration, false);
	}

	final static int[] duration = {200, 200, 200, 200}; 
	
	private Image[] movimentLeft ;
	private Animation left;
	
	private Image[] movimentRight;
	private Animation right;
	
	public Animation Left(){
		return left;
	}
	
	public Animation Right(){
		return right;
	}
}
