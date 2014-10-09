import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.MyClass;


public class MidtermTest {

	@Test
	public void testTrue() {
		assertTrue("ReturnTrue failed",MyClass.ReturnTrue());
	}
	
	@Test
	public void testAdd1() {
		assertEquals("AddTwoNumbers failed",MyClass.AddTwoNumbers(1, 2),3);
	}
	
	@Test
	public void testAdd2() {
		assertEquals("AddTwoNumbers failed",MyClass.AddTwoNumbers(10, 2),12);
	}
	
}
