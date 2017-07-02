package com.phm.hec.utility;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.Reporter;
import com.phm.hec.initializer.Initializer;

public class ReportGenerator extends Initializer 
{

	public static void setLog(String LogMessage)
	{
		Date date=new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		addlog.info(LogMessage);
		
		Reporter.log(dateFormat.format(date)+":-"+LogMessage);
	}
	public static void setLog(String LogMessage, Exception exceptioMessage)
	{
		Date date=new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		addlog.info(LogMessage+"--Exception is :"+exceptioMessage);
		Reporter.log(dateFormat.format(date)+":-"+LogMessage+"--Exception is :"+exceptioMessage);
	}
	
	public static void setLog(String LogMessage, String exceptioMessage, String TestDetails) throws IOException
	{
		Date date=new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 
		addlog.info(LogMessage+"--Exception is :"+exceptioMessage);
		Reporter.log(dateFormat.format(date)+":-"+LogMessage+"--Exception is :"+exceptioMessage);
		ScreenshotGenerator.ScreenShot_AddToXSLT(TestDetails, " ");
		
	}
	
	public static void setLog(String LogMessage, Exception exceptioMessage, String TestDetails) throws IOException
	{
		Date date=new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 
		addlog.info(LogMessage+"--Exception is :"+exceptioMessage);
		Reporter.log(dateFormat.format(date)+":-"+LogMessage+"--Exception is :"+exceptioMessage);
		ScreenshotGenerator.ScreenShot_AddToXSLT(TestDetails, exceptioMessage.toString());
		
	}
}
