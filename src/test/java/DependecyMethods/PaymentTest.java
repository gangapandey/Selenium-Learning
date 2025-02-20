package DependecyMethods;

import org.testng.annotations.Test;

public class PaymentTest 
{
	@Test(priority=1, groups = {"sanity", "regressional", "functional"})
	void PaymentByRupees()
	{
		System.out.println("Payment in rupees");
	}
	
	@Test(priority=2, groups = {"sanity", "regressional","functional"})
	void PaymentByDollars()
	{
		System.out.println("Payment in dollars");
	}
}
