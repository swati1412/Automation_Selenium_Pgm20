package Java_Package;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {

		// Specify the location of excel file
		File src = new File("C:\\Users\\QUIKCARE COMPUTERS\\Desktop\\TC_gmail.xlsx");

		// Load the file
		FileInputStream fis = new FileInputStream(src);

		// Load the work book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	

		// Laod Work Sheet
		XSSFSheet sh = wb.getSheet("Sheet1");

		// Print the loaded sheet name
		System.out.println(sh.getSheetName());

		// Print Test Cases of gmail from Excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

		// Print Project Name Whattsapp: from Excel Sheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());

		// Print Gmail Account from Excel Sheet
		System.out.println(sh.getRow(2).getCell(2).getStringCellValue());

		// Print float/double value from excel sheet
		System.out.println(sh.getRow(4).getCell(2).getNumericCellValue());

		// Print int value from excel sheet
		System.out.println((int) sh.getRow(4).getCell(2).getNumericCellValue());

		// print total number of rows
		System.out.println("Total Rows: " + sh.getPhysicalNumberOfRows());

		// print total number of columns
		System.out.println("Total Columns: " + sh.getRow(2).getLastCellNum());
		
		

		// Real Time Implementation
		System.setProperty("webdriver.chrome.driver",
			    "C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String s = sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("name")).sendKeys("swati");

	}

}

