package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Models.Boat;
import Models.Fish;
import Models.Sample;

public class SampleTests {

	@Test
	public void test() {
		
		Sample testSample = new Sample();
		Boat mockBoat = new Boat();
		
		assertTrue(mockBoat.collision(testSample));
		
	}

}
