package DependecyMethods;

import org.testng.annotations.Test;

public class SignupTest 
{
	@Test(priority=1, groups = {"regression"})
	void signupByEmail()
	{
		System.out.println("signup By Email");
	}
	
	@Test(priority=2, groups = {"regression"})
	void signupByFacebook()
	{
		System.out.println("signup By Facebook");
	}
	
	@Test(priority=3, groups = {"regression"})
	void signupByInsta()
	{
		System.out.println("signup By Insta");
	}
}
