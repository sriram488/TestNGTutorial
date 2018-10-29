package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SampleTestNG3 {
	@Test	
	public void test1()
	{
		System.out.println("test 1 runs");
	}

	@Test(groups={"smoke"})
	public void test2()
	{
		System.out.println("test 2 runs");

	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test runs after all the test methods");

	}
	
	@AfterMethod
	public void beforeMethodtest()
	{
		System.out.println("after method test runs after all the test methods are run in the class");

	}
}
