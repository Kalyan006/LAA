package com.phm.hec.PD.Testcases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.phm.hec.PD.Objects.AddProviderPageObjects;
import com.phm.hec.PD.Objects.AddUserAssignAccountPageObject;
import com.phm.hec.PD.Objects.AddUserAssignProviderPageObject;
import com.phm.hec.PD.Objects.AddUserAssignRegionPageObject;
import com.phm.hec.PD.Objects.AddUserAssignRolePageObject;
import com.phm.hec.PD.Objects.AddUserPageObject;
import com.phm.hec.PD.Objects.ProviderAdminPageObjects;
import com.phm.hec.pageObjects.IntermediatePageObjects;
import com.phm.hec.utility.GlobalVar;

public class TC444AddUser {
	@SuppressWarnings("deprecation")
	@Test
	public static void AddUser() throws Throwable {
		IntermediatePageObjects IntMedPage = PageFactory.initElements(GlobalVar.Driver, IntermediatePageObjects.class);
		ProviderAdminPageObjects PAP = PageFactory.initElements(GlobalVar.Driver, ProviderAdminPageObjects.class);
		AddUserPageObject APO = PageFactory.initElements(GlobalVar.Driver, AddUserPageObject.class);
		AddProviderPageObjects appo = PageFactory.initElements(GlobalVar.Driver, AddProviderPageObjects.class);
		//AddUserAssignRolePageObject arpo = PageFactory.initElements(GlobalVar.Driver,AddUserAssignRolePageObject.class);
		AddUserAssignAccountPageObject aapo = PageFactory.initElements(GlobalVar.Driver,AddUserAssignAccountPageObject.class);
		AddUserAssignProviderPageObject uapo = PageFactory.initElements(GlobalVar.Driver,AddUserAssignProviderPageObject.class);
		AddUserAssignRolePageObject uarpo = PageFactory.initElements(GlobalVar.Driver,AddUserAssignRolePageObject.class);
		AddUserAssignRegionPageObject auarpo = PageFactory.initElements(GlobalVar.Driver,AddUserAssignRegionPageObject.class);
		Thread.sleep(GlobalVar.threadSleep);
		IntMedPage.ClickProviderAdmin();
		PAP.ClickLnkUser();
		PAP.ClickAddUser();
		String filepath = GlobalVar.TestDataAddUserTC444FilePath;
		File AddUsersrc = new File(filepath);
		FileInputStream fis = new FileInputStream(AddUsersrc);

		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("PD_AddUser");
		int rows = sheet.getLastRowNum() + 1;
		int cols = sheet.getRow(1).getLastCellNum();
		for (int rownum = 1; rownum < rows; rownum++) {

			sheet.getRow(rownum).getCell(cols - 1).setCellType(Cell.CELL_TYPE_STRING);
			String executeyn = sheet.getRow(rownum).getCell(cols - 1).getStringCellValue();
			String ExecuteYN = executeyn.toUpperCase().trim();
			Boolean Execute = ExecuteYN.equals("YES");
			if (Execute == true) {
				sheet.getRow(rownum).getCell(0).setCellType(Cell.CELL_TYPE_STRING);
				String LastName = sheet.getRow(rownum).getCell(0).getStringCellValue();
				APO.EnterLastName(LastName);
				sheet.getRow(rownum).getCell(1).setCellType(Cell.CELL_TYPE_STRING);
				String FirstName = sheet.getRow(rownum).getCell(1).getStringCellValue();
				APO.EnterFirstName(FirstName);
				sheet.getRow(rownum).getCell(2).setCellType(Cell.CELL_TYPE_STRING);
				String EmailID = sheet.getRow(rownum).getCell(2).getStringCellValue();
				APO.EnterEmailAddress(EmailID);
				sheet.getRow(rownum).getCell(3).setCellType(Cell.CELL_TYPE_STRING);
				String PhoneNumber = sheet.getRow(rownum).getCell(3).getStringCellValue();
				APO.EnterPhoneNum(PhoneNumber);
				sheet.getRow(rownum).getCell(4).setCellType(Cell.CELL_TYPE_STRING);
				String UserName = sheet.getRow(rownum).getCell(4).getStringCellValue();
				APO.EnterUserName(UserName);
				sheet.getRow(rownum).getCell(5).setCellType(Cell.CELL_TYPE_STRING);
				String Password = sheet.getRow(rownum).getCell(5).getStringCellValue();
				APO.EnterPassword(Password);
				sheet.getRow(rownum).getCell(6).setCellType(Cell.CELL_TYPE_STRING);
				String Address1 = sheet.getRow(rownum).getCell(6).getStringCellValue();
				APO.EnterAddress1(Address1);
				sheet.getRow(rownum).getCell(7).setCellType(Cell.CELL_TYPE_STRING);
				String Address2 = sheet.getRow(rownum).getCell(7).getStringCellValue();
				APO.EnterAddress2(Address2);
				sheet.getRow(rownum).getCell(8).setCellType(Cell.CELL_TYPE_STRING);
				String CityName = sheet.getRow(rownum).getCell(8).getStringCellValue();
				APO.EnterCityName(CityName);

			/*	sheet.getRow(rownum).getCell(9).setCellType(Cell.CELL_TYPE_STRING); String
				StateName=sheet.getRow(rownum).getCell(9).getStringCellValue();
				APO.SelectState(StateName);*/

				sheet.getRow(rownum).getCell(10).setCellType(Cell.CELL_TYPE_STRING);
				String ZipCode = sheet.getRow(rownum).getCell(10).getStringCellValue();
				APO.EnterZipCode(ZipCode);
				sheet.getRow(rownum).getCell(11).setCellType(Cell.CELL_TYPE_STRING);
				String TitalName = sheet.getRow(rownum).getCell(11).getStringCellValue();
				APO.EnterTitle(TitalName);
				sheet.getRow(rownum).getCell(12).setCellType(Cell.CELL_TYPE_STRING);
				String PhoneNumber1 = sheet.getRow(rownum).getCell(12).getStringCellValue();
				APO.EnterPhoneNumber1(PhoneNumber1);
				sheet.getRow(rownum).getCell(13).setCellType(Cell.CELL_TYPE_STRING);
				String PhoneNumber2 = sheet.getRow(rownum).getCell(13).getStringCellValue();
				APO.EnterPhoneNumber2(PhoneNumber2);
				sheet.getRow(rownum).getCell(14).setCellType(Cell.CELL_TYPE_STRING);
				String FaxNumber = sheet.getRow(rownum).getCell(14).getStringCellValue();
				APO.EnterFaxNumber(FaxNumber);
				sheet.getRow(rownum).getCell(15).setCellType(Cell.CELL_TYPE_STRING);
				String Responsibility = sheet.getRow(rownum).getCell(15).getStringCellValue();
				APO.EnterResponsibility(Responsibility);
				APO.ClickAssignRegion();
				appo.switchToWindowByIndex(1);
				sheet.getRow(rownum).getCell(16).setCellType(Cell.CELL_TYPE_STRING);
				String RegionCode = sheet.getRow(rownum).getCell(16).getStringCellValue();
				auarpo.EnterRegionCode(RegionCode);
				auarpo.ClickSearchRegion();
				auarpo.SelectChkBox();
				auarpo.ClickAssignRegion();
				Thread.sleep(GlobalVar.threadSleep);
				appo.switchToWindowByIndex(0);
				APO.ClickAssignAccount();
				appo.switchToWindowByIndex(1);
				sheet.getRow(rownum).getCell(17).setCellType(Cell.CELL_TYPE_STRING);
				String taxid = sheet.getRow(rownum).getCell(17).getStringCellValue();
				aapo.EnterTaxID(taxid);
				aapo.ClickSearchAccount();
				aapo.ClickCheckBox();
				aapo.ClickAssignAccount();
				Thread.sleep(GlobalVar.threadSleep);
				appo.switchToWindowByIndex(0);
				APO.ClickAssinProvidert();
				appo.switchToWindowByIndex(1);
				sheet.getRow(rownum).getCell(18).setCellType(Cell.CELL_TYPE_STRING);
				String NPI = sheet.getRow(rownum).getCell(18).getStringCellValue();
				uapo.EnterNPI(NPI);
				uapo.ClickSearchProvider();
				uapo.SelectCheckBox();
				uapo.ClickAssignProvider();
				Thread.sleep(GlobalVar.threadSleep);
				appo.switchToWindowByIndex(0);
				APO.ClickAssinRole();
				appo.switchToWindowByIndex(1);
				sheet.getRow(rownum).getCell(19).setCellType(Cell.CELL_TYPE_STRING);
				String RoleName = sheet.getRow(rownum).getCell(19).getStringCellValue();
				uarpo.EnterRoleName(RoleName);
				uarpo.ClickSearchRole();
				uarpo.SelectRoleHandIcon();
				Thread.sleep(GlobalVar.threadSleep);
				appo.switchToWindowByIndex(0);
				APO.SelectWlcmChkBox();
				APO.SelectResetPwdChkBox();
				APO.SelectDisableButton();


			}
		}
	}
}