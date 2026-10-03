package com.projectName.genricPage;



import org.testng.ITestResult;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;


public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();

	}

	// get text of any webElement and verify
	public void getTextOfWebElementAndVerify(String webElementKey, String testData) {
		String actualTextOfWebElement = driver.findElement(By.xpath(pro2.getProperty(webElementKey))).getText();
		String expectedTextOfWebElement = pro3.getProperty(testData);
		Assert.assertEquals(actualTextOfWebElement, expectedTextOfWebElement);
		System.out.println("Verified successfully Actual Webelement Text:" + actualTextOfWebElement + " || "
				+ "Expected webelement text" + expectedTextOfWebElement);

	}

		// click Web Element
	public void clickWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).click();

	}

	// click list of web Element
	public void clickListOfWebElement(String webElementKey, String testdata) {
		List<WebElement> listOfElements = driver.findElements(By.xpath(pro2.getProperty(webElementKey)));
		for (int i = 0; i < listOfElements.size(); i++) {
			if (listOfElements.get(i).getText().equalsIgnoreCase(pro3.getProperty(testdata))) {
				listOfElements.get(i).click();
			}
		}
	}

	// clear web element
	public void clearWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).click();
	}

	// enterData
	public void enterData(String WebElementKey, String testData) {
		driver.findElement(By.xpath(pro2.getProperty(WebElementKey))).sendKeys(pro3.getProperty(testData));

	}

	// Mouse Hover
	public void moveToElement(String WebElementKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(pro2.getProperty(WebElementKey)))).build().perform();
	}

	// select dropdown value using visible text
	public void selectDropdownValue(String WebElementKey, String testData) {
		WebElement ele = driver.findElement(By.xpath(pro2.getProperty(WebElementKey)));
		Select WebElem = new Select(ele);
		WebElem.selectByContainsVisibleText(pro3.getProperty(testData));

	}

	// Read excel file
	public void readExcelData(String WebElementKey, int rowNo, int coloumnNo, String excelSheetName)
			throws IOException {
		File src = new File(".src\\com\\projectName\\resources\\TC_gmail.xlsx.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(pro1.getProperty(excelSheetName));
		String abc = sh.getRow(rowNo).getCell(coloumnNo).getStringCellValue();
		driver.findElement(By.xpath(pro2.getProperty(WebElementKey))).sendKeys(abc);

	}

	// Handle ExplicitWait - elementTobeClicakbel
	public void explicitWait_elementTobeClicakbel(String WebElementKey) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(pro2.getProperty(WebElementKey)))).click();
	}

	// Handle log file
	public void handleLogger(String logClassName, String loggerText) {
		Logger logger = Logger.getLogger(logClassName);
		PropertyConfigurator.configure(pro1.getProperty("log4JPropertiesFileLoc"));
		logger.info(loggerText);
	}

	// Capture scrrenshot
	 public void captureScrrenshot(ITestResult result)throws Exception{
	 if(ITestResult.FAILURE==result.getStatus())
	 {
	// create ref Of takeScreenshot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;
	 
	//Use getScreenshotAs() to capture the screenshot in file format
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	
		 //Copy file to specific location
		 File destFolder = new File("./scrrenshots/" + result.getName()+ ".png");
		 FileUtils.copyFile(sourceFile,destFolder);
		 System.out.println(result.getName() + " method() failed, scrrenshot captured.");
	}
}
}
