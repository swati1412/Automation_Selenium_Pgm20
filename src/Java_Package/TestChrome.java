package Java_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

    public static void main(String[] args) throws Exception {

    	System.setProperty("webdriver.chrome.driver",
			    "C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(5000);

        System.out.println("Title = " + driver.getTitle());
        System.out.println("URL = " + driver.getCurrentUrl());

        // Keep browser open
        Thread.sleep(10000);

        driver.quit();
    }
}