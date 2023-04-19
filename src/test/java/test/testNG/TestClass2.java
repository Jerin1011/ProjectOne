package test.testNG;

import org.base.testNGBaseClass;
import org.testng.annotations.Test;

public class TestClass2 extends testNGBaseClass{

	@Test
	public void testMethod1() {
		System.out.println("******TestMethod1 - Testclass2");
	}

	@Test
	public void testMethod2() throws Exception {
		System.out.println("******TestMethod2 - Testclass2");
		throw new Exception("my error");
	}

	@Test
	public void testMethod3() {
		System.out.println("******TestMethod3 - Testclass2");
	}
	@Test
	public void testMethod4() {
		System.out.println("******TestMethod4 - Testclass1");
	}

}
