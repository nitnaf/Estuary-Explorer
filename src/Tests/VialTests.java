package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Tools.Vial;

public class VialTests {

	@Test
	public void test() {
		
		Vial testVial = new Vial();
		
		testVial.setEquipped(false);
		assertFalse(testVial.sampleCollected());
		
		testVial.setFull(true);
		assertFalse(testVial.sampleCollected());
		
	}

}
