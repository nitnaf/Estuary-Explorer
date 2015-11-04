package Models;

/**
 * 
 * @author vincent
 * Objects that inhabit the estuary. Can either be for scenery or can be interacted with, if they are
 * designated as an invasive species.
 */
public class Fish extends GameObject implements java.io.Serializable{
	
	private int xPos;
	private int yPos;
	private boolean invasive;
	private boolean physical;	// Can have decorative fish 

	public boolean isInvasive() {
		return invasive;
	}

	public void setInvasive(boolean invasive) {
		this.invasive = invasive;
	}

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
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public boolean isPhysical() {
		return physical;
	}

	public void setPhysical(boolean physical) {
		this.physical = physical;
	}

	public int getXPosition() {
		return xPos;
	}

	@Override
	public int getYPosition() {
		return yPos;
	}
	
	
}
