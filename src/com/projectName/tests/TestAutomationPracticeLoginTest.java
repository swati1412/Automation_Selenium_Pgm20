package com.projectName.tests;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.projectName.pages.TestAutomationPracticeLoginPage;

public class TestAutomationPracticeLoginTest extends TestAutomationPracticeLoginPage {

	public TestAutomationPracticeLoginTest() throws Exception {
		super();
	}

	@Test
	public void loginTest() throws Exception {
		clickNameInputBox();
		Thread.sleep(2000);
        enterName();
		Thread.sleep(2000);
		

		
		
		clickEmailInputBox();
		Thread.sleep(2000);
        enterEmail();
		Thread.sleep(2000);
		

		getHeaderTextAndVerify();
		Thread.sleep(2000);

		clickStartButton();
		Thread.sleep(2000);

		clickGender();
		Thread.sleep(2000);

		selectCountry();
		Thread.sleep(2000);
		
        mouseHoverToPointMeButton();

	}

	
	public void takeScreenshot(ITestResult result2) throws Exception {
		captureScrrenshot(result2);

	}
}