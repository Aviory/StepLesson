package PartTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class OneTest {

	@Test
	public void testAs() {
		int []mas=new int [99];
		int []act=One.as(mas);
		int []res={2450,50};
		assertArrayEquals(res, act);
	}

}
