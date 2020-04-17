package com.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxSearchAlgorithmsTest {

	int[] testArray = {4, 10, 3, 7, 4, 1, 6, 2};
	MaxSearchAlgorithms searchAlgh = new MaxSearchAlgorithms(testArray);
	
	@Test
	void testFromRightScan() 
	{
		assertEquals(2, searchAlgh.fromRightScan().get(0));
		assertEquals(6, searchAlgh.fromRightScan().get(1));
		assertEquals(7, searchAlgh.fromRightScan().get(2));
		assertEquals(10, searchAlgh.fromRightScan().get(3));

	}

	@Test
	void testFromLeftScan() 
	{
		assertEquals(4, searchAlgh.fromLeftScan().get(0));
		assertEquals(10, searchAlgh.fromLeftScan().get(1));
	}

	@Test
	void testEvenOddScan() 
	{
		assertEquals(4, searchAlgh.evenOddScan().get(0));
		assertEquals(6, searchAlgh.evenOddScan().get(1));
		assertEquals(10, searchAlgh.evenOddScan().get(2));
	}

}
