package com.projectName.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectName.genricPage.CommonMethods;

public class AmazonSearchPage extends CommonMethods {

	public AmazonSearchPage() throws Exception {
		super();
	}

	// click on amazon searchbox
	public void clickAmazonSearchBox() {
		clickWebElement("amazonSearchBox");
		handleLogger("AmazonSearchPage", "Clicked amazon Search Box");

	}

	// Enter laptop
	public void enterLaptop() {
		enterData("amazonSearchBox", "laptop1");
		handleLogger("AmazonSearchPage", "Entered laptop details");

	}
	
	
    // Continue Shopping button
    @FindBy(xpath = "//button[contains(text().,'Continue shopping')]")
	WebElement continueShopping;
	
	public void clickContinueShopping()throws Exception {
        PageFactory.initElements(driver, this);
        continueShopping.click();
	    handleLogger("AmazonSearchPage","Clicked Continue Shopping");
	}
}
