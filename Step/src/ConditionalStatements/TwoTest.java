package ConditionalStatements;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoTest {

	@Test
	public void testF11() {
		int n = Two.f11(1, -3);
		assertEquals(3, n);
	}
	public void testF112() {
		int n = Two.f11(0, -3);
		assertEquals(5, n);
	}
	public void testF113() {
		int n = Two.f11(-55, -3);
		assertEquals(4, n);
	}
}
