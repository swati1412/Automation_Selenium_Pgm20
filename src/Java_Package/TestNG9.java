package Java_Package;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG9 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@DataProvider
	public Object[][] dataSet() {
		Object arr[][] = new Object[3][2];

		arr[0][0] = "TestData1";
		arr[0][1] = "TestData1";

		arr[1][0] = "TestData2";
		arr[1][1] = "TestData2";

		arr[2][0] = "TestData3";
		arr[2][1] = "TestData3";

		return arr;

	}

	@Test(dataProvider = "dataSet")
	public void enterData(String name, String email) throws Exception {
		//Thread.sleep(2000);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);

	}
}
