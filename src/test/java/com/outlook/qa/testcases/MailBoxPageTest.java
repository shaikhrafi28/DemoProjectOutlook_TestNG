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

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.outlook.qa.base.TestBaseSetup;
import com.outlook.qa.pages.MailBoxPage;
import com.outlook.qa.pages.SignUpPage;


//For implementing the Testnglistener
@Listeners(com.outlook.qa.util.TestNG_Listener.class)

public class MailBoxPageTest extends TestBaseSetup {
    
public static ExtentReports extent;	
public static ExtentTest test;
	SignUpPage signupPage;
	MailBoxPage mailboxpage;



	public MailBoxPageTest() {
		super();
	}
	
	@BeforeSuite()
	public void beforesuite() {
	extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/testReport.html", true);
	extent.loadConfig(new File(System.getProperty("user.dir")+"/src/main/java/com/qa/reporting/extent-config.xml " ));
	
	}
	@BeforeTest
	public void setUp() throws InterruptedException {
	//	report1.startReport("Windows", "chrome");
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

		

	}

	@AfterMethod(enabled = false)
	public void cbrowser() {
        
		driver.quit();
		

	}

}
