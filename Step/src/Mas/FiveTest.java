package Mas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveTest {

	@Test
	public void testAs() {
		int mas []= {5,6,2,6,4,2};
		int act = Five.as(mas);
		assertEquals(14, act);
	}
	public void testAs2() {
		int mas []= {5,6};
		int act = Five.as(mas);
		assertEquals(6, act);
	}
	public void testAs1() {
		int mas []= {5};
		int act = Five.as(mas);
		assertEquals(0, act);
	}
	public void testAs0() {
		int mas []= {};
		int act = Five.as(mas);
		assertEquals(0, act);
	}

}
