import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 5678;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 6912;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 5678;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 4444;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		int a = 57;
		int b = 28;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 1596;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 240;
		int b = 12;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 20;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivideWithDenominator() {
		//fail("Not yet implemented");
		try {
			int a = 34;
			int c = 0;
			
			Calculator cal = new Calculator();
			cal.divide(a, c);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		}catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}

