package day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestDropdownn {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");

		Thread.sleep(5000);
		
		List <WebElement> listt = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println(listt.size());
		
		for(int i=0; i<listt.size(); i++)
		{
			System.out.println(listt.get(i).getText());
			if(listt.get(i).getText().equals("selenium"))
			{
				listt.get(i).click();
				break;
			}
			
		}

	}

}
