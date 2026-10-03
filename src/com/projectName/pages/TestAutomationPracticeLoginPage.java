package com.projectName.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.projectName.genricPage.CommonMethods;

public class TestAutomationPracticeLoginPage extends CommonMethods {

	public TestAutomationPracticeLoginPage() throws Exception {
		super();

	}

	// click on name inputBox
	public void clickNameInputBox() {

		clickWebElement("Name");
		handleLogger("TestAutomationPracticeLoginPage", "Clicked Name Input Box");
		driver.findElement(By.id("name")).sendKeys("peter");

	}

	// Enter name
	public void enterName() {

		enterData("Name", "testData1Name");
		handleLogger("TestAutomationPracticeLoginPage", " Entered  Name");

	}



	

//click on Email inputBox 
	public void clickEmailInputBox() {

		clickWebElement("Email");
		handleLogger("TestAutomationPracticeLoginPage", "Clicked Email Input Box");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

	}

	// Enter Email
	public void enterEmail() {

		enterData("Email", "testData2Email");
		handleLogger("TestAutomationPracticeLoginPage", "Entered Email");

	}

	
	// Get Header text and verify
	public void getHeaderTextAndVerify() {
		getTextOfWebElementAndVerify("headerText1", "headerText1Value1");
		handleLogger("TestAutomationPracticeLoginPage", "verified WebElement text successfully");

	}

//Click on start button
	public void clickStartButton() {
		clickWebElement("startButton");
		handleLogger("TestAutomationPracticeLoginPage", "clicked start button");

	}

//click female gender radio button list of web elements
	public void clickGender() {
		clickListOfWebElement("genderRadioButtons", "genderRadioButtons");
		handleLogger("TestAutomationPracticeLoginPage", "clicked Gender Radio button");

	}

// select country from dropdown
	public void selectCountry() {
		selectDropdownValue("countryDropdown", "countryName");
		handleLogger("TestAutomationPracticeLoginPage", "selected India in country Dropdown");

	}

// mouse hover to Point Me
	public void mouseHoverToPointMeButton() {
		moveToElement("pointMeButton");
		handleLogger("TestAutomationPracticeLoginPage", "mouse hoverd to point me Button");

	}

}
