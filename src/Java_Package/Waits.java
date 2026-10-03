package Java_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");

		WebDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();

		Driver.get("https://testautomationpractice.blogspot.com/");

		// Thread.sleep(30000); // Not recommended

		// Enter Name
		Driver.findElement(By.id("name")).sendKeys("Swati");

		// Fetch entered Name
		String name = Driver.findElement(By.id("name")).getAttribute("value");

		System.out.println("Name = " + name);

		// Enter Email

		Driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

		// Fetch entered Email
		String email = Driver.findElement(By.id("email")).getAttribute("value");

		System.out.println("Email = " + email);
	}
}