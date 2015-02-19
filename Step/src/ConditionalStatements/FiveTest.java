package ConditionalStatements;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiveTest {

	@Test
	public void testAffm1F() {
		String c = Five.aff(-1);
		assertEquals("F", c);
	}
	public void testAff0F() {
		String c = Five.aff(0);
		assertEquals("F", c);
	}
	public void testAff10F() {
		String c = Five.aff(10);
		assertEquals("F", c);
	}
	public void testAff19F() {
		String c = Five.aff(19);
		assertEquals("F", c);
	}
	public void testAff20_E() {
		String c = Five.aff(20);
		assertEquals("E", c);
	}
	public void testAff30E() {
		String c = Five.aff(30);
		assertEquals("E", c);
	}
	public void testAff39_E() {
		String c = Five.aff(39);
		assertEquals("D", c);
	}
	public void testAff40_D() {
		String c = Five.aff(40);
		assertEquals("D", c);
	}
	public void testAff50_D() {
		String c = Five.aff(50);
		assertEquals("D", c);
	}
	public void testAff59_D() {
		String c = Five.aff(59);
		assertEquals("D", c);
	}
	public void testAff60_C() {
		String c = Five.aff(60);
		assertEquals("C", c);
	}
	public void testAff67_C() {
		String c = Five.aff(67);
		assertEquals("C", c);
	}
	

}
