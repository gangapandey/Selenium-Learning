package alertsAndCheckboxes;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();

		// 1. Normal alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();	
		
		Thread.sleep(5000);
		
		Alert myalert = driver.switchTo().alert();
		
		//capturing alert message
		System.out.println(myalert.getText());
		myalert.accept();  
		
		// 2. Confirmation alert
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().accept();    // close alert using ok button
		Alert myalertt = driver.switchTo().alert();
		myalertt.dismiss(); 	//close alert using cancel button
		
		// 3. Prompt alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert mypromptlalert = driver.switchTo().alert();
		Thread.sleep(5000);
		mypromptlalert.sendKeys("Welcome");
		mypromptlalert.accept();
		
		
		
		
		
		
		
		
	}

}
