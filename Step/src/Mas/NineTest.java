package Mas;

import static org.junit.Assert.*;

import org.junit.Test;

public class NineTest {

	@Test
	public void testBubble() {
		 int[] a= {2,7,3,1};
		 int[] act=Nine.Bubble(a);
		 int[] exp = {1,2,3,7};
		assertArrayEquals(exp, act);	
	}
	public void testBubble1() {
		 int[] a= {2,-7,3,0};
		 int[] act=Nine.Bubble(a);
		 int[] exp = {-7,0,2,3};
		assertArrayEquals(exp, act);	
	}
	public void testSelect() {
		 int[] a= {2,-7,3,0};
		 int[] act=Nine.Select(a);
		 int[] exp = {-7,0,2,3};
		assertArrayEquals(exp, act);	
	}

	

}
