package com.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.code.codeLogic;

public class codeTesting {
	@Test
	void testMax() {
		codeLogic cl = new codeLogic();
		int res = cl.max(10, 20);
		Assertions.assertEquals(20, res);
	}

	@Test
	void testMax2() {
		codeLogic cl = new codeLogic();
		int res = cl.max(10, 20);
		Assertions.assertNotEquals(30, res);
	}

	@Test
	void testIsEven() {
		codeLogic cl = new codeLogic();
		boolean res = cl.isEven(10);
		Assertions.assertTrue(res);
	}

	@Test
	void testIsEven1() {
		codeLogic cl = new codeLogic();
		boolean res = cl.isEven(15);
		Assertions.assertFalse(res);
	}

	@Test
	void testGetValue2() {
		codeLogic codeLogic = new codeLogic();
		String res = codeLogic.getValue(104);

		Assertions.assertNull(res);
	}

	@Test
	void testGetValue1() {
		codeLogic codeLogic = new codeLogic();
		String res = codeLogic.getValue(102);

		Assertions.assertNotNull(res);
	}

	@Test
	void testGetString() {
		codeLogic codeLogic = new codeLogic();
		String res1 = codeLogic.getString();
		String res2 = "Hello";

		Assertions.assertSame(res1, res2);
	}

	@Test
	void testPrintStringLength() {
		codeLogic codeLogic = new codeLogic();

		Assertions.assertThrows(NullPointerException.class, () -> {
			codeLogic.printStringLength(null);
		});
	}

	@Test
	void testSortArray() {
		codeLogic codeLogic = new codeLogic();
		int[] input = { 5, 2, 8, 1, 3 };
		int[] expected = { 1, 2, 3, 5, 8 };
		int[] actual = codeLogic.sortArray(input);
		Assertions.assertArrayEquals(expected, actual);
	}
}
