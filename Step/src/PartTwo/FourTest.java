package PartTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FourTest {

	@Test
	public void testFact() {
		int act = Four.fact(4);
		assertEquals(24, act);
	}
	public void testFact0() {
		int act = Four.fact(0);
		assertEquals(1, act);
	}
	public void testFact1() {
		int act = Four.fact(1);
		assertEquals(1, act);
	}
	public void testFactm1() {
		int act = Four.fact(-1);
		assertEquals(1, act);
	}
	public void testFact3() {
		int act = Four.fact(3);
		assertEquals(6, act);
	}

}
