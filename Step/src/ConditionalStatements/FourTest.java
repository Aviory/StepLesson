package ConditionalStatements;

import static org.junit.Assert.*;

import org.junit.Test;

public class FourTest {

	@Test
	public void testTotal() {
		int c = Four.total(2, -1, 5);
		assertEquals(9, c);
	}
	public void testTotal1() {
		int c = Four.total(2, -1, 0);
		assertEquals(4, c);
	}

}
