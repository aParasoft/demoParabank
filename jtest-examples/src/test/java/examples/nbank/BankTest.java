/**
 * 
 */
package examples.nbank;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for Bank
 *
 * @see examples.nbank.Bank
 * @author alindsay
 */
public class BankTest {

	/**
	 * Parasoft Jtest UTA: Test for getAccount(String, String)
	 *
	 * @see examples.nbank.Bank#getAccount(String, String)
	 * @author alindsay
	 */
	@Test
	public void testGetAccount() throws Throwable {
		// Given
		Bank underTest = new Bank();

		// When
		String id = "id"; // UTA: default value
		String name = "name"; // UTA: default value
		Account result = underTest.getAccount(id, name);

		// Then - assertions for result of method getAccount(String, String)
		assertNull(result);

		// Then - assertions for result of method getAccount(String, String)
		assertNull(result);

		// Then
		// assertNotNull(result);
	}
}
