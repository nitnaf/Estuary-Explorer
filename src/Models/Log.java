package Models;

/**
 * 
 * @author vincent
 * Game object that represents obstacles that the player must avoid while exploring the world
 */
public class Log extends GameObject{

	private int xPos;
	private int yPos;
	
	// GameObject --------------------------------------------------------------------------------
	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean collision(GameObject x) {
		// TODO Auto-generated method stub
		return false;
	}

	// Physical --------------------------------------------------------------------------------
	@Override
	public boolean isColliding() {
		// TODO Auto-generated method stub
		return false;
	}

	// Drawable --------------------------------------------------------------------------------
	@Override
	public void getTexture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	public int getXPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getYPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

}
