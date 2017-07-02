package com.phm.hec.PD.AccountPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.phm.hec.utility.GenericUtils;

public class AccountPageObjects 
{
	//Account Page account name text field.
	@FindBy(id="ContentPlaceHolder1_txtAccountName")
	public WebElement TxtAccountName;
	public void EnterAccountName(String AccountName)
	{
		TxtAccountName.sendKeys(AccountName);
	}
	//Account Page account type ddl field.
	@FindBy(id="ContentPlaceHolder1_ddlAccountType")
	public WebElement DdlAccountType;
	public void ClickOnDdlAccountType(int index)
	{
		GenericUtils.selectDdlByIndex(DdlAccountType, index);
	}
	//Account Page account type npi text field.
	@FindBy(id="ContentPlaceHolder1_txtnpi")
	public WebElement TxtNpi;
	public void EnterNpi(String Npi)
	{
		TxtNpi.sendKeys(Npi);
	}
	//Account Page account UserName text field.
	@FindBy(id="ContentPlaceHolder1_txtUserName")
	public WebElement TxtUserName;
	public void EnterUserName(String UserName)
	{
		TxtUserName.sendKeys(UserName);
	}
	//Account Page account State Assigned ID text field.
	@FindBy(id="ContentPlaceHolder1_txtUmpi")
	public WebElement TxtAssignedID;
	public void EnterAssignedID(String AssignedID)
	{
		TxtAssignedID.sendKeys(AssignedID);
	}
	//Account Page account tax ID text field.
	@FindBy(id="ContentPlaceHolder1_txtTaxID")
	public WebElement TxtTaxID;
	public void EnterTaxID(String TaxID)
	{
		TxtTaxID.sendKeys(TaxID);
	}
	//Account Page account TimePeriod ddl field.
	@FindBy(id="ContentPlaceHolder1_ddlTimePeriod")
	public WebElement DdlTimePeriod;
	public void ClickDdlTimePeriod(int index)
	{
		GenericUtils.selectDdlByIndex(DdlTimePeriod, index);
	} 
	//Account Page account date from text field.
	@FindBy(id="ContentPlaceHolder1_txtDtFrom")
	public WebElement TxtDtFrom;
	//Account Page account img date from text field.
	/*@FindBy(id="ContentPlaceHolder1_imgDtFrom")
	public WebElement TxtImgDtFrom;*/
	//Account Page account img to date text field.
	@FindBy(id="ContentPlaceHolder1_imgDtTo")
	public WebElement TxtImgDtTo;
	//Account Page account status ddl field.
	@FindBy(id="ContentPlaceHolder1_ddlStatus")
	public WebElement DdlStatus;
	//Account Page account Phone text field.
	@FindBy(id="ContentPlaceHolder1_txtPhone")
	public WebElement TxtPhone;
	//Account Page account Email text field.
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	public WebElement TxtEmail;
	//Account Page account Search Account button field.
	@FindBy(id="ContentPlaceHolder1_btnSearchAccount")
	public WebElement BtnSearchAccount;
	//Account Page account clear button field.
	@FindBy(id="ContentPlaceHolder1_btnClearAddAccount")
	public WebElement BtnClear;
	//Account Page account add account button field.
	@FindBy(id="ContentPlaceHolder1_btnAddAccount")
	public WebElement BtnAddAccount;
	
}
