package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.SeleniumReusableFunctions.SeleniumUtilities;
import com.pages.LoginPage;

public class LoginTestCase extends Library {
	 @BeforeTest
	    public void stratUp() {
	        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

	    }
	    @Test
	    public void login() {
	        LoginPage lpage=new LoginPage(driver);
	        lpage.login("Admin", "admin123");

	    }
	    @AfterMethod
	    public void close() throws IOException {
	        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	        sUti.to_take_screenshot("src\\test\\resources\\ScreenShots\\orangeHRMLogin.png");

	       

	    }

}
