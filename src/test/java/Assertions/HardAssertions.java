package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions

// Hard assertions are the methods that we can  directly acess from the assert class.

{
	@Test
	void testTitle()
	{
		String exp_title = "Opencart";
		String act_title = "Openshot";
		
		
		// 1. Assert.assertEquals
		Assert.assertEquals(exp_title, act_title);
		
		
		// 2. Assert.assertNotEquals
		Assert.assertNotEquals(123, 123);
		
		
		// 3. Assert.assertTrue    
		if(exp_title.equals(act_title))
		{
			System.out.println("Test passed");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Test failed");
			Assert.assertTrue(false);
		}
		
		
		// 4. Assert.assertFalse
		Assert.assertFalse(1==2);    //pass
		Assert.assertFalse(1==1);    //fail
		
		
		// 5. Assert.fail()
		Assert.fail();
	}

}
