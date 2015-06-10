package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.antjunitlog4j.logic.Employee;

public class DemoTest {
	Employee e=new Employee();
	
	@Test
	public void additon(){
		assertEquals("testcase", 3+2, e.addition(3, 2));
	}
}
