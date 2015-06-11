package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.antjunitlog4j.logic.Employee;

public class DemoTest1 {
	Employee e = new Employee();

	@Test
	public void additon() {
		assertEquals("testcase for addtion expected result 1 output of result"
				+ e.addition(3, 2), 3 - 2, e.addition(3, 2));
	}

	@Test
	public void substraction() {
		assertEquals(
				"testcase for substraction expected result 5 output of result"
						+ e.substraction(3, 2), 3 + 2, e.substraction(3, 2));
	}
}
