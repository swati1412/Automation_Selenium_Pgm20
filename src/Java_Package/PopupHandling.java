package Java_Package;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Tab Handling
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);

		for (String abcd : allWindowsId) {
			driver.switchTo().window(abcd);
			if (abcd.equalsIgnoreCase(parentWindowId)) {
				System.out.println("Parent Tab URL: " + driver.getCurrentUrl());
			} else {
				System.out.println("Child Tab URL: " + driver.getCurrentUrl());
			}
		}
		Thread.sleep(5000);
		driver.close();

		// Popup Handling
		driver.switchTo().window(parentWindowId);
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('PopUp').click()");
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println(allWindowsId2);

		for (String efgh : allWindowsId2) {
			driver.switchTo().window(efgh);
			System.out.println("Windows ID: " + efgh);
			System.out.println("Title: " + driver.getTitle());
			System.out.println("Current URL: " + driver.getCurrentUrl());
		}
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Popups and Tabs are handled successfully");
	}

}
