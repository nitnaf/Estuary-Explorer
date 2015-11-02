package Models;

public class Land extends Terrain {
	
	private boolean isErroding;
	
	public boolean isErroding() {
		return isErroding;
	}

	public void setErroding(boolean isErroding) {
		this.isErroding = isErroding;
	}

	public void plantFoliage(){
		
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
