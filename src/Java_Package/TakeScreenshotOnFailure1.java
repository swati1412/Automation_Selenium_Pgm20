package Java_Package;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {

	WebDriver driver;

	// ITestResult will provide the test case execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception 
	{
		if (ITestResult.FAILURE == result.getStatus()) 
		{
			// Create ref of TakesScrennshot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use the getScreenshotAs
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);

			// Copy the file to specific location in jpg/png format
			File destFolder = new File("./screenshots/" + result.getName() + ".png");
			FileUtils.copyFile(sourceFile, destFolder);
			System.out.println(result.getName() + " method() failed, screenshot captured");
		}

	}

}

