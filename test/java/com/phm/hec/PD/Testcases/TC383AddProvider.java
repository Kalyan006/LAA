package com.phm.hec.PD.Testcases;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.phm.hec.PD.ProviderPageObjects.ProviderPageObjects;
import com.phm.hec.PD.ProviderPageObjects.AddCallLogPageObjects;
import com.phm.hec.PD.ProviderPageObjects.AddProviderPageObjects;
import com.phm.hec.PD.ProviderPageObjects.AssignCommitteePageObjects;
import com.phm.hec.PD.ProviderPageObjects.AssignPrimaryAccountPageObjects;
import com.phm.hec.PD.ProviderPageObjects.AssignPrimaryFacilityPageObjects;
import com.phm.hec.PD.ProviderPageObjects.AssignRegionPageObjects;
import com.phm.hec.PD.ProviderPageObjects.AssignSecondaryAccountPageObjects;
import com.phm.hec.PD.ProviderPageObjects.AssignSecondaryFacilityPageObjects;
import com.phm.hec.pageObjects.IntermediatePageObjects;
import com.phm.hec.utility.GenericUtils;
import com.phm.hec.utility.GlobalVar;

public class TC383AddProvider
{	
	
	public static Logger addlog = Logger.getLogger(TC383AddProvider.class);
	@Test
	public static void AddProvider() throws Throwable
	{
		
		Logger logger = addlog;
		logger.info("TC_-383:Validate the user able to add provider");
		//System.out.println("TC383");
		
		//Intermediate page object
		IntermediatePageObjects INM = PageFactory.initElements(GlobalVar.Driver, IntermediatePageObjects.class);
		//Provider page object
		ProviderPageObjects ppo = PageFactory.initElements(GlobalVar.Driver, ProviderPageObjects.class);
		//Add provider page object
		AddProviderPageObjects appo = PageFactory.initElements(GlobalVar.Driver, AddProviderPageObjects.class);
		//Assign region page object
		AssignRegionPageObjects arpo = PageFactory.initElements(GlobalVar.Driver, AssignRegionPageObjects.class);
		//Assign primary account page object
		AssignPrimaryAccountPageObjects apapo = PageFactory.initElements(GlobalVar.Driver, AssignPrimaryAccountPageObjects.class);
		//Assign secondary account page object
		AssignSecondaryAccountPageObjects asapo = PageFactory.initElements(GlobalVar.Driver, AssignSecondaryAccountPageObjects.class);
		//Assign primary facility page object
		AssignPrimaryFacilityPageObjects apfpo = PageFactory.initElements(GlobalVar.Driver, AssignPrimaryFacilityPageObjects.class);
		//Assign secondary facility page object
		AssignSecondaryFacilityPageObjects asfpo = PageFactory.initElements(GlobalVar.Driver, AssignSecondaryFacilityPageObjects.class);
		//Assign committee page object
		AssignCommitteePageObjects acpo = PageFactory.initElements(GlobalVar.Driver, AssignCommitteePageObjects.class);
		//Add call log page object
		AddCallLogPageObjects aclpo = PageFactory.initElements(GlobalVar.Driver, AddCallLogPageObjects.class);
		
		//Click on the Intermediate Page --> Provider Admin

		Thread.sleep(2000);
		/*WebDriverWait wait=new WebDriverWait(GlobalVar.Driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("divproviderAdmin")));*/
		
		
		INM.ClickProviderAdmin();
		logger.info("Clicked on Provider Admin in Intermediate Page");

		//Click on the Provider link in the left Menu Pane
		ppo.ClickLnkProvider();
		logger.info("Clicked on Provider Link in Account Page");
		
		//Add provider page before count records
		appo.CountBefore();
		
		//Click on the Add Provider Button
		ppo.ClickAddProvider();
		logger.info("Clicked on Add Provider button in Provider Page");
		
		//select check box to enter organisation details
		appo.ClickOnOrganizationChkBox();
		
		// Select Provider Category
		appo.SelectProviderCategory("Transportation");
		
		//Enter Provider last Name
		//String filepath = System.getProperty("user.dir")+File.separator + "src" + File.separator + "test"+File.separator+"Data";
		//readExcelFile.getUsernamePassword(filepath, "PD_AddProvider.xlsx", GlobalVar.SheetName, GlobalVar.Client, GlobalVar.Modules);
		String lname=GenericUtils.getData("D:/PHM Automation/hec/src/test/Data/PD/PD_AddProvider.xlsx","PD_AddProvider", 0, 1);
		appo.EnterLastName(lname);
		//appo.EnterLastName();
		
		//Enter Provider middle Name
		appo.EnterMiddleName("Anand");
		
		// Enter Provider first name
		appo.EnterFirstName("Mahesh");
		
		// Enter Provider Title
		appo.EnterTitle("Mr");
		
		// Enter Provider Degree
		appo.EnterDegree("PHD");
		
		// Enter Provider Name Suffix
		appo.EnterSuffix("pryt");
		
		//Enter Provider Identification NPI
		appo.EnterNpi("1111111112");
		
		//Enter Provider Identification Tax ID
		appo.EnterTaxId("394875108");
		
		//Enter Provider Identification State-Assigned ID
		//appo.EnterStateAssignedId("");
		
		//Enter Provider Identification Internal ID	
		appo.EnterinternalId("283764");
		
		//Enter Provider Identification Organisation Assigned ID
		appo.EnterOrganizationAssignedId("8376745");
		
		//Enter Provider Identification State License ID
		appo.EnterStateLicenseId("2435");
		
		//Enter Provider Identification SSN
		appo.EnterSSN("450256654");
		
		//Enter Provider Identification Sub ID/Site ID	
		appo.EnterSubIdSiteId("01982");
		
		//Select Provider Identification Status/DdlProStatus
		appo.SctDdlProStatus("");
		
		//Enter Taxonomy & Description Taxonomy Code Set
		appo.SctDdlTaxonomyCodeSet("");
		
		//Enter Taxonomy & Description Taxonomy Code
		appo.SctDdlTaxonomyCode("");
		
		//Enter Taxonomy & Description Provider Type	
		appo.SctDdlProviderType("");
		
		//Enter Provider Contact Information Last Name
		appo.EnterProviderLastName("Micky");
		
		//Enter Provider Contact Information First Name
		appo.EnterProviderFirstName("David");
		
		//Enter Provider Contact Information Email
		appo.EnterProviderEmail("David.micky@gmail.com");
		
		//Enter Provider Contact Information Address 1
		appo.EnterProviderAddress1("Frezer Town");
		
		//Enter Provider Contact Information Address 2
		appo.EnterProviderAddress2("Silk Board");
		
		//Enter Provider Contact Information City
		appo.EnterProviderCity("Marathalli");
		
		//Enter Provider Contact Information State
		appo.SctDdlProviderState("");
		
		//Enter Provider Contact Information Zip
		appo.EnterProviderZip("29376-4512");
		
		//Enter Provider Contact Information Fax
		appo.EnterProviderFax("234-543-9823");
		
		//Enter Provider Contact Information Phone
		appo.EnterProviderPhone("8524582598");
		
		//Enter Provider Other Information Employed
		appo.SctDdlProviderEmployed("");
		
		//Enter Provider Other Information Preferred communication
		appo.SctDdlcommunication("");
		
		//Enter Provider Other Information Hospital affiliation1
		appo.EnterProviderhospaff1("srupprty");
		
		//Enter Provider Other Information Hospital affiliation2
		appo.EnterProviderhospaff2("Sdtrypi");
		
		//Enter Provider Other Information Hospital affiliation3	
		appo.EnterProviderhospaff3("rtyaup");
		
		//Enter Provider Other Information Hospital affiliation4
		appo.EnterProviderhospaff4("rytuppar");
		
		//Enter Credit / Debit Payment Gateway Merchant Id
		appo.EnterMerchantId("364578");
		
		//Enter Credit / Debit Payment Gateway Information Operator
		appo.EnterOperatorOrUserId("3875674");
		
		//Enter Credit / Debit Payment Gateway Password
		appo.EnterPaymentPassword("@sdjjuri&9");
		
		//Enter Credit / Debit Payment Gateway Device ID
		appo.EnterPaymentDeviceID("id345645");
		
		//Enter Credit / Debit Payment Gateway Enter Registration Key
		appo.EnterRegistrationKey("id3456rt98");
		
		//Select Check Payment Gateway,gateway ddl
		appo.SctDdlGateway("");
		
		//Enter Check Payment Gateway site id
		appo.EnterPaymentSiteId("345608");
		
		//Enter Check Payment Gateway location id
		appo.EnterLocationId("loc608");
		
		//Enter Check Payment Gateway pos program id
		appo.EnterPOSProgramId("adr09878");
		
		//Enter Check Payment Gateway lane id
		appo.EnterLaneId("6789");
						
		//Click on assign region button 
		arpo.ClickAssignRegion();
		
		logger.info("Clicked on Assign Region Button");
		
		//Switch to the Child Window
		appo.switchToWindowByIndex(1);
		
	 
		// Enter Region code to search
		arpo.EnterRegionCode("A2105S");
		
		// Click on the Search Region Button
		arpo.ClickSearchRegion();
				
		//Click select region box
		arpo.ClickSelectRegionBox();
		
		//select region start date
		//arpo.ClickOnFromDateCalendar();
		//GlobalVar.Driver.findElement(By.id("grdAccountList_imgDtFrom_0")).click();
		arpo.ClickOnFromDateCalendar();
		
		// Select the From date
		GlobalVar.Driver.findElement(By.xpath("//td[text()='11']")).click();
		
		//select region termed date
		arpo.ClickOnTermDateCalendar();
		
		//GlobalVar.Driver.findElement(By.id("grdAccountList_imgDtTo_0")).click();
		
		GlobalVar.Driver.findElement(By.xpath("//td[text()='11']")).click();
		
		//select region status
		arpo.SctRegionstatus("");
		
		//Click on singed contract
		arpo.SctSignedContract("");
		
		//click assign region button 
		arpo.ClickAssignUserRegion();
		
		//Switch to parent window		
		appo.switchToWindowByIndex(0);
		
		//Delete assign region 
		//appo.ClickDeleteRegion();
		
				
		//Click on assign primary account button
		apapo.ClickPrimaryAssignAccount();
		
		logger.info("Clicked on Primary Assign Account Button");
				
		//Switch to child window
		appo.switchToWindowByIndex(1);
		
		//Enter accont name
		apapo.EnterAccountName("medicare");
		
		//Enter text id
		//apapo.EnterTaxId("");
				
		//Click on search user region
		apapo.ClickSearchUserRegion();
				
		//Click on link
		apapo.ClickAccountName();
		
		//Switch to parent window
		appo.switchToWindowByIndex(0);
		
		//Click on Assign Secondary Account
		appo.ClickSecondaryAccountButton();
		
		logger.info("Clicked on Secondary Assign Account Button");
		
		//Switch to child window
		appo.switchToWindowByIndex(1);
		
		//Enter secondary accont name
		asapo.EnterSecondaryAccountName("fortis");
		
		//Enter secondary tax id
		//asapo.EnterSecondaryTaxId("067763456");
		
		
		//Click on secondary search account button
		asapo.ClickSeconSearchUser();
		
		//Select one secondary account name
		asapo.ClickSeconAccountName();
		
		//Click on secondary assign account
		asapo.ClickSeconAssignAccount();
		
		//Switch to parent window 
		appo.switchToWindowByIndex(0);
		
		//Click on Assign Primary Facility
		appo.ClickPrimaryFacilityButton();
				
		logger.info("Clicked on Primary facility Button");
		
		//Switch to parent window
		//appo.switchToWindowByIndex(0);
		
		//Switch to child window
		appo.switchToWindowByIndex(1);
		Thread.sleep(2000);
		
		//Switch to parent window
		appo.switchToWindowByIndex(0);
		
		//Switch to child window
		appo.switchToWindowByIndex(1);
		//Enter primary facility name
		apfpo.EnterPryFacilityName("Atlantic Allergy Asthma Center PC");
		
		//Enter Primary facility tax id
		//apfpo.EnterPryFacilityTaxId("223379402");
		
		//Click search facility
		apfpo.ClickPrySearchFacility();
				
		//Click link facility name
		apfpo.ClickPryFacilityName();
		
		//Switch to parent window
		appo.switchToWindowByIndex(0);
		
		//Click on Secondary Facility button
		appo.ClickSecondaryFacilityButton();
		
		logger.info("Clicked on Secondary facility Button");
		
		//Switch to child window
		appo.switchToWindowByIndex(1);
		
		//Enter secondary facility name
		asfpo.EnterSecFacilityName("Andre Ciceron MD");
		
		//Enter secondary facility tax id
		//asfpo.EnterSecFacilityTaxId("117524907");
		
		//Click on search facility button
		asfpo.ClickSecSearchFacility();
		
		//Click on secondary facility link faicility name
		asfpo.ClickSecLnkFacilityName();
		
		//Switch to parent window
		appo.switchToWindowByIndex(0);
		
		//Click on Assign Committee
		appo.ClickAssignCommitteeButton();
		
		logger.info("Clicked on assign committee Button");
		
		//Switch to child window
		appo.switchToWindowByIndex(1);
		
		//Enter committee name
		acpo.EnterCommitteeName("hec committee");
		
		//Click on search committee button
		acpo.ClickSearchComm();
		
		//Click select check box committee name
		acpo.ClickLnkComm();
		
		//Click assign committee
		acpo.ClickAssignCommittee();
		
		//Switch to parent window
		appo.switchToWindowByIndex(0);

		//Click on add call log button
		appo.ClickAddCallLogButton();
		
		logger.info("Clicked on Add call log Button");
		
		//Switch to child window
		appo.switchToWindowByIndex(1);
		Thread.sleep(2000);
		
		appo.switchToWindowByIndex(0);
		
		appo.switchToWindowByIndex(1);
		//Add call log page,select Call log tracker reason type
		aclpo.SctReasonType("");
		
		//Add call log page,contact mode
		aclpo.SctContactMode("");
		
		//Enter communication date
		aclpo.ClickCommDate();
		
		GlobalVar.Driver.findElement(By.xpath("//td[text()='17']")).click();
		
		//Enter created date
		aclpo.ClickCreatedDate();
		GlobalVar.Driver.findElement(By.xpath("//td[text()='17']")).click();
		
		//Enter call log tracker note
		aclpo.EnterNotes("Call log tracker note");
		
		//Add call log page, select contact type
		aclpo.SctContactType("");
		
		//Call log tracker click check box
		aclpo.ClickFollowUp();
		
		//Enter follow up date
		aclpo.ClickFollowupdate();
		GlobalVar.Driver.findElement(By.xpath("//td[text()='17']")).click();
		
		//Enter follow up note
		aclpo.EnterFollowupNotes("Follow up note");
		
		//Call log tracker,click on submit button
		aclpo.ClickCallLogSubmit();
		
		//Switch to parent window
		appo.switchToWindowByIndex(0);
		
		//Enter healthec health plan
		//appo.EnterHealthPlanName("About healthec");
		
		//Select healthec health plan
		//appo.ClickHealthPlan();
		
		//click on transaction type
		//appo.ClickDdlTransactionType(1);
		
		//Enter lagacy id
		//appo.EnterLegacyID("26635");
		
		//Click on add button
		//appo.ClickAddButton();
		
		//Click on save provider
		appo.ClickSaveButton();
		
		//logger.info("Records 1 to 10 of 1897");
		
		//Add provider page successfully message
		appo.CheckValidMsg();
		
		//logger.info("Provider has been created successfully.");
		
		//Add provider page after count records
		appo.CountAfter();
		
		//logger.info("Records 1 to 10 of 1898");
				
		//Click clear button
		//appo.ClickClearButton();
				
	}
}
