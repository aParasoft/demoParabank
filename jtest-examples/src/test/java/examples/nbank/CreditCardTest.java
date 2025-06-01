/**
 * 
 */
package examples.nbank;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

/**
 * Parasoft Jtest UTA: Test class for CreditCard
 *
 * @see examples.nbank.CreditCard
 * @author alindsay
 */
public class CreditCardTest {

	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testDisplayStatement() throws Throwable {
		// Given
		int balance = 1; // UTA: configured value
		String id = "12345"; // UTA: configured value
		String securityNumber = "123-45-6789"; // UTA: configured value
		String name = "John Doe"; // UTA: configured value
		String zipcode = "12345"; // UTA: configured value
		String creditCardNumber = "1234-5678-9012-3456"; // UTA: configured value
		CreditCard underTest = new CreditCard(balance, id, securityNumber, name, zipcode, creditCardNumber);

		// When
		assertDoesNotThrow(() -> underTest.displayStatement());

		// Then - assertions for this instance of CreditCard
		assertAll(() -> {
			assertEquals(1, underTest.get_currentBalance());
		}, () -> {
			assertEquals("12345", underTest.get_customerId());
		}, () -> {
			assertEquals("1234-5678-9012-3456", underTest.get_creditCardNumber());
		}, () -> {
			assertEquals("123-45-6789", underTest.get_socialSecurityNumber());
		}, () -> {
			assertEquals("12345", underTest.get_zipcode());
		}, () -> {
			assertEquals("John Doe", underTest.get_customerName());
		});
	}

}
