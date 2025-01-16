package day6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		
		//isDisplayed()
		//first-approach
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo: " + logo.isDisplayed());
		
		//second-approach
		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		
		//isEnabled()
		boolean checke = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(checke);
		
		//isSelected()
		boolean checkselect = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println(checkselect);
	}

}
