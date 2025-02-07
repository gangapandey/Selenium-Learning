package day13;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignments {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		// depature city dropdown
		WebElement drpdwnElem1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select depature = new Select(drpdwnElem1);
		depature.selectByValue("Paris");
		
		// destination city dropdown
		WebElement drpdwnElem2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select destination = new Select(drpdwnElem2);
		destination.selectByValue("London");
		
		// find flight button
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		// choose flight with cheapest price
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		
		int columns =  driver.findElements(By.xpath("//table[@class='table']//td")).size();
		
		// Get all flight prices
		List<WebElement> priceElements =  driver.findElements(By.xpath("//tbody/tr/td[6]"));
		ArrayList<Double> allPricesList = new ArrayList<>();
		
		for (WebElement priceElement : priceElements) 
		{
            String priceText = priceElement.getText().replace("$", "").trim();
            double price = Double.parseDouble(priceText);
            allPricesList.add(price);
            System.out.println(price);
		} 
        
		// lowest price
        double lowestPrice = Collections.min(allPricesList);
           
        for (int r = 1; r <= priceElements.size(); r++) 
        {
        	String priceText1 = driver.findElement(By.xpath("//tbody/tr["+r+"]/td[6]")).getText().replace("$", "").trim();
            double price1 = Double.parseDouble(priceText1);

             if (price1 == lowestPrice) 
             {
            	 driver.findElement(By.xpath("//tbody/tr["+r+"]//td//input[@type='submit']")).click();
                 break; 
              }
           }
          
        
        // name
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Alka Rai");
        
        // address
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("London");
        
        // city
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Manchester");
          
        // State
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Vegas");
        
        // zip code
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("100011");
        
        //card type
        
        
        // creditcard number
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12345678900");
        
        // month
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("08");
        
        //year
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2025");
        
        //name on card
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Alka Rai");
        
        // checklist
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        
        // button
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        }
		
		


	

}
