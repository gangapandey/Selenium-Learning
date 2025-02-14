package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//tag id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//tag class
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		
		//tag attributes
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		
		//tag class attributes
		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");
		
		

	}

}
