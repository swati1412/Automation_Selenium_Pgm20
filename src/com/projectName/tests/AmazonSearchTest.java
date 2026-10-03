package com.projectName.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.projectName.pages.AmazonSearchPage;


public class AmazonSearchTest extends AmazonSearchPage {

	public AmazonSearchTest() throws Exception {
		super();
	}

	// AmazonSearchTest ast= new AmazonSearchTest();

	@Test
	public void amazonSearchScenarioE2E() throws Exception {
		//AmazonSearchTest ast = new AmazonSearchTest();
	    //ast.clickAmazonSearchBox();
		//ast.enterLaptop();
        clickAmazonSearchBox();
        enterLaptop();
}

	
	
	@AfterMethod
	public void takesScreenshot(ITestResult result2) throws Exception {
		//AmazonSearchPage ast = new AmazonSearchPage();

		// captureScrrenshot(result2);
		// AmazonSearchTest asp = new AmazonSearchTest();
		//ast.captureScrrenshot(result2);

	}

}
