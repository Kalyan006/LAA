package com.phm.hec.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.phm.hec.utility.GlobalVar;

public class GenericUtils 
{
	
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	//Select class select by index
	public static void selectDdlByIndex(WebElement ddl, int index) 
	{
		Select sct = new Select(ddl);
		sct.selectByIndex(index);
	}
	//select class select by value
	public static void selectDdlByValue(WebElement ddl, String value) 
	{
		Select sct = new Select(ddl);
		sct.selectByValue(value);
	}
	//select class select by visible text
	public static void selectDdlByVisibleText(WebElement ddl, String visibleText) 
	{
		Select sct = new Select(ddl);
		sct.selectByVisibleText(visibleText);
	}
	//Select class deselect by index
	public static void deselectByIndex(WebElement ddl, int index) 
	{
		Select sct = new Select(ddl);
		sct.deselectByIndex(index);
	}
	//Select class deselect by value
	public static void deselectByValue(WebElement ddl, String value) 
	{
		Select sct = new Select(ddl);
		sct.deselectByValue(value);
	}
	//Select class deselect by visible text
	public static void deselectByVisibleText(WebElement ddl, String visibleText) 
	{
		Select sct = new Select(ddl);
		sct.deselectByVisibleText(visibleText);
	}
	//Select class deselect by all
	public static void deselectAll(WebElement ddl) 
	{
		Select sct = new Select(ddl);
		sct.deselectAll();
	}
	//Pop up accept 
	public static void acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	//Pop up dismiss
	public static void dismiss(WebDriver driver) 
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	//Pop up enter text
	public static void enterText(WebDriver driver, String text) 
	{
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
	}
	//Pop up get alert text
	public static String getAlertText(WebDriver driver) 
	{
		Alert alt = driver.switchTo().alert();
		String data = alt.getText();
		return data;
	}
	//Switch to one window to another window
	public void switchToWindowByIndex(int index) 
	{
		int count = 0;
		Set<String> windows = GlobalVar.Driver.getWindowHandles();
		for (String window : windows) 
		{
			GlobalVar.Driver.switchTo().window(window);
			if (count == index) 
			{
				System.out.println("Switched into window :: " + index);
				break;
			}
			count++;
		}
	}
	//From excel sheet read the data
	public static String getData(String filePath, String sheetName,int rowIndex, int cellIndex) 
	{
		String data = null;
		try 
		{
			File f = new File(filePath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c = r.getCell(cellIndex);
			data = c.toString();
		}
		catch (Exception e) 
		{

		}
		return data;
	}
	//From excel sheet write the data
	public static void setData(String filepath, String sheetName, int rowIndex,int cellIndex, String data) 
	{
		try 
		{
			File f = new File(filepath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c = r.createCell(cellIndex);
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}
		catch (Exception e) 
		{

		}
	}
	//Action class click method
	public void click(WebElement element) 
	{
		Actions act = new Actions(GlobalVar.Driver);
		act.click(element).perform();
	}
	//Action class right click method
	public void contextClick(WebElement element) 
	{
		Actions act = new Actions(GlobalVar.Driver);
		act.contextClick(element).perform();
	}
	//Action class double click method
	public void doubleClick(WebElement element) 
	{
		Actions act = new Actions(GlobalVar.Driver);
		act.doubleClick(element).perform();
	}
	//Action class move to element method
	public void moveToElment(WebElement element) 
	{
		Actions act = new Actions(GlobalVar.Driver);
		act.moveToElement(element).perform();
	}
	//Is element present method
	public boolean isElementPresent(By by) {
	    try {
	      GlobalVar.Driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
	//Is alert present method
	public boolean isAlertPresent() {
	    try {
	    	GlobalVar.Driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }
	//Pop up accept and dismiss method
	public String closeAlertAndGetItsText() {
	    try {
	      Alert alert = GlobalVar.Driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	//Select date from date picker
	public String getDate(int period,String format)
	{
	   Calendar currentDate = Calendar.getInstance();
	   SimpleDateFormat formatter= new SimpleDateFormat(format);
	   currentDate.add(Calendar.DAY_OF_MONTH, period);
	   String date = formatter.format(currentDate.getTime());
	   return date;
	}
	
	public void navigateToMenu(String strMenu){
   	 if (strMenu.toLowerCase().equals("users")){
   		String baseUrl = null;
		GlobalVar.Driver.navigate().to(baseUrl+"/User/List");
   	 }
    }
	
	public String addDateTime(String strInput){
   	 	Date date = new Date();	 
		return strInput+ date.getTime();
    }
	
	public boolean IsElementPresent(String strElement){
		GlobalVar.Driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
		boolean exists = GlobalVar.Driver.findElements(By.id(strElement)).size() !=0;
		GlobalVar.Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return exists;
	 }
	
	
	
	
}
