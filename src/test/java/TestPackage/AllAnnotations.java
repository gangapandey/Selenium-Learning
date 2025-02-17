package TestPackage;

import org.testng.annotations.*;

public class AllAnnotations 
{
	@BeforeSuite
	void bs()
	{
		System.out.println("This is BeforeSuite method ");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is AfterSuite method ");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is BeforeClass method ");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is AfterClass method ");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is Beforetest method ");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This isAftertest method ");
	}
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is Before method");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is after method");
	}
	
	@Test
	void abc()
	{
		System.out.println("This is abc from c1");
	}
	
	@Test
	void xyz()
	{
		System.out.println("This is xyz from c2");
	}
}
