package conditionalAndGetMethods;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =  new ChromeDriver();
		
		//get(url) - open url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	   //getTitle() - returns title of page
		System.out.println(driver.getTitle()); 
		
		//getCurrentUrl() - returns url of page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page.
        System.out.println(driver.getPageSource());
        
        //getWindowHandle()- returns ID of the single Browser window.
        String windowId = driver.getWindowHandle();
        System.out.println("Window ID = " + windowId);
		
		//getWindowsHandles()- returns ID's of the multiple browser windows.
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser window
        Set<String> windows =  driver.getWindowHandles();
        System.out.println(windows);
        
        //driver.close(); //only close one browser window at a time
        
        driver.quit(); //close all n number of browser windows at once

	}

}
