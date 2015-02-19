package function;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneTest {

	@Test
	public void testDay() {
		String s =One.Day(3);
		assertEquals("Tursday", s);
	}
	public void testDay2() {
		String s =One.Day(0);
		assertEquals("intcorrect day ", s);
	}
	public void testDay3() {
		String s =One.Day(-3);
		assertEquals("intcorrect day ", s);
	}
	public void testDay4() {
		String s =One.Day(5);
		assertEquals("Friday", s);
	}

}
