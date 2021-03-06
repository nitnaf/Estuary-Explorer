package Models;

/**
 * 
 * @author vincent
 * Player will collect these objects in order to gather information about how estuary health is declining, and must take action
 * to fix these conflicts.
 */
public class Sample extends GameObject implements java.io.Serializable{
	
	private int xPos;
	private int yPos;
	private double turbidity;
	private double pH;
	private boolean discovered;
	
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
	public boolean isDiscovered() {
		return discovered;
	}
	public void setDiscovered(boolean discovered) {
		this.discovered = discovered;
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
	public int getXPosition() {
		// TODO Auto-generated method stub
		return xPos;
	}
	
	@Override
	public int getYPosition() {
		// TODO Auto-generated method stub
		return yPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
}
