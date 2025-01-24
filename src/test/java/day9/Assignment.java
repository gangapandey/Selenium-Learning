package day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]//a"));
		
		List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]//a"));

		
		for(WebElement link:links)
		{
			link.click();
		}
		
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);
		
		List<String> window = new ArrayList(windowIds);
		
		for(String windows: window) 
		{
			String title = driver.switchTo().window(windows).getTitle();
			if(title.equals("Selenium in biology - Wikipedia"))
				driver.close();
		}
		
	}

}
