package Java_Package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/computers/desktop-pcs/all-in-one-pcs/dell~brand/pr?sid=6bo,nl4,igk");

		Actions act = new Actions(driver);

		// Mouse Simulation using Actions class
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Thread.sleep(3000);
		act.moveToElement(electro).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Realme']")).click();

		// Keyboard Operations
		Thread.sleep(3000);
		WebElement Men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(Men, Keys.ENTER).build().perform();
		System.out.println("Men option clicked");
	}

}
