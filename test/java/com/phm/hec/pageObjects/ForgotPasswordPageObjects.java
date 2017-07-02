package com.phm.hec.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPageObjects {
	
	// Forgot password Username
	@FindBy(id="ContentPlaceHolder1_txtUserName")
	public WebElement txtFPUsername;
	public void EnterFPUsername(String Username)
	{
		txtFPUsername.sendKeys(Username);;
	}
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	public WebElement txtFPemail;
	public void EnterFPEmail(String Email)
	{
		txtFPemail.sendKeys(Email);
	}
	
	//------------------Security Question Page Objects-----------------------------
	@FindBy (xpath = ".//*[@id='ContentPlaceHolder1_txtSecurityAnswer']")
	public WebElement txtSecurityQuestionAnswer;
	public void EnterSecurityQuestionAnswer(String SecurityAnswer){
		txtSecurityQuestionAnswer.sendKeys(SecurityAnswer);
	}
	
	//---------Forgot Password Page Objects------------
	// Button Next in Forgot Password Page
	@FindBy (id = "ContentPlaceHolder1_btnNextfrgtPswd")
	public WebElement btnNextInFogotPassword;
	public void ClickNextbtnInForgotPassword(){
		btnNextInFogotPassword.click();
	}
	
	// Button Cancel in Forgot Password page
	@FindBy (id = "ContentPlaceHolder1_btnCancelfrgtPswd")
	public WebElement btnCancelInForgotPassword;
	public void ClickCancelInForgotpassword(){
		btnCancelInForgotPassword.click();
	}
	
	//Error message for the invalid user name
	@FindBy (id = "ContentPlaceHolder1_ValUserName")
	public WebElement lblFPValUserName;
	public String getFPValUserName(){
		return lblFPValUserName.getText();
	}
	
	//Error message for the Invalid Email ID
	@FindBy (id = "ContentPlaceHolder1_ValEmail")
	public WebElement lblFPValEmail;
	public String getFPValEmail(){
		return lblFPValEmail.getText();
	}
	
	//Error message for the Invalid User Name / Email ID
	@FindBy (id = "ContentPlaceHolder1_LblError")
	public WebElement lblFPValError;
	public String getFPValErroeMsg(){
		return lblFPValError.getText();
	}
	
	//-------------Forgot Password OTP Page Objects------------
	
	//OTP Field
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_txtOTP']")
	public WebElement txtOTP;
	public void EnterOTP(String OTP){
		txtOTP.sendKeys(OTP);
	}
	
	//Cancel button on Forgot Password OTP Page
	@FindBy (id = "ContentPlaceHolder1_btnCancelfrgtPswd")
	public WebElement btnCancelInFPOTP;
	public void ClickCancelBtnInFPOTP(){
		btnCancelInFPOTP.click();
	}
	//Validation Text OTP - Error message for the OTP field Empty
	@FindBy (id = "ContentPlaceHolder1_ValtxtOTP")
	public WebElement lblFPOTPErrorMessage;
	public String getForgotPasswordOTPErrMsg(){
		return lblFPOTPErrorMessage.getText();
	}
	
	//Validation error message Forgot Password OTP
	
	@FindBy (id = "ContentPlaceHolder1_LblError")
	public WebElement lblFPOTPErrMsg;
	public String getFPRegenateErrMsg(){
		return lblFPOTPErrMsg.getText();
	}
	
	//Re-Generate OTP Button
	@FindBy (id = "ContentPlaceHolder1_btnRegenreateOTP")
	public WebElement btnFPGenerateOTP;
	public void ClickRegenerateOTP(){
		btnFPGenerateOTP.click();
	}
		
	//-----------Security Question Page objects---------------
	//Button Next in Security Question
	@FindBy(id="ContentPlaceHolder1_btnSecurityNext")
	public WebElement btnNextInSecurityQuestion;
	public void ClickSecurityQuestionNext(){
		btnNextInSecurityQuestion.click();
	}
	
	@FindBy(xpath="//h3[text()='Provider']")
	public WebElement btnFPNext;
	public void ClickNextbutton()
	{
		btnFPNext.click();
	}
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_btnCancelfrgtPswd']")
	public WebElement btnFPCancel;
	public void ClickCancelbutton()
	{
		btnFPCancel.click();
	}

}
