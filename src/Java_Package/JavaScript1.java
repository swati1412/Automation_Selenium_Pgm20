package Java_Package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://money.rediff.com/gainers");

		// Delete All cookies
		driver.manage().deleteAllCookies();

		// JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Scroll down using JavaScript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, 500)");

		// Scroll Up using JavaScript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, -500)");

		// Locate web element using JavaScript
		jse.executeScript(
				"document.querySelector(\"a[href='//money.rediff.com/companies/IEL-Ltd/11070122']\").click();");
		// jse.executeScript("document.getElementsByName('srchword')[0].value='IEL'");
		// jse.executeScript("document.getElementById('srchwordId').value='IEL'");
		// jse.executeScript("document.querySelector(\"input[type='submit']\").click();");

	}

}
