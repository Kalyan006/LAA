package com.phm.hec.PD.Testcases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.phm.hec.CM.FormResourceAndEducationObjects.FormResourceAndEducationObjects;
import com.phm.hec.PD.UploadFileObjects.UploadFileObjects;
import com.phm.hec.pageObjects.IntermediatePageObjects;
import com.phm.hec.utility.GlobalVar;

public class TC398UploadFile {

	public static Logger addlog = Logger.getLogger(TC398UploadFile.class.getName());
	public static String FILE_PATH="D:/PHM Automation/hec/src/test/Data/userdetails.xlsx";
	@Test
	
	public static void UploadFile() throws Throwable
	{
	Logger logger = addlog;
	UploadFileObjects UFO = PageFactory.initElements(GlobalVar.Driver, UploadFileObjects.class);
	IntermediatePageObjects INM = PageFactory.initElements(GlobalVar.Driver, IntermediatePageObjects.class);
	FormResourceAndEducationObjects FRE =PageFactory.initElements(GlobalVar.Driver, FormResourceAndEducationObjects.class);
	
	Thread.sleep(2000);
	//click on provider admin
	INM.ClickProviderAdmin();
	logger.info("Clicking on Provider Admin Home Tab...");
			
	//click on Document admin link
	UFO.Documentadmin();
			
	Thread.sleep(2000);
	//click on upload file link
	UFO.clickUploadFile();
	
	//count the record before Uploading
	
	String xp = "//span[@id='ContentPlaceHolder1_lblRecordInfo1']";
	String text = GlobalVar.Driver.findElement(By.xpath(xp)).getText();
	logger.info("Total Number of Records Before Uploading ......." + text.substring(text.lastIndexOf("of") + 3));
	
	    
	//browse the file & select the file from location
	//UFO.Clickbrowsebtn();
	GlobalVar.Driver.findElement(By.id("FileUpload")).sendKeys("D:\\Error.PNG");
	logger.info("File has been Uploading...");
			
	//search the document category from drop down list
	UFO.Selectdoccatagory2(2);
			
	//click on upload button
	UFO.clickuploadbtn();
			
	//count the record after uploading
	
	String xp1 = "//span[@id='ContentPlaceHolder1_lblRecordInfo1']";
	String text1 = GlobalVar.Driver.findElement(By.xpath(xp1)).getText();
	String TotalPd = text1.substring(text1.lastIndexOf("of") + 3);
	logger.info("Total Number of Records After Uploading ......." + TotalPd );

	//search the document based on the category
	UFO.Selectdoccatagory1(2);
	UFO.ClickbtnSearchDocument();
	
	//count the record based on the category
	String xp2 = "//span[@id='ContentPlaceHolder1_lblRecordInfo1']";
	String text2 = GlobalVar.Driver.findElement(By.xpath(xp2)).getText();
	String a = text2.substring(text2.lastIndexOf("of") + 3);
	logger.info(a);
	
	//logger.info(text2.substring(text2.lastIndexOf("of") + 3));
	
	//String xp2="//table[@id='ContentPlaceHolder1_grdUploadFileList']/tbody/tr";
	//int count2 = GlobalVar.Driver.findElements(By.xpath(xp)).size();
	//logger.info("total records count ......." + count );  
	  
	//back to Intermediate page
	
	UFO.clickPHMlink();
	Thread.sleep(2000);
	//click on care Manager tab
	INM.ClickOnCareManagerLink();
	logger.info("Clicking on care manger home tab..");
	Thread.sleep(3000);
			
	//click on care management link
	FRE.ClickCareManagement();
	logger.info("Clicking Care Manager Link..");
			
	// click on Form Resource and Education Link
	FRE.ClickFormResourceEducation();
	
	//Click on Form And template
    FRE.ClickFormAndTemplate();
	
	logger.info("Clicking form resource and education link.");
	String xp3=".//*[@id='content_inner']/div[4]/div";
	String text3 = GlobalVar.Driver.findElement(By.xpath(xp3)).getText();
	System.out.println(text3);
	
	String sentence = "This is an important example about regex for my work and for me";
	Pattern pattern = Pattern.compile("(?<=an).*.(?=for)");
	Matcher matcher = pattern.matcher(sentence);

	boolean found = false;
	while (matcher.find()) {
	    System.out.println("I found the text: " + matcher.group().toString());
	    found = true;
	}
	if (!found) {
	    System.out.println("I didn't found the text");
	}
	
	//Click on Form And template
	//FRE.ClickFormAndTemplate();
	
	
	
	//Click on Reference Guides
//	FRE.ClickRefernceGuides();
	
	
	
	
	
	
	}
		
}
