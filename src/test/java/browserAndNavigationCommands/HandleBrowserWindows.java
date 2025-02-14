package browserAndNavigationCommands;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//navigate().to()
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		Set<String> windowIDS=driver.getWindowHandles();
		
		//approach1 
		List<String> windowList = new ArrayList(windowIDS);
		
		String parentID = windowList.get(0);
		String childID =windowList.get(1);
		
		//switch to child window (we can switch from one browser window to another breowser window
		driver.switchTo().window(childID);
		
		System.out.println(driver.getTitle());
		
		
		//Approach2
//		for(String winId:windowsIDS)
//		{
//			String title =  driver.switchTo().window(winId).getTitle();
//			
//			if(title.equals("OrangeHRM"))
//				System.out.println(driver.getCurrentUrl());
//		}
	}

}
