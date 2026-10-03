package Java_Package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.get("https://jqueryui.com/droppable/");
		
		// switch to frame
		Driver.switchTo().frame(0);
		
		// Drag and Drop
		WebElement drag=Driver.findElement(By.id("draggable"));
		WebElement drop=Driver.findElement(By.id("dropable"));
		Thread.sleep(2000);
		Actions act=new Actions(Driver);
		act.dragAndDrop(drag,drop).build().perform();
		
		
	}

}
