package Java_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws Exception {

		// Set the property of chrome browser and pass chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		
		// Launch the chrome browser instance
		WebDriver driver=new ChromeDriver();
		
		// Open the url using get() method
		Thread.sleep(2000);
		driver.get("https://googlechromelabs.github.io/chrome-for-testing/#stable");
		
		
		// Maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		// refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		// Open the another url using get() method
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		
		
		// Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();		
		
		// Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();		
		
		// Fetch the current URL
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		// Fetch the title of web page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		
		// Close the browser instance
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
