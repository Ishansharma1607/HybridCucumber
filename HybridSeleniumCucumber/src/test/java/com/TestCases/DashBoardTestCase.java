package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.SeleniumReusableFunctions.SeleniumUtilities;
import com.pages.LoginPage;
import com.pages.dashboard;

public class DashBoardTestCase extends Library  {
	 
	 @BeforeTest
	    public void stratUp() {
	        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

	    }
	 
	
	 
	 @Test
	    public void login() {
	        LoginPage lpage=new LoginPage(driver);
	        lpage.login("Admin", "admin123");
	        dashboard dash=new dashboard(driver);
	        dash.click();

	    }
	 
	    @AfterMethod
	    public void close() throws IOException {
	        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	        sUti.to_take_screenshot("src\\test\\resources\\ScreenShots\\orangeHRMDashboard.png");

	        quit();

	    }

}
