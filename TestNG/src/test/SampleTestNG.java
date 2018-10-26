package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNG {

@Test	
public void test1()
{
	System.out.println("test 1 runs");
}

@Test
public void test2()
{
	System.out.println("test 2 runs");

}

@AfterSuite
public void afterSuitetest()
{
	System.out.println("after suite test runs after all the tests in the suite are run");

}

@BeforeMethod
public void beforeMethodtest()
{
	System.out.println("before method test runs before all the test methods are run in the class");

}
}
