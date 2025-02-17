package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 
{
	@Test
	void xyz()
	{
		System.out.println("This is xyz from c2");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This isAftertest method ");
	}
}
