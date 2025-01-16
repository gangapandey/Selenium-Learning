package day7;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	//Selecting future date
	static void SelectFutureDate(WebDriver driver, String month, String year, String date)
	{
		//secting month and year
		while(true)
			{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
					
			if (currentMonth.equals(month) && currentYear.equals(year))
				{
					break;
				}
				//next-button
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  //next button
			}			
			List<WebElement> allDates = (List<WebElement>) driver.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//tbody//tr//td"));
					
			for (WebElement dt:allDates)
			{
				if (dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			}
		}
	
		//Selecting past date
		static void SelectPastDate(WebDriver driver, String month, String year, String date)
		{
			//secting month and year
			while(true)
			{
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				String currentYear = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-year']")).getText();
						
				if (currentMonth.equals(month) && currentYear.equals(year))
				{
					break;
				}
					
				//previous-button
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}			
			List<WebElement> allDates = (List<WebElement>) driver.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//tbody//tr//td"));
						
			for (WebElement dt:allDates)
			{
				if (dt.getText().equals(date))
				{
					dt.click();
					break;
				}
			} 
		}
		
	
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Method 1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2025");
		
		
		//Method2 :  using datepicker
		//whatever is appeared on the webpage everything is in string format
	
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens datepicker
		
		String month = "March";
		String year = "2025";
		String date = "28";
		
		SelectFutureDate(driver,month, year, date);
		
		
			
		}
		
		
		
	}


