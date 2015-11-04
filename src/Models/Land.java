package Models;

/**
 * 
 * @author vincent
 * Positions in the world that cannot be traversed. Land could be eroding, which the player would have to 
 * react and amend by planting plants.
 */
public class Land extends Terrain {
	
	private boolean isEroding;
	
	public boolean isEroding() {
		return isEroding;
	}

	/**
	 * 
	 * @param isEroding a boolean statement to indicate if terrain unit is eroding
	 */
	public void setEroding(boolean isEroding) {
		this.isEroding = isEroding;
	}

	/**
	 * 
	 */
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

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
