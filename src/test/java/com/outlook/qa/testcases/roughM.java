
package com.outlook.qa.testcases;
 
import org.testng.annotations.Test;

import com.outlook.qa.base.TestBaseSetup;
import com.outlook.qa.pages.MailBoxPage;
import com.outlook.qa.pages.SignUpPage;
import com.outlook.qa.util.extentreports.ExtentTestManager;
 
public class roughM extends TestBaseSetup {
 
    // Extra information:
    // 1) @BeforeClass we declared driver and wait variables
    // 2) We send these driver and wait variables to the page class with below declaration
    //    Homepage homepage = new HomePage(driver,wait);
    // 3) super () method in page class transfer the driver and wait variables values to the BasePage class.
 
    @Test (priority = 0, description="Invalid Login Scenario with wrong username and password.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");
 
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
 
        //*************PAGE METHODS********************
        //Open N11 HomePage
        homePage.goToN11();
 
        //Go to LoginPage
        homePage.goToLoginPage();
 
        //Login to N11
        loginPage.loginToN11("onur@swtestacademy.com", "11223344");
 
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        loginPage.verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
    }
 
    @Test (priority = 1, description="Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword () throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.getTest().setDescription("Invalid Login Scenario with empty username and password.");
 
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
 
        //*************PAGE METHODS********************
        homePage.goToN11();
        homePage.goToLoginPage();
        loginPage.loginToN11("","");
 
        //*************ASSERTIONS***********************
        Thread.sleep(500);
        loginPage.verifyLoginUserName("Lütfen e-posta adresinizi girin.");
        loginPage.verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");
    }
 
}