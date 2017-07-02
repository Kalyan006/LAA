package com.phm.hec.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntermediatePageObjects {

	//Lable User Name
	@FindBy (xpath = ".//*[@id='lblUserName']")
	public WebElement lblusername;
	public String getUserName()
	{
		return lblusername.getText();
	}
	
	// Link for Provider Admin 
	@FindBy(id="divproviderAdmin")
	public WebElement BtnProviderAdmin;
	public void ClickProviderAdmin()
	{
		BtnProviderAdmin.click();
	}
	
	// Link for 3D Analytics
	@FindBy(xpath=".//*[@id='lnk3DAnalytics']")
	public WebElement INM3DAnalyticsLink;
	public void ClickOn3DAnalyticsLink()
	{
		INM3DAnalyticsLink.click();
	}
	
	//Link for 3D Express
	@FindBy (xpath=".//*[@id='lnk3dExpress']")
	public WebElement INM3DExpressLink;
	public void ClickOn3DExpressLink()
	{
		INM3DExpressLink.click();
	}
	//Link for Care Manager
	@FindBy (xpath=".//*[@id='lnkCareManager']")
	public WebElement INMCareManagerLink;
	public void ClickOnCareManagerLink()
	{
		INMCareManagerLink.click();
	}
	//Link for Beneficiary Management
	@FindBy (xpath=".//*[@id='lnkBeneficiaryManagement']")
	public WebElement INMBeneficiaryManagmentLink;
	public void ClickOnBeneficiaryManagmentLink()
	{
		INMBeneficiaryManagmentLink.click();
	}
	//Link for Revenue Cycle EDI Transaction
	@FindBy (xpath=".//*[@id='LinkButton1']")
	public WebElement INMRevenueCycleEDILink;
	public void ClickOnRevenueCycleEDILink()
	{
		INMRevenueCycleEDILink.click();
	}
	//Link for Setting in Intermediate page
	@FindBy (xpath=".//*[@id='lnkSettings']/img")
	public WebElement INMSettingsLink;
	public void ClickOnINMSettingsLink()
	{
		INMSettingsLink.click();
	}
	//Link for Logout
	@FindBy (xpath=".//*[@id='lnkBtnLogout']/img")
	public WebElement INMLogoutLink;
	public void ClickLogout()
	{
		INMLogoutLink.click();
	}
	
	
}
