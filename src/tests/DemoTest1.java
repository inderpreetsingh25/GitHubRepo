package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.antjunitlog4j.logic.Employee;

public class DemoTest1 {
		Employee e=new Employee();
		
		@Test
		public void additon(){
			assertEquals("testcase fails expected 6 but gives "+e.addition(3,2), 3+3, e.addition(3, 2));
		}
	}
