package View;



/**
 * Class implemented by things that are drawn into world.... those entities will 
 * implement a draw method which will polymorphically draw their model to screen.
 * @author
 *
 */
public interface Drawable {
	
	public void getTexture();
	public void getPosition();

	public void draw();
	
}
