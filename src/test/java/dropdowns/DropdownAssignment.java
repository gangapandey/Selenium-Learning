package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownAssignment {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		// Task 1
		/*
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		driver.manage().window().maximize();
		
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpdwn = new Select(drpdown);
		
		drpdwn.selectByValue("France");
		
		List<WebElement> options = drpdwn.getOptions();
		System.out.println("Number of options: " + options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		*/
		
		
		// Task 2
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='colors']"));
		for(WebElement op:options)
		{
			String option = op.getText();
			if(op.getText().equals("Red") || op.getText().equals("Blue") || op.getText().equals("Green"))
				{
					op.click();
				}
		}
		
		
		
		
		
		

	}

}
