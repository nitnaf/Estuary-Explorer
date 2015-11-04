package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Models.Boat;
import Models.Log;
import Models.WorldGrid;

public class BoatTests {

	@Test
	public void test() {
		
		WorldGrid world = new WorldGrid();
		Boat testBoat = new Boat();
		Log mockLog = new Log();
		
		
		assertTrue(testBoat.collision(mockLog));
		assertTrue(world.withinBounds(testBoat));
		testBoat.move(); 								// Move the boat somewhere
		assertTrue(world.withinBounds(testBoat));		// Make sure boat is still in bounds
			
	}

}
