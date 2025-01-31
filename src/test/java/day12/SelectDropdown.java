package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement drpCountryElem = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select (drpCountryElem);
		
		// select option from the dropdown
		
		// 1. selectByValue
		//drpCountry.selectByValue("Japan");
		
		// 2. selectByVisibleText
		//drpCountry.selectByVisibleText("France");
		
		// 3.selectByIndex
		//drpCountry.selectByIndex(2);
		
		// find total number of options in dropdown
		
		List<WebElement> options = drpCountry.getOptions();
		System.out.println("Number of options : " + options.size());
		
		for(int i=0; i< options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
		// Enhanced for-loop
		/*
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		*/
	}

}
