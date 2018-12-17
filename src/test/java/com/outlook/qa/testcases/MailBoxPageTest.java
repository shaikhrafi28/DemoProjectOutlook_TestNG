package com.outlook.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.outlook.qa.base.TestBaseSetup;
import com.outlook.qa.pages.MailBoxPage;
import com.outlook.qa.pages.SignUpPage;

public class MailBoxPageTest extends TestBaseSetup {

	SignUpPage signupPage;
	MailBoxPage mailboxpage;

	public MailBoxPageTest() {
		super();
	}

	@BeforeMethod
	//@Parameters("browser")
	public void setUp() throws InterruptedException {
		initialization("chrome");
		giveUrl("outlooksignup");
		//switchtoframe();
		signupPage = new SignUpPage();
		}

	@Test(priority = 1)
public void loginTest() throws InterruptedException {
		signupPage.signInNewUser();
		mailboxpage = new MailBoxPage();
		mailboxpage.clicknewmail();
		mailboxpage.composenewmail();
		
	}
	

	
	@AfterMethod(enabled=false)
	public void cbrowser(){
		driver.quit();
		
	}

}
