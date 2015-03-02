package PartTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveTest {

	@Test
	public void testAs() {
		int n = Five.as(705);
		assertEquals(12, n);
	}
	public void testAs0() {
		int n = Five.as(0);
		assertEquals(0, n);
	}
	public void testAsm1() {
		int n = Five.as(-1);
		assertEquals(1, n);
	}

}
