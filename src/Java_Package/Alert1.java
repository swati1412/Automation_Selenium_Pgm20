package Java_Package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// accept alert
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		// dismiss alert
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Handled");
	}

}
