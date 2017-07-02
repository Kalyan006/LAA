package com.phm.hec.CM.FormResourceAndEducationObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormResourceAndEducationObjects {
	
	//click on care Management
	@FindBy(xpath="//a[text()='Care Management']")
	public WebElement lnkcaremgt;
	
	public void ClickCareManagement()
	{
		lnkcaremgt.click();
	}
	
	//click on Form Resource And Education link
	
	@FindBy(xpath="//h3[text()='Forms, Resources and Education']")
    public WebElement lnkformEdu;
	public void ClickFormResourceEducation()
	{
		lnkformEdu.click();
	}
	
	//click on frequently asked question tab
	
	@FindBy(xpath="//a[text()=' Frequently Asked Questions']")
	public WebElement clkFAQ;
	
	public void ClickFAQButton()
	{
		clkFAQ.click();
	}
	
	// Click on Forms and Templates tab
	@FindBy(xpath="//a[text()=' Forms and Templates']")
	public WebElement clkFAT;
	
	public void ClickFormAndTemplate()
	{
		clkFAT.click();
	}
	
	//Click on Reference Guide Tab
	@FindBy(xpath="//a[text()='Reference Guides']")
	public WebElement clkRefgd;
	
	public void ClickRefernceGuides()
	{
		clkRefgd.click();
	}
	
	//Click on EMR Education
	
	@FindBy(xpath="//a[text()='EMR Education']")
	public WebElement clkEmrEdu;
	
	public void ClickEMREducation()
	{
		clkEmrEdu.click();
	}
	
	//Click on Webinars tab
	
	@FindBy(xpath="//a[text()='Webinars']")
	public WebElement clkWebnrs;
	
	public void ClickWebinars()
	{
		clkWebnrs.click();
	}
	
	//Click on Decisions Aids
	@FindBy(xpath="//a[text()=' Decision Aids']")
    public WebElement clkDecAid;
	
	public void ClickDecisionsAids()
	{
		clkDecAid.click();
	}
	
	//Click on Hangouts
	
	@FindBy(xpath="//a[text()='Handouts']")
	public WebElement clkhndout;
	
	public void ClickHandouts()
	{
		clkhndout.click();
	}
	
}
