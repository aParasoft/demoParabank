/**
 * 
 */
package examples.nbank;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

/**
 * Parasoft Jtest UTA: Test class for Account
 *
 * @see examples.nbank.Account
 * @author alindsay
 */
public class AccountTest {

	/**
	 * Parasoft Jtest UTA: Test for apply(ITransaction)
	 *
	 * @see examples.nbank.Account#apply(ITransaction)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testApply() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		ITransaction transaction = mock(ITransaction.class);
		boolean applyResult = false; // UTA: configured value
		when(transaction.apply(nullable(Account.class))).thenReturn(applyResult);
		underTest.apply(transaction);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(0, underTest.getBalance());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for apply(ITransaction)
	 *
	 * @see examples.nbank.Account#apply(ITransaction)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testApply2() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		ITransaction transaction = mock(ITransaction.class);
		int feeResult = 1; // UTA: default value
		when(transaction.fee()).thenReturn(feeResult);
		boolean applyResult = true; // UTA: configured value
		when(transaction.apply(nullable(Account.class))).thenReturn(applyResult);
		underTest.apply(transaction);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(-1, underTest.getBalance());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for getBalance()
	 *
	 * @see examples.nbank.Account#getBalance()
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testGetBalance() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		int result = underTest.getBalance();

		// Then - assertions for result of method getBalance()
		assertEquals(0, result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for getCustomer()
	 *
	 * @see examples.nbank.Account#getCustomer()
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testGetCustomer() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		Customer result = underTest.getCustomer();

		// Then - assertions for result of method getCustomer()
		assertNotNull(result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertEquals(0, underTest.getBalance());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for getID()
	 *
	 * @see examples.nbank.Account#getID()
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testGetID() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		String getSSNResult = "getSSNResult"; // UTA: default value
		when(customer.getSSN()).thenReturn(getSSNResult);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		String result = underTest.getID();

		// Then - assertions for result of method getID()
		assertNotNull(result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(0, underTest.getBalance());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for getStatus()
	 *
	 * @see examples.nbank.Account#getStatus()
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testGetStatus() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		String result = underTest.getStatus();

		// Then - assertions for result of method getStatus()
		assertEquals("silver", result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(0, underTest.getBalance());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testIsOverdrawn() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 0; // UTA: configured value
		boolean result = underTest.isOverdrawn(balance);

		// Then - assertions for result of method isOverdrawn(int)
		assertFalse(result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(0, underTest.getBalance());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testIsOverdrawn2() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		String getNameResult = "getNameResult"; // UTA: default value
		when(customer.getName()).thenReturn(getNameResult);

		String getSSNResult = "getSSNResult"; // UTA: default value
		when(customer.getSSN()).thenReturn(getSSNResult);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);
		String _accountStatusValue = "_accountStatusValue"; // UTA: default value
		setPrivateField(underTest, Account.class, "_accountStatus", _accountStatusValue);

		// When
		int balance = -10000; // UTA: configured value
		boolean result = underTest.isOverdrawn(balance);

		// Then - assertions for result of method isOverdrawn(int)
		assertTrue(result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(0, underTest.getBalance());
		}, () -> {
			assertEquals("_accountStatusValue", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Helper method to set private field _accountStatus
	 */
	private static <T> void setPrivateField(Object object, Class<?> fieldClass, String fieldName, T value) {
		try {
			Field field = fieldClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(object, value);
		} catch (NoSuchFieldException e) {
			throw (AssertionError) new AssertionError("No such field found").initCause(e);
		} catch (IllegalAccessException e) {
			throw (AssertionError) new AssertionError("Unable to access the specified private field").initCause(e);
		} catch (SecurityException e) {
			throw (AssertionError) new AssertionError(
					"There was a security exception when attempting to access a private field").initCause(e);
		}
	}

	/**
	 * Parasoft Jtest UTA: Test for isOverdrawn(int)
	 *
	 * @see examples.nbank.Account#isOverdrawn(int)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testIsOverdrawn3() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		String getNameResult = "getNameResult"; // UTA: default value
		when(customer.getName()).thenReturn(getNameResult);

		String getSSNResult = "getSSNResult"; // UTA: default value
		when(customer.getSSN()).thenReturn(getSSNResult);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);
		String _accountStatusValue = "_accountStatusValue"; // UTA: default value
		setPrivateField(underTest, Account.class, "_accountStatus", _accountStatusValue);

		// When
		int balance = -1; // UTA: configured value
		boolean result = underTest.isOverdrawn(balance);

		// Then - assertions for result of method isOverdrawn(int)
		assertTrue(result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(0, underTest.getBalance());
		}, () -> {
			assertEquals("_accountStatusValue", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for reportToCreditAgency(ICreditAgency)
	 *
	 * @see examples.nbank.Account#reportToCreditAgency(ICreditAgency)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testReportToCreditAgency() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		ICreditAgency agency = mock(ICreditAgency.class);
		boolean reportResult = false; // UTA: default value
		when(agency.report(nullable(Account.class))).thenReturn(reportResult);
		boolean result = underTest.reportToCreditAgency(agency);

		// Then - assertions for result of method reportToCreditAgency(ICreditAgency)
		assertFalse(result);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(0, underTest.getBalance());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for reportToCreditAgency(ICreditAgency)
	 *
	 * @see examples.nbank.Account#reportToCreditAgency(ICreditAgency)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testReportToCreditAgency2() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		ICreditAgency agency = mock(ICreditAgency.class);
		when(agency.report(nullable(Account.class))).thenThrow(IOException.class);
		assertThrows(ConnectionException.class, () -> {
			underTest.reportToCreditAgency(agency);
		});

	}

	/**
	 * Parasoft Jtest UTA: Test for setBalance(int)
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testSetBalanceSilver() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 4999; // UTA: configured value
		underTest.setBalance(balance);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(4999, underTest.getBalance());
		}, () -> {
			assertEquals("silver", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test cloned from
	 * examples.nbank.AccountTest#testSetBalanceSilver()
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testSetBalanceGold() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 6001; // UTA: configured value
		underTest.setBalance(balance);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(6001, underTest.getBalance());
		}, () -> {
			assertEquals("gold", underTest.getStatus());
		});

	}

	/**
	 * Parasoft Jtest UTA: Test cloned from
	 * examples.nbank.AccountTest#testSetBalanceSilver2()
	 *
	 * @see examples.nbank.Account#setBalance(int)
	 * @author alindsay
	 */
	@Test
	@Timeout(value = 5, threadMode = ThreadMode.SEPARATE_THREAD)
	public void testSetBalancePlat() throws Throwable {
		// Given
		Customer customer = mock(Customer.class);
		int initial_balance = 0; // UTA: configured value
		Account underTest = new Account(customer, initial_balance);

		// When
		int balance = 10123; // UTA: configured value
		underTest.setBalance(balance);

		// Then - assertions for this instance of Account
		assertAll(() -> {
			assertNotNull(underTest.getCustomer());
		}, () -> {
			assertEquals(10123, underTest.getBalance());
		}, () -> {
			assertEquals("platinum", underTest.getStatus());
		});

	}
}
