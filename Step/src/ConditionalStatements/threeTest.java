package ConditionalStatements;

import static org.junit.Assert.*;

import org.junit.Test;

public class threeTest {

	@Test
	public void testAs() {
		int[] a={2,-4,6};
		int b=three.as(a);
		assertArrayEquals(8, b);
	}

}
