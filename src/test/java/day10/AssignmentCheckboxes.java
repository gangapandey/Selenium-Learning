package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentCheckboxes {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//WebDriverWait mywait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//selecting one checkbox
		//driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		
		//secting all the checkboxes
		
		List<WebElement> checkboxes  = driver.findElements(By.xpath("//tbody//input[@type='checkbox']"));
		for(int i = 0; i< checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}

	}

}
