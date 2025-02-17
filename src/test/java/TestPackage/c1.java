package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 
{
	@Test
	void abc()
	{
		System.out.println("This is abc from c1");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is Beforetest method ");
	}
}
