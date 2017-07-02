package com.phm.hec.PD.Testcases;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddRegion {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://phmadmin.healthec.com/PPOCR0145/";
    //baseUrl = "https://phmadmin.healthec.com/PPOCR0145/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test3() throws Exception {
    // open | /PPOCR0145/phmhome.aspx |
	driver.get(baseUrl);
    //driver.get(baseUrl + "/PPOCR0145/phmhome.aspx");
    // click | id=txtLogin | 
    driver.findElement(By.id("txtLogin")).click();
    // type | id=txtLogin | ppo_pd
    driver.findElement(By.id("txtLogin")).clear();
    driver.findElement(By.id("txtLogin")).sendKeys("ppo_pd");
    // click | id=txtPwd | 
    driver.findElement(By.id("txtPwd")).click();
    // type | id=txtPwd | Password@2017
    driver.findElement(By.id("txtPwd")).clear();
    driver.findElement(By.id("txtPwd")).sendKeys("Password@2017");
    // click | id=buttonlogin | 
    driver.findElement(By.id("buttonlogin")).click();
    // click | id=lnkProviderAdmin | 
    driver.findElement(By.id("lnkProviderAdmin")).click();
    // click | xpath=(//h3[@id='10039'])[3] | 
    driver.findElement(By.xpath("(//h3[@id='10039'])[3]")).click();
    // click | id=ContentPlaceHolder1_btnAddProvider | 
    driver.findElement(By.id("ContentPlaceHolder1_btnAddProvider")).click();
    // click | id=ContentPlaceHolder1_btnAssignRegion | 
    driver.findElement(By.id("ContentPlaceHolder1_btnAssignRegion")).click();
    // type | id=txtACOOrgID | PV125
    driver.findElement(By.id("txtACOOrgID")).clear();
    driver.findElement(By.id("txtACOOrgID")).sendKeys("PV125");
    // click | id=btnSearchUserAssign | 
    driver.findElement(By.id("btnSearchUserAssign")).click();
    // click | id=grdAccountList_chkBoxACOId_0 | 
    driver.findElement(By.id("grdAccountList_chkBoxACOId_0")).click();
    // click | id=grdAccountList_imgDtFrom_0 | 
    driver.findElement(By.id("grdAccountList_imgDtFrom_0")).click();
    // click | //div[@id='calendarDiv']/div[7]/table/tbody/tr[2]/td[7] | 
    driver.findElement(By.xpath("//div[@id='calendarDiv']/div[7]/table/tbody/tr[2]/td[7]")).click();
    // click | id=grdAccountList_imgDtTo_0 | 
    driver.findElement(By.id("grdAccountList_imgDtTo_0")).click();
    // click | //div[@id='calendarDiv']/div[7]/table/tbody/tr[5]/td[5] | 
    driver.findElement(By.xpath("//div[@id='calendarDiv']/div[7]/table/tbody/tr[5]/td[5]")).click();
    // select | id=grdAccountList_ddlACOStatus_0 | label=Active
    new Select(driver.findElement(By.id("grdAccountList_ddlACOStatus_0"))).selectByVisibleText("Active");
    // click | css=option[value="1"] | 
    driver.findElement(By.cssSelector("option[value=\"1\"]")).click();
    // select | id=grdAccountList_ddlSignedContract_0 | label=Yes
    new Select(driver.findElement(By.id("grdAccountList_ddlSignedContract_0"))).selectByVisibleText("Yes");
    // click | css=#grdAccountList_ddlSignedContract_0 > option[value="1"] | 
    driver.findElement(By.cssSelector("#grdAccountList_ddlSignedContract_0 > option[value=\"1\"]")).click();
    // click | id=btnAssignUserAccount | 
    driver.findElement(By.id("btnAssignUserAccount")).click();
    // click | css=img[title="Logout"] | 
    driver.findElement(By.cssSelector("img[title=\"Logout\"]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
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
}
