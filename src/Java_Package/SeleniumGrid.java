package Java_Package;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid {

	@DataProvider(parallel = true)
	public Object[][] dataSet() {

		Object arr[][] = new Object[3][2];

		arr[0][0] = "chrome";
		arr[0][1] = "TestData1";

		arr[1][0] = "chrome";
		arr[1][1] = "TestData2";

		arr[2][0] = "chrome";
		arr[2][1] = "TestData3";

		return arr;
	}

	@Test(dataProvider = "dataSet")
	public void enterData(String browserName, String name) throws Exception {

		ChromeOptions cap = new ChromeOptions();

		cap.setPlatformName(Platform.WINDOWS.toString());

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.name("name")).sendKeys(name);

	}
}