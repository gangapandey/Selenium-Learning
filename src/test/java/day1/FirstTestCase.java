package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

/*
 1. Launch browser (chrome)
 2. open url "https://demo.opencart.com/"
 3. Validate title should be "Your store"
 4. Close browser
 */

public class FirstTestCase {

	public static void main(String[] args) 
	{
		//1. Launching a browser (chrome)
		// ChromeDriver driver = new ChromeDriver();
		// or
		 WebDriver driver = new ChromeDriver();
		   
		 // edge browser
		 // WebDriver driver = new EdgeDriver();
		
		//friefox browser  (firefox browser should be installed in your system to run it)
		//WebDriver driver = new FirefoxDriver();
		   
		   
		// 2. open url "https://demo.opencart.com/"
		   driver.get("https://demo.opencart.com/");
		   
		// 3. Validate title should be "Your store"
		   String act_title = driver.getTitle()
;
		   if(act_title.equals("Your Store"))
		   {
			   System.out.println("Testcase passed");
		   }
		   else 
		   {
			   System.out.println("Testcase failed"); 
		   }
		   
		  //  4. Close browser
		    driver.close();
		   //driver.quit();
	}

}
