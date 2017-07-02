package com.phm.hec.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.phm.hec.initializer.Initializer;
import com.phm.hec.utility.ReadExcelFile;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.phm.hec.utility.GlobalVar;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;


public class initiate {
	ExtentTest initiate;
	static ExtentReports report;
  @Test
   
  public void loginn() throws Exception {
	  report = new ExtentReports(GlobalVar.ExtentReportPath, true);
	  initiate = report.startTest("Initiation","Automation Execution Initiated");
	  System.out.println("Test Starting");
	  initiate.log(LogStatus.INFO, "Initializing");
	  Initializer.initialize();
	  
	  System.out.println("Reading XL file for Username / Password");
	  initiate.log(LogStatus.INFO, "Reading XL file for Username / Password");
	  ReadExcelFile readExcelFile = new ReadExcelFile();
	  
	  try {
			//readExcelFile.readUsernmePassword("D:\\Automation\\PHMSuite\\PHM\\src\\test\\Data\\", "userdetails.xlsx", "UAT", "AHG_UAT", "PD");
			String filepath = System.getProperty("user.dir")+File.separator + "src" + File.separator + "test"+File.separator+"Data";
			//readExcelFile.getUsernamePassword(filepath, "userdetails.xlsx", "UAT", "AHG_UAT", "PD");
			readExcelFile.getUsernamePassword(filepath, "userdetails.xlsx", GlobalVar.SheetName, GlobalVar.Client, GlobalVar.Modules);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Login.login1(GlobalVar.LoginUsername, GlobalVar.LoginPassword);
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite(){
	  GlobalVar.extent = new ExtentReports("D:\\PHM Automation\\hec\\Reports\\automationreport.html", true);
	  GlobalVar.extent.loadConfig(new File( "D:\\PHM Automation\\hec\\src\\test\\config\\extent-reports.xml"));
  }
  
  @BeforeMethod
  public void beforeMethod(Method method){
	  
	  GlobalVar.test = GlobalVar.extent.startTest(this.getClass().getSimpleName() + ":: " + method.getName(), method.getName());
	  GlobalVar.test.assignAuthor(GlobalVar.Requester);
	  GlobalVar.test.assignCategory(GlobalVar.TestType + "Client : " + GlobalVar.Client + "Environment : " + GlobalVar.Environment);	  
  }
}
