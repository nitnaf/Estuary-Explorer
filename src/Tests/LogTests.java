package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Models.Boat;
import Models.Fish;
import Models.Log;
import Models.Sample;

public class LogTests {

	@Test
	public void test() {
		
		Log testLog = new Log();
		Boat mockBoat = new Boat();
		
		assertTrue(mockBoat.collision(testLog));
	}

}
