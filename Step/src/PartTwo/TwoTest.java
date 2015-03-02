package PartTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoTest {

	@Test
	public void testBul() {
		boolean act = Two.bul(10);
		assertEquals(false, act);
	}
	public void testBul2() {
		boolean act = Two.bul(11);
		assertEquals(true, act);
	}
	public void testBul0() {
		boolean act = Two.bul(0);
		assertEquals(false, act);
	}

}
