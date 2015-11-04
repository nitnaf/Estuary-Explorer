package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Models.Boat;
import Models.Fish;

public class FishTests {

	@Test
	public void test() {
		
		Fish testFish = new Fish();
		Boat mockBoat = new Boat();
		
		assertTrue(mockBoat.collision(testFish));
	}

}
