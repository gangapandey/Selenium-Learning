package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframesdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		//WebDriverWait mywait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
	
		// Passing frame as web element.
		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		driver.switchTo().frame(frame1);   
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello world");
		
		// Go back to page from iframe
		
		driver.switchTo().defaultContent(); 
		

		// Frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		
		// Frame 3
		WebElement frame3 = driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		// inner frame - part of frame 3
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent();
		
		
		//frame4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Automation");

		driver.switchTo().defaultContent(); // go back to main page
		
		//frame 5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.name("mytext5")).sendKeys("welcome");
		
		driver.findElement(By.linkText("https://a9t9.com")).click();
		
		// driver.switchTo().defaultContent();

		Thread.sleep(5000);

		WebElement logo = driver.findElement(By.xpath("//a[@id='logo']"));

		if (logo.isDisplayed()) {
			System.out.println("yes logo presence in the inner frame");
		} 
		else 
		{
			System.out.println("Logo is not displayed in the inner frame");
		}



	}

}
