package locatorss;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayStatus);
		
		//linkText
		driver.findElement(By.linkText("Tablets")).click();
		
		//Partial LinkText
		driver.findElement(By.partialLinkText("blets")).click();
		
		//className
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total number of header links:" + headerLinks.size());
		
		//tagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " + links.size());
		
		// capture total number of images in a page
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:" + img.size());
		
		
		// ---------------------------  Demoblaze ---------------
		
		driver.get("https://www.demoblaze.com/"); 
		
		List<WebElement> linkss = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in a page:" + linkss.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images in a page: " + images.size());
		
		driver.findElement(By.linkText("Phones")).click();
		

	}

}
