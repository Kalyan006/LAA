package com.phm.hec.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import com.phm.hec.pageObjects.IntermediatePageObjects;
import com.phm.hec.pageObjects.LoginHomePageObjects;
import com.phm.hec.utility.GlobalVar;

import java.util.logging.Logger;
import com.phm.hec.utility.ReportGenerator;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login {
	static ExtentReports report;
  @Test
  public static void login1(String Username, String Password) throws Exception {
	  ExtentTest login;
	  report = new ExtentReports(GlobalVar.ExtentReportPath, true);
	  login = report.startTest("login","Login Validation for Valid User Name & Password");
	  	Logger logger=Logger.getLogger(Login.class.getName());
		LoginHomePageObjects LoginPage = PageFactory.initElements(GlobalVar.Driver, LoginHomePageObjects.class);
		IntermediatePageObjects IntMedPage = PageFactory.initElements(GlobalVar.Driver, IntermediatePageObjects.class);
		Thread.sleep(1000);
		LoginPage.enterUserName(GlobalVar.LoginUsername);
		LoginPage.enterPassword(GlobalVar.LoginPassword);
		logger.info("User Name : " + GlobalVar.LoginUsername + " Password : " + GlobalVar.LoginPassword );
		login.log(LogStatus.INFO, "User Name : " + GlobalVar.LoginUsername + " Password : " + GlobalVar.LoginPassword);
		LoginPage.clickLoginButton();
		String LoggedInUser = IntMedPage.getUserName();
		
		if (GlobalVar.Driver.getPageSource().contains(LoggedInUser)==true){
			GlobalVar.loggedin = true;
			ReportGenerator.setLog("Logged in Successfully");
			
			login.log(LogStatus.PASS, "Logged in Successfully");
		}
		else {
			GlobalVar.loggedin = false;
			ReportGenerator.setLog("Logged in Failed");
			login.log(LogStatus.FAIL, "Logged in Failed");
		}
		report.endTest(login);
		report.flush();
		
  }
}
