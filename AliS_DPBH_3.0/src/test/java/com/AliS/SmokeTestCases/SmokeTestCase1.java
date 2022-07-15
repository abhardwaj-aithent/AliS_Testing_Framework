package com.AliS.SmokeTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;

public class SmokeTestCase1  extends com.AliS.Base.BaseClassAliS {
	
	@Test
	public void SmokeTestCaseScenario1() throws Exception {
	ExcelDataProvider excel=new ExcelDataProvider();
	logger= report.createTest("Individual Information Tab _Renewal Alert Skipped");
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	logger.info("AliS_Renewal Application Started alert skipped");
	loginpage.LoginToAlis( excel.getStringData("LoginAlis",8,0),excel.getStringData("LoginAlis",8, 1));
	Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
	IIT.RenewButtonClick();
	IIT.PersonalInformationSection(excel.getStringData("RenewalTestData", 1, 0), excel.getStringData("RenewalTestData", 1, 1));
	IIT.AdditionalInfo();
	IIT.AdditionalCardInformationsection(excel.getStringData("RenewalTestData", 1, 2), excel.getStringData("RenewalTestData", 1, 3),excel.getStringData("RenewalTestData", 1, 4));
	Thread.sleep(1000);
	//IIT.LogoutButton();
	//Helper.HandleAlertWindow1(driver);
	Thread.sleep(2000);
	logger.pass("AliS_Renewal Application Started alert skipped succesfully");
	
		}
	}
