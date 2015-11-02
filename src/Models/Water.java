package Models;

public class Water extends Terrain{
	
	private boolean isPolluted;
	
	public boolean isPolluted() {
		return isPolluted;
	}

	public void setPolluted(boolean isPolluted) {
		this.isPolluted = isPolluted;
	}

	public void collectSample(){
		
	}
	
	@Override
	public boolean isTraversable() {
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
