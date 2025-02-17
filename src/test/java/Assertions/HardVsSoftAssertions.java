package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions 
{
	@Test
	void test_hardassertions()
	{
		System.out.println("Testing1");
		System.out.println("Tetsing 2");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("Tetsing 3");
		System.out.println("Tedsting 4");
		
	}
	
	void test_softAssertion()
	{
		System.out.println("Testing1");
		System.out.println("Tetsing 2");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("Tetsing 3");
		System.out.println("Tedsting 4");
		
		sa.assertAll();   //mandatory
	}
	}
