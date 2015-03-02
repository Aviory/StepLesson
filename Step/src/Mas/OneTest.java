package Mas;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneTest {

	@Test
	public void testAs() {
		int[] m = {-31,2,-6,4,5,10,18,-11};
		int[] act=One.as(m);
		int[] b={-31,18};
		assertArrayEquals(b, act);
	}
	public void testAs2() {
		int[] m = {-31,2};
		int[] act=One.as(m);
		int[] b={-31,2};
		assertArrayEquals(b, act);
	}
	public void testAs1() {
		int[] m = {-31};
		int[] act=One.as(m);
		int[] b={-31,-31};
		assertArrayEquals(b, act);
	}
	public void testAs10() {
		int[] m = {};
		int[] act=One.as(m);
		int[] b={0,0};
		assertArrayEquals(b, act);
	}

}
