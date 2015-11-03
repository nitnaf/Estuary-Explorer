package Models;

public class Boat extends GameObject{
	
	private int xPos;
	private int yPos;
	double health;

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
	// GameObject --------------------------------------------------------------------------------
	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean collision(GameObject x) {
		if (xPos == x.getXPosition() && yPos == x.getYPosition()){
			return true;
		}
		return false;
	}
	
	@Override
	public int getXPosition() {
		return xPos;
	}

	@Override
	public int getYPosition() {
		return yPos;
	}
	
	public void setXPosition(int x){
		xPos = x;
	}
	
	public void setYPosition(int y){
		yPos = y;
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
	
//	---------------------------------------------------------------------------------------------
	
	public void move(){
		// Calls other method
	}


}
