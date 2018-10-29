package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestNG {

@Test
@Parameters({"URL"})	
public void testURL(String urlName)
{
	System.out.println("test 1 runs");
	System.out.println(urlName);
}

@Test(groups={"smoke"})
public void test2()
{
	System.out.println("test 2 runs");

}

@Test(dataProvider = "getData")
public void dataProviderTest(String username, String pwd)
{
	System.out.println(username);
	System.out.println(pwd);

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

@DataProvider
public Object[][] getData()
{
	
	// login credentials with 3 users and 2 parameters username and password
	Object[][] data = new Object[3][2];
	//first user
	data[0][0]="FirstUsername";
	data[0][1]="FirstUserpwd";
    //second user
	data[1][0]="SecondUsername";
	data[1][1]="SecondUserpwd";
    // third user
	data[2][0]="ThirdUsername";
	data[2][1]="ThirdUserpwd";

	return data;
	

}

}
