package browserAndNavigationCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowserWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		Set<String> windowIDS=driver.getWindowHandles();
		
		for(String windID: windowIDS)
		{
			String title = driver.switchTo().window(windID).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		
		
		
		

	}

}
