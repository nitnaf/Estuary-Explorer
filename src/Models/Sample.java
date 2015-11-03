package Models;

public class Sample extends GameObject {
	
	private int xPos;
	private int yPos;
	private double turbidity;
	private double pH;
	private boolean physical;
	
	public double getTurbidity() {
		return turbidity;
	}
	public void setTurbidity(double turbidity) {
		this.turbidity = turbidity;
	}
	public double getpH() {
		return pH;
	}
	public void setpH(double pH) {
		this.pH = pH;
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
