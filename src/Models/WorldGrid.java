package Models;

public class WorldGrid {
	
	private static final int xMax = 300;
	private static final int xMin = 0;
	private static final int yMax = 300;
	private static final int yMin = 0;
	
	public boolean withinBounds(Boat x){
		if (x.getXPosition() > xMax || x.getXPosition() < xMin || x.getYPosition() > yMax || x.getYPosition() < yMin){
			return false;
		}
		return true;
	}
}
