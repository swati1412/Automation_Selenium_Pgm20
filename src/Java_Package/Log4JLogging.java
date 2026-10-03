package Java_Package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("Log4JLogging");

		PropertyConfigurator.configure(
				"C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\Automation_Pgm\\Automation_Selenium_Pgm\\Repository\\log4j.properties");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		logger.info("Open Browser Instance");

		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		logger.info("Implicit Wait Given");

		driver.get("https://testautomationpractice.blogspot.com/");
		logger.info("Application Opened");

		try {
			driver.findElement(By.id("confirmBtn")).isDisplayed();
			logger.info("Confirm Button displayed");
		} catch (Exception e) {
			logger.error("Confirm Button is not displayed");
		}

	}
}