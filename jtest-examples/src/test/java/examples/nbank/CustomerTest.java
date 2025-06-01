/**
 * 
 */
package examples.nbank;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

/**
 * Parasoft Jtest UTA: Test class for Customer
 *
 * @see examples.nbank.Customer
 * @author alindsay
 */
public class CustomerTest {

	/**
	 * Parasoft Jtest UTA: Test for getName()
	 *
	 * @see examples.nbank.Customer#getName()
	 * @author alindsay
	 */
	@Test
	public void testGetName() throws Throwable {
		// UTA: One or more of the required values have not been automatically set.
		// Review the information about the required modifications below and manually update the missing value(s).
		// 
		// No additional setup needed to cover the code.

		// Given
		String name = "JD"; // UTA: configured value
		String ssn = "123-45-6789"; // UTA: configured value
		Customer underTest = new Customer(name, ssn);

		// When
		String result = underTest.getName();

		// Then - assertions for result of method getName()
		assertEquals("JD", result);

		// Then - assertions for this instance of Customer
		assertAll(() -> {
			assertEquals("JD", underTest.toStrng());
		}, () -> {
			assertEquals("123-45-6789", underTest.getSSN());
		});

	}

	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testGetSSN() throws Throwable {
		// Given
		String name = "John Doe"; // UTA: configured value
		String ssn = "123-45-6789"; // UTA: configured value
		Customer underTest = new Customer(name, ssn);

		// When
		String result = underTest.getSSN();

		// Then - assertions for result of method getSSN()
		assertEquals("123-45-6789", result);

		// Then - assertions for this instance of Customer
		assertEquals("John Doe", underTest.toStrng());

		// Then
		assertEquals(ssn, result);
	}
	
	private String createTestSSNFactory() {
	    return "123-45-6789";
	}

}
