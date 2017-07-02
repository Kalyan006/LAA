package com.phm.hec.utility;

import java.io.File;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class GlobalVar 
{

	public static String TestRequestor = "";
	public static String URL = "";
	public static String Username="";
	public static String Password="";
	public static String Client = "";
	public static String Environment = "";
	public static String Requester = "";
	public static String Driverpath = "";
	public static String Browser = "";
	public static String Modules = "";
	public static String TestType = "";
	public static String SheetName = "";
	
	public static String TestDataPath="";
	public static WebDriver Driver= null;
	
	public static String LoginUsername = null;
	public static String LoginPassword = null;
	
	public static Boolean loggedin = false;
	
	//Reports public variables
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	// Configuration file paths
	
	public static final String configPropFilePath = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "test" + File.separator + "config" + File.separator + "config.properties";
	public static final String urlsPropFilePath = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "test" + File.separator + "config" + File.separator + "urls.properties";
	
	public static final String BrowserDriverPath = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "browserdrivers";
	
	// Log4j Variables
	//public static final String executionLogFilePath = System.getProperty("user.dir")+ File.separator + "executionLogs" + File.separator + "executionLog.log";	
	
}
