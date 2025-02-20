package DataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallelTesting 
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		switch(br.toLowerCase())
		{
		case "chrome": driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver();
		case "firefox" : driver = new FirefoxDriver();
		default: System.out.println("Invalid browser passed"); return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=2)
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
}
