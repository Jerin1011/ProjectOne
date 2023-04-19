package test.testNG;

import org.base.testNGBaseClass;
import org.testng.annotations.Test;

public class TestClass1 extends testNGBaseClass{

	@Test(groups = "smoke")
	public void testMethod1() {
		System.out.println("******TestMethod1 - Testclass1");
	}

	@Test(groups = {"smoke","regression"})
	public void testMethod2() throws Exception {
		System.out.println("******TestMethod2 - Testclass1");
		throw new Exception("my error");
	}

	@Test(alwaysRun = true)
	public void testMethod3() {
		System.out.println("******TestMethod3 - Testclass1");
	}
	
	@Test(dependsOnMethods = "testMethod3")
	public void testMethod4() {
		System.out.println("******TestMethod4 - Testclass1");
	}

}
