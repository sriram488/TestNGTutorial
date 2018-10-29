package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG4 {
	@Test	
	public void test1()
	{
		System.out.println("test 1 runs");
	}

	@Test(groups={"smoke"}, enabled = false)
	public void test2()
	{
		System.out.println("test 2 runs");

	}
	
	@Test
	public void sample1()
	{
		System.out.println(" sample 1 runs");

	}
	
	@Test
	public void sample2()
	{
		System.out.println("sample 2 runs");

	}
	
	@BeforeTest
	public void beforeTestExecute()
	{
		System.out.println("before test runs before any test methods");

	}
}
