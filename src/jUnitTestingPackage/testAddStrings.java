package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		junitFunction junitString=new junitFunction();
		String result=junitString.addString("capstone","project ");
	assertEquals("capstoneproject ",result);
	}

}
