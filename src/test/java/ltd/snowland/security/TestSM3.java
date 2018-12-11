package ltd.snowland.security;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import ltd.snowland.utils.NumberTool;

/**
 * @author A.Star
 *
 */

/**
 * Unit test for simple App.
 */
public class TestSM3 extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public TestSM3(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(TestSM3.class);
	}

	/**
	 * Rigourous Test :-)
	 * @throws Exception 
	 */
	public void test_abc() throws Exception {
		String str = "abc";
		String expected = "66C7F0F462EEEDD9D1F2D46BDC10E4E24167C4875CF2F7A2297DA02B8F4BA8E0".toLowerCase();
		assertEquals(expected, SM3.hashHex(str));
	}
	
}