package com.phm.hec.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import com.phm.hec.pageObjects.ForgotPasswordPageObjects;
import com.phm.hec.pageObjects.IntermediatePageObjects;
import com.phm.hec.pageObjects.LoginHomePageObjects;
import com.phm.hec.utility.GlobalVar;

import com.phm.hec.utility.EmailUtil;


import java.util.logging.Logger;
public class TC399ForgotPassword {
	
	@Test
	public static void forgotpassword() throws Exception{
		Logger logger=Logger.getLogger(TC399ForgotPassword.class.getName());
		LoginHomePageObjects LoginPage = PageFactory.initElements(GlobalVar.Driver, LoginHomePageObjects.class);
		IntermediatePageObjects IntMedPage = PageFactory.initElements(GlobalVar.Driver, IntermediatePageObjects.class);
		ForgotPasswordPageObjects FPPO = PageFactory.initElements(GlobalVar.Driver, ForgotPasswordPageObjects.class);
		
		EmailUtil EUTIL = PageFactory.initElements(GlobalVar.Driver, EmailUtil.class);

		//EmailReceiver EREC = PageFactory.initElements(GlobalVar.Driver, EmailReceiver.class);


		

		
		Thread.sleep(1000);
		// Click on the Forgot Password
		if (GlobalVar.loggedin == true){
			logger.info("Application already logged in. Logging out for Forgot password validation");
			IntMedPage.ClickLogout();
			GlobalVar.loggedin = false;
		}
		
		Thread.sleep(2000);
		LoginPage.lnkforgotPassword.click();
		logger.info("Clicked on Forgot Password Link");
		
		// Enter User Name and Email in the Forgot Password Page
		String Username = "marisol_2219";
		FPPO.EnterFPUsername(Username);
		
		String EmailID = "healthecuat@gmail.com";
		FPPO.EnterFPEmail(EmailID);
		FPPO.ClickNextbtnInForgotPassword();
		logger.info("Forgot Password User Name : " + Username + "|| Email ID : " + EmailID);
		
		//Getting the OTP from email
		
		//GM.GmailUsingImap(Username, "igi$12345");
		EUTIL.openEmailAccountOf(EmailID, "igi$12345");
		//EREC.ReadEmail();
		Boolean EmailSubject = EUTIL.searchEmailBySubject("OTP");
		logger.info("Email Search : " +EmailSubject);
		if (EmailSubject == true) {
			logger.info("Email Subject Found");
			String EmailContent = EUTIL.getEmailContent("OTP");
			logger.info(EmailContent);
		}
		else
		{
			logger.info("Email Subject Not Found");
			EUTIL.waitforMailToBeReceived("OTP");
		}
		
		//logger.info(EmailContent);
		//EUTIL.deleteEmail("OTP");
		//EUTIL.deleteEntireInbox();
		
		//Enter OTP in Forgot Password OTP Page
		
		/////FPPO.EnterOTP("OTP");
	}

}
