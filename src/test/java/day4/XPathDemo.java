package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//xpath with the single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mobile");
		
		//xpath with the multiple attributes
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Mobile");
		
		//xpath with and or not operators
		driver.findElement(By.xpath("//input[@name='search'or @placeholder='Search']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@name='search'and @placeholder='Search']")).sendKeys("Mobile");
		
		//xpath with text() -- innertext
		driver.findElement(By.xpath("//*[text()='Desktops']")).click();
		
		boolean displayStatus = driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
		System.out.println(displayStatus);
		
		String value = driver.findElement(By.xpath("//*[text()='Featured']")).getText();
		System.out.println(value);
		
		//xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		//xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirts");
		
		//chained xpath
		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(status);
		
		

		

	}

}
