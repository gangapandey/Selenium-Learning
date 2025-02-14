package staticWebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticWebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		// 1. Total number of rows in a table
		
		// use this method when there is multiple table in a webpage
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		// use only when there is one table in the webpage
		//int rows = driver.findElements(By.tagName("tr")).size();
		
		System.out.println("Number of rows:" + rows);
		
		
		// 2. find total number of columns in a table
		
		// use this method when there is multiple table
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		// use this method when there is single table in webpage
		//int columns = driver.findElements(By.tagName("th")).size();
		System.out.println("NUMBER OF COLUMN: " + columns );
		
		
		// 3. Read data from specific row and column (eg: 5th row and first column)
		//String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println("bookName");
		
		// 4. read data from all the rows and columns
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=columns; c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value + "\t");
				}
				System.out.println();
		}
		
		
		// 5. Print Bookname whose author is Mukesh
		for (int r=2; r<=rows; r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName + "\t" + authorName);
			}
			
		}
		
		
		// 6. find the total price of all the books
		int total=0;
		for(int r=2; r<rows; r++)
		{
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("Total price of the book = " + total);
	}

}
