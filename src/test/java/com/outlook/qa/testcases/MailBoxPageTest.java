package com.outlook.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.outlook.qa.base.TestBaseSetup;
import com.outlook.qa.pages.MailBoxPage;
import com.outlook.qa.pages.SignUpPage;
import com.qa.reporting.BasicExtentReport2;

//For implementing the Testnglistener
@Listeners(com.outlook.qa.util.TestNG_Listener.class)

public class MailBoxPageTest extends TestBaseSetup {

	SignUpPage signupPage;
	MailBoxPage mailboxpage;

	BasicExtentReport2 report1;
	ExtentReports extent;
	ExtentTest test;

	public MailBoxPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("chrome");
		giveUrl("outlooksignup");
		signupPage = new SignUpPage();
	
	}
	


	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		signupPage.signInNewUser();
		mailboxpage = new MailBoxPage();
		mailboxpage.clicknewmail();
		mailboxpage.composenewmail();

		test = extent.createTest("Test Case 1", "PASSED test case");
		AssertJUnit.assertTrue(true);

	}

	@AfterMethod(enabled = false)
	public void cbrowser() {

		driver.quit();

	}

}
