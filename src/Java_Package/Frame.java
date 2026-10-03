package Java_Package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(2000);

		// Find the total number of frames present on webpage
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames: " + allFrames);

		// Check if the web element is present on webpage
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expText = "Open Paytm App";
			String actText = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();

			if (actText.equalsIgnoreCase(expText)) {
				System.out.println("Web Element Found");
				break;
			} else {
				System.out.println("Web Element Not Found");
			}
		}

	}

}
