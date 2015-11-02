package Models;

public class Sample extends GameObject {
	
	private double turbidity;
	private double pH;
	
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
