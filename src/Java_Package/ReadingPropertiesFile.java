package Java_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {

		// config properties file
		File src = new File("C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\Repository\\Config.properties");
		FileInputStream fis1 = new FileInputStream(src);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		// locators properties file
		File src2 = new File("C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\Repository\\locators.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// testdata properties file
		File src3 = new File("C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\Repository\\testdata.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);

		// Set the property of chrome browser and pass chromedriver path
		System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro1.getProperty("URL_1"));

		// getProperty() method will accept key and return value of that key

	}

}
