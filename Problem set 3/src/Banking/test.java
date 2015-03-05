package Banking;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {


	@Test
	public void test() throws InsufficientFundsException {
		Account testAccount = new Account(1122, 20000);
		double withAmount = 17500;
		double depAmount = 20500;
		double delta = .0001;
		testAccount.withdraw(2500);
		assertEquals(withAmount, testAccount.getBalance(), delta);
		testAccount.deposit(3000);
		assertEquals(depAmount, testAccount.getBalance(), delta);
		//Everything passes with overdraw commented out.
		//I don't know how to 'test' and exception
		testAccount.withdraw(30000);
	}
}
