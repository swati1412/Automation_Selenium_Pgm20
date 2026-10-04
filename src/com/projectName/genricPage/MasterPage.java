package com.projectName.genricPage;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MasterPage
{
	public static WebDriver driver;
	public Properties pro1;
	public Properties pro2;
    public Properties pro3;
    
    
	// constructor Implementation
	public MasterPage() throws Exception {
		// config Properties file Implementaion
		FileInputStream fis1 = new FileInputStream(".\\src\\com\\projectName\\Repository\\config.Properties");
		pro1 = new Properties();
		pro1.load(fis1);

		// locators Properties file Implementaion
		FileInputStream fis2 = new FileInputStream(".\\src\\com\\projectName\\Repository\\locators.Properties");
		pro2 = new Properties();
		pro2.load(fis2);

		// testdata Properties file Implementaion
		FileInputStream fis3 = new FileInputStream(".\\src\\com\\projectName\\Repository\\testdata.Properties");
		pro3 = new Properties();
		pro3.load(fis3);

		// Launching browsers -chrome/edge
		if (pro1.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
			driver = new ChromeDriver();

		} else if (pro1.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));

			driver = new FirefoxDriver();

		} else if (pro1.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty(pro1.getProperty("driverProperty"), pro1.getProperty("driverPath"));
			driver = new EdgeDriver();

		} else {
			System.out.println("No browser instance found");

		}

		driver.manage().window().maximize();
		// System.out.println("URL = [" + pro1.getProperty("URL_2") + "]");
		driver.get(pro1.getProperty("URL_2"));
	}	
}
