package jUnit;

import static org.junit.Assert.*;


import org.junit.Test;

public class JUnitTest {
	
	@Test
	public void testSum1() {
		int val = JUnit.add(4, 9);
		assertEquals(val, 13);
	}
	
	@Test
	public void testSum2() {
		int val = JUnit.add(3, 2);
		assertEquals(val, 9);
	}
	
	@Test
	public void testSub1() {
		int val = JUnit.sub(45, 27);
		assertSame(val, 18);
	}
	
	@Test
	public void testSub2() {
		int val = JUnit.sub(5, 3);
		assertEquals(val, 4);
	}
	
	@Test
	public void testMult1() {
		int val = JUnit.mult(4, 7);
		assertEquals(val, 28);
	}
	
	@Test
	public void testMult2() {
		int val = JUnit.mult(15, 7);
		assertEquals(val, 130);
	}
	
	@Test
	public void testDiv1() {
		int val = JUnit.div(9, 3);
		assertEquals(val, 3);
	}
	
	@Test
	public void testDiv2() {
		int val = JUnit.div(25, 5);
		assertEquals(val, 8);
	}
	
	@Test
	public void testDiv3() {
		int val = JUnit.div(2, 0);
		assertEquals(val, 13);
	}

	@Test
	public void testBoolean() {
		boolean val = JUnit.login(true);
		assertTrue(val);
	}
	
	@Test
	public void testNull() {
		String val = null;
		assertNull(val);
	}
	
	@Test
	public void testSame() {
		int val1 = 5;
		int val2 = 6;
		assertSame(val1, val2);

	}
	
	@Test
	public void testArrayEquals1() {
		
		int[] familyAges = {2,4,44,45};
		assertArrayEquals(familyAges, new int[]{2,4,44,45});
	}
	
	@Test
	public void testArrayEquals2() {

		int[] numberOfHotDogs = {1,2,2,3};
		assertArrayEquals(numberOfHotDogs, new int[]{2,3,4,5});
	}
	
	@Test
	public void testBoolean2() {
		boolean val = JUnit.login(false);
		assertFalse(val);
	}
	
	@Test
	public void testNotNull() {
		Object nullObject = null;
		assertNotNull(nullObject);
	}
	
	@Test
	public void testnotSame() {
		int val1 = 8;
		int val2 = 4;
		assertNotSame(val1, val2);
	}
}
