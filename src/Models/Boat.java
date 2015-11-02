package Models;

public class Boat extends GameObject{
	
	double health;

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean collision() {
		// TODO Auto-generated method stub
		return false;
	}

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

}
