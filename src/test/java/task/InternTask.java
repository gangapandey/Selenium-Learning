package task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternTask {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://baito.tai.com.np/mv/auth/register");
		
		driver.manage().window().maximize();
		
		
		
		//lastname
		driver.findElement(By.cssSelector("input#last-name")).sendKeys("Edward");
		
		//name
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Helen");
		
		//gender
		driver.findElement(By.cssSelector("input#lastNameKatakana")).sendKeys("ララ");
		
		//firstname
		driver.findElement(By.cssSelector("input#firstNameKatakana")).sendKeys("ララ");
		
		//telephone
		driver.findElement(By.cssSelector("input#phone-number")).sendKeys("123456789011");
		
		//email
		driver.findElement(By.cssSelector("input#email-address")).sendKeys("a@a.com");
		
		//choosegender
		driver.findElement(By.cssSelector("button[value='female']")).click();
		
		//datepicker
		//driver.findElement(By.xpath("//button[@type='button'])[10]")).click();
		
		//WebElement dateBox = driver.findElement(By.cssSelector("label[for='dob']"));
		
		//dateBox.sendKeys("20250101");
		
		//driver.findElement(By.cssSelector("label#:r1n:-label")).click();
		
		//upload image
		WebElement uploadElement = driver.findElement(By.cssSelector("input[type='file']"));
		uploadElement.sendKeys("C:\\Users\\ASUS Vivobook\\Downloads\\test.jpg");
		
		//telephone
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("1000000");
		
		//streetnumber
		driver.findElement(By.xpath("//input[@id='streetNumber']")).sendKeys("100-0005 Tokyo, Chiyoda City, Marunouchi 1-1-1");
		
		//button[normalize-space()='Register Now']
		//Register
		driver.findElement(By.xpath("//button[normalize-space()='Register Now']")).click();
		


	}

}
