package com.projectName.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.projectName.genricPage.CommonMethods;
import com.projectName.pages.PageFactoryTestAutomationPracticeLoginPage;

public class PageFactoryTestAutomationPracticeLoginTest extends PageFactoryTestAutomationPracticeLoginPage{
	

	public PageFactoryTestAutomationPracticeLoginTest() throws Exception {
		super();

	}
	
	PageFactoryTestAutomationPracticeLoginPage pfc;

	@BeforeMethod
	public void initializePage()throws Exception
	{
		 pfc = new PageFactoryTestAutomationPracticeLoginPage();
		//pfc=PageFactory.initElements(driver, PageFactoryTestAutomationPracticeLoginPage.class);
	}
	
	@Test
	public void pageFactoryLoginTest1() {

		pfc.enterName(pro3.getProperty("testData1Name"));

	}
	
	@Test
	public void pageFactoryLoginTest2() {

		pfc.enterEmail(pro3.getProperty("testData2Email"));

	}
	
	
	
	
	
	


}

