package ExcelUtils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String filePath = System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		
		int rows = ExcelUtil.getRowCount(filePath, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			// 1. Read data from excel
			String princ = ExcelUtil.getCellData(filePath, "Sheet1", i, 0);
			String rateofintrest = ExcelUtil.getCellData(filePath, "Sheet1", i, 1);
			String per1 = ExcelUtil.getCellData(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtil.getCellData(filePath, "Sheet1", i, 3);
			String fre = ExcelUtil.getCellData(filePath, "Sheet1", i, 4);
			String exp_mvalue = ExcelUtil.getCellData(filePath, "Sheet1", i, 5);
			
			//2. Pass above data into the application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
			driver.findElement(By.xpath("//input[@id='intrest']")).sendKeys(rateofintrest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			// validation
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if (Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test passed");
				ExcelUtil.setCellData(filePath, "Sheet1", i, 7, "Passed");
				ExcelUtil.fillGreenColor(filePath, "Sheet1", i,7);
			}
			else
			{
				System.out.println("Test passed");
				ExcelUtil.setCellData(filePath, "Sheet1", i, 7, "Failed");
				ExcelUtil.fillRedColor(filePath, "Sheet1", i,7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5")).click();
		}
		
		driver.quit();
	}

}
