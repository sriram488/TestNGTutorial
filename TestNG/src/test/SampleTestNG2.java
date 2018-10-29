package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTestNG2 {
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
	
	@BeforeSuite
	public void beforeSuiteTest()
	{
		System.out.println("before suite runs before all the test cases are run in the suite");

	}
	
	
}
