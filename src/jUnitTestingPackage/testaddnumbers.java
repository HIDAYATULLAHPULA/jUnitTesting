package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		junitFunction junit=new junitFunction();
	  int result=junit.addNumbers(100, 200);
	assertEquals(300,result);
	}

}
