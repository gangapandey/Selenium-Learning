package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		
		// open all the option
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		
		// select one value
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		
		//capture all the option and find the size
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("Number of options: " + options.size());
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		
		//selecting multiple options from checkbox
		for(WebElement op:options)
		{
			String option = op.getText();
			if(op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("MYSQL"))
			{
				op.click();
			}
		}
	}

}
