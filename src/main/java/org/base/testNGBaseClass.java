package org.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class testNGBaseClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BS");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BC");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BM");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("AM");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AC");
	}

	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("AS");
	}

}
