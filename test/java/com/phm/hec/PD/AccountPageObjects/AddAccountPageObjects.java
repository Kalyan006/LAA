package com.phm.hec.PD.AccountPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAccountPageObjects 
{
	//Account add account page account information account name text field.
	@FindBy(id="ContentPlaceHolder1_txtAccountName")
	public WebElement TxtAccountName;
	public void EnterAccountName(String AccountName)
	{
		TxtAccountName.sendKeys(AccountName);
	}
	//Account add account page account information account type ddl field.
	@FindBy(id="ContentPlaceHolder1_ddlAccountType")
	public WebElement DdlAccountType;
	public void ClickOnAccountType()
	{
		DdlAccountType.click();
	}
	//Account add account page account information account category ddl field.
	@FindBy(id="ContentPlaceHolder1_ddlAccountTypeId")
	public WebElement DdlAccountCategory;
	public void ClickOnAccountCategory()
	{
		DdlAccountCategory.click();
	}
	//Account add account page identifier information text field ssn.	
	@FindBy(id="ContentPlaceHolder1_txtSSN")
	public WebElement TxtSsn;
	public void EnterSsn(String ssn)
	{
		TxtSsn.sendKeys(ssn);
	}
	//Account add account page identifier information text field groupnpi.
	@FindBy(id="ContentPlaceHolder1_txtGroupNPI")
	public WebElement TxtNpi;
	public void EnterNpi(String npi)
	{
		TxtNpi.sendKeys(npi);
	}
	
	//Account add account page identifier information text field txtid.
	@FindBy(id="ContentPlaceHolder1_txtTaxID")
	public WebElement TxtTaxId;
	public void EnterTaxId(String taxid)
	{
		TxtTaxId.sendKeys(taxid);
	}
	//Account add account page identifier information state ddl field.
	@FindBy(id="ContentPlaceHolder1_ddlIIState")
	public WebElement DdlIIState;
	public void ClickONDdlIIState()
	{
		DdlIIState.click();
	}
	//Account add account page identifier information text field state assigned id.
	@FindBy(id="ContentPlaceHolder1_txtStateLicense")
	public WebElement TxtStateAssignedId;
	public void EnterStateAssignedId(String StateAssignedId)
	{
		TxtStateAssignedId.sendKeys(StateAssignedId);
	}
	//Account add account page identifier information text field upin.
	@FindBy(id="ContentPlaceHolder1_txtUPIN")
	public WebElement TxtUpin;
	public void EnterUpin1(String Upin)
	{
		TxtUpin.sendKeys(Upin);
	}
	//Account add account page Taxonomy & Description taxonomy code set ddl.
	@FindBy(id="ContentPlaceHolder1_ddlTaxCodeSet")
	public WebElement DdltaxonomyCodeSet;
	public void ClickOnTaxonomyCodeSet()
	{
		DdltaxonomyCodeSet.click();
	}
	//Account add account page Taxonomy & Description taxonomy code ddl.
	@FindBy(id="ContentPlaceHolder1_ddlTaxCode")
	public WebElement DdltaxonomyCode;
	public void ClickOnDdlTaxonomyCode()
	{
		DdltaxonomyCode.click();
	}
	//Account add account page Address & Contact Information text field last name.
	@FindBy(id="ContentPlaceHolder1_txtLastName")
	public WebElement TxtLastName;
	public void EnterUpin(String Upin)
	{
		TxtUpin.sendKeys(Upin);
	}
	//Account add account page Address & Contact Information text field first name.
	@FindBy(id="ContentPlaceHolder1_txtFirstName")
	public WebElement TxtFirstName;
	public void EnterFirstName(String FirstName)
	{
		TxtFirstName.sendKeys(FirstName);
	}
	//Account add account page Address & Contact Information text field email.
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	public WebElement TxtEmail;
	public void EnterEmail(String Email)
	{
		TxtEmail.sendKeys(Email);
	}
	//Account add account page Address & Contact Information text field address1.
	@FindBy(id="ContentPlaceHolder1_txtAddress1")
	public WebElement TxtAddress1;
	public void EnterTxtAddress1(String Address1)
	{
		TxtAddress1.sendKeys(Address1);
	}
	//Account add account page Address & Contact Information text field address1.
	@FindBy(id="ContentPlaceHolder1_txtAddress2")
	public WebElement TxtAddress2;
	public void EnterTxtAddress2(String Address2)
	{
		TxtAddress2.sendKeys(Address2);
	}
	//Account add account page Address & Contact Information text field city1.
	@FindBy(id="ContentPlaceHolder1_txtCity")
	public WebElement TxtCity;
	public void EnterCity(String City)
	{
		TxtCity.sendKeys(City);
	}
	//Account add account page Address & Contact Information state ddl field.
	@FindBy(id="ContentPlaceHolder1_ddlACState")
	public WebElement DdlAcState;
	public void ClickOnDdlAcState()
	{
		DdlAcState.click();
	}
	//Account add account page Address & Contact Information text zip.
	@FindBy(id="ContentPlaceHolder1_txtZip")
	public WebElement TxtZip;
	//Account add account page Address & Contact Information text field fax.
	@FindBy(id="ContentPlaceHolder1_txtFax")
	public WebElement TxtFax;
	//Account add account page Address & Contact Information text field telephone1.
	@FindBy(id="ContentPlaceHolder1_txtTelephone1")
	public WebElement TxtTelephone1;
	//Account add account page Address & Contact Information text field extension1.
	@FindBy(id="ContentPlaceHolder1_txtExtension1")
	public WebElement TxtExtension1;
	//Account add account page Address & Contact Information text field telephone2.
	@FindBy(id="ContentPlaceHolder1_txtTelephone2")
	public WebElement TxtTelephone2;
	//Account add account page Address & Contact Information text field extension2.
	@FindBy(id="ContentPlaceHolder1_txtExtension2")
	public WebElement TxtExtension2;
	//Account add account page Additional Information check box batch claims field.
	@FindBy(id="ContentPlaceHolder1_CheckBatchClaims")
	public WebElement ChkBatchClaims;
	//Account add account page Payment Information text field operator id.
	@FindBy(id="ContentPlaceHolder1_txtMerchantID")
	public WebElement TxtOperatorId;
	//Account add account page Payment Information text field registration key.
	@FindBy(id="ContentPlaceHolder1_txtRegistrationKey")
	public WebElement TxtRegisKey;
	//Account add account page Payment Information text field device id.
	@FindBy(id="ContentPlaceHolder1_txtTerminalID")
	public WebElement TxtDeviceId;
	//Account add account page assign region button field.
	@FindBy(id="ContentPlaceHolder1_btnAssignRegion")
	public WebElement BtnAssignRegion;
	//Account add account page assign facility button field.
	@FindBy(id="ContentPlaceHolder1_btnAssignFacility")
	public WebElement BtnAssignFacility;
	//Account add account page assign provider button field.
	@FindBy(id="ContentPlaceHolder1_btnAssignProvider")
	public WebElement BtnAssignProvider;
	//Account add account page assign user button field.
	@FindBy(id="ContentPlaceHolder1_btnAssignUser")
	public WebElement BtnAssignUser;
	//Account add account page save account button filed.
	@FindBy(id="ContentPlaceHolder1_btnSaveAccount")
	public WebElement BtnSaveAccount;
		
}
