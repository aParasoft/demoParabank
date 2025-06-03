/**
 * 
 */
package examples.nbank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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

	}

	@Test
	public void testGetSSN() throws Throwable {
		// Given
		String name = "John Doe"; // UTA: configured value
		String ssn = "123-45-6789"; // UTA: configured value (valid SSN format)
		Customer underTest = new Customer(name, ssn);

		// When
		String result = underTest.getSSN();

		// Then
		assertEquals(ssn, result);
	}

	/**
	 * Parasoft Jtest UTA: Test for setName(String)
	 *
	 * @see examples.nbank.Customer#setName(String)
	 * @author alindsay
	 */
	@Test
	public void testSetName() throws Throwable {
		// Given
		String name = "abcdefghijklmnopqrs"; // UTA: LLM configured value
		String ssn = "123-45-6789"; // UTA: LLM configured value
		Customer underTest = new Customer(name, ssn);

		// When
		String name2 = "John Doe"; // UTA: LLM default value
		underTest.setName(name2);

	}

}
