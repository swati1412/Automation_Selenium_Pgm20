package Java_Package;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\QUIKCARE COMPUTERS\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://money.rediff.com/gainers");

		// Create list of all companies
		List<WebElement> allCompanies = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("\"Total comapnies: \" + allCompanies.size()");

		// Create list of all current price
		List<WebElement> allCurrentPrice = Driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Price: " + allCurrentPrice.size());

		String expResult = "IEL";

		for (int i = 0; i < allCompanies.size(); i++) {
			if (allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
				System.out.println(allCompanies.get(i).getText() + " == " + allCurrentPrice.get(i).getText());
				allCompanies.get(i).click();
				System.out.println(Driver.getTitle());
				break;
			}
		}

	}
}
