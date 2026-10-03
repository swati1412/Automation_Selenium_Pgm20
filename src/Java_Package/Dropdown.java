package Java_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		// 1st way
		Thread.sleep(2000);
		driver.findElement(By.id("Country")).sendKeys("India");

		// 2nd way
		List<WebElement> country = driver.findElements(By.xpath("//select[@id='Country']/option"));
		System.out.println("Total Dropdown Values:" + country.size());
		country.get(1).click();// canada
		Thread.sleep(2000);
		country.get(8).click();// Brazil

		// 3rd Way
		WebElement bm = driver.findElement(By.xpath("//select[@id='Country']"));
		Select countryDropdown = new Select(bm);
		Thread.sleep(2000);
		countryDropdown.selectByVisibleText("Australia");// Australia
		Thread.sleep(2000);
		countryDropdown.selectByValue("Japan");
		Thread.sleep(2000);
		countryDropdown.selectByIndex(3); // Germany
		System.out.println(countryDropdown.getFirstSelectedOption().getText());// Germany - Current Selected value

		// 4th Way
		List<WebElement> dropdown = countryDropdown.getOptions();
		System.out.println("Total Dropdown Values 2nd:" + dropdown.size());
		for (int i = 0; i < dropdown.size(); i++) {
			if (dropdown.get(i).getText().equalsIgnoreCase("China")) {
				dropdown.get(i).click();
			}
		}

	}

}
