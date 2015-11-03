package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Models.Boat;
import Models.Fish;
import Models.Tree;

public class TreeTests {

	@Test
	public void test() {

		Tree testTree = new Tree();
		Boat mockBoat = new Boat();
		
		assertTrue(mockBoat.collision(testTree));
	}

}
