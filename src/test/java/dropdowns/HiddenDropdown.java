package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement usernameField = mywait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))
		);
		usernameField.sendKeys("Admin");
		
				
		WebElement PasswordField = mywait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))
		);
		PasswordField.sendKeys("admin123");
					
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		WebElement pim = mywait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='PIM']"))
		);
		pim.click();
		
		WebElement emplist2 = mywait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Employee List']"))
		);
		emplist2.click();
		
		
		// clicking on dropdown  (write xpath on your own)
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		
		// select single option
		driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		// count number of option
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Number of options: " + options.size());
		
		
		// print all options
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}

}
