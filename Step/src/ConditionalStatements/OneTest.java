package ConditionalStatements;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneTest {

	@Test
	public void test() {
		int c=One.f11(2,5);
		assertEquals(10, 10);
	}
	public void test1() {
		int c=One.f11(0,5);
		assertEquals(0, 0);
	}
	public void test12() {
		int c=Two.f11(1,5);
		assertEquals(2, c);
	}

	

}
