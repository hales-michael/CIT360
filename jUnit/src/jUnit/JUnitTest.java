package jUnit;

import static org.junit.Assert.assertEquals;
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
		assertEquals(val, 18);
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

}
