package com.projectName.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.projectName.genricPage.CommonMethods;


public class PageFactoryTestAutomationPracticeLoginPage extends CommonMethods {

	
	public PageFactoryTestAutomationPracticeLoginPage() throws Exception {
		super();
	}

	@FindBy(xpath = "//input[@id='name']")
	public WebElement name;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@id='country']")
	public WebElement country;
	

	public void enterName(String testData) {
		name.sendKeys(testData);
	}

	public void enterEmail(String testData) {
		email.sendKeys(testData);
	}

	public void enterCountry(String value) {
	        Select select = new Select(country);
	        select.selectByVisibleText(value);
}
}
