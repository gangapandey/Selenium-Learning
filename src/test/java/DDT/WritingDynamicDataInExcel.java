package DDT;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataInExcel {

	public static void main(String[] args) throws IOException 
	{
		//Dynamically capturing data means accepting data from the user at runtime.
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile_dynamic.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows?");
		int NoOfRows = sc.nextInt();
		
		System.out.println("How many cells?");
		int NoOfCells = sc.nextInt();
		
		for(int r=0; r<=NoOfRows; r++)
		{
			XSSFRow currentRow = sheet.createRow(r);
			
			for(int c=0; c<NoOfCells; c++)
			{
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);  //attach workbook to file
		workbook.close();
		file.close();
		
		System.out.println("File created dynamically");

	}

}
