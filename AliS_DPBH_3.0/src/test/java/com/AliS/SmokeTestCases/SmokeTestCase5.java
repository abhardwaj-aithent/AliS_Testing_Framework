package com.AliS.SmokeTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Base.BaseClassAliS;
import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;
import com.AliS.Utility.Helper;

public class SmokeTestCase5 extends BaseClassAliS{


	@Test
	public void SmokeTestCaseScenario5() throws Exception {
		
	ExcelDataProvider excel=new ExcelDataProvider();
	logger= report.createTest("AliS_Renewal Application_ License Not up for renew.");
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	logger.info("AliS_Renewal Application_License Not up for renew Handle alert.");
	loginpage.LoginToAlis( excel.getStringData("LoginAlis",6,0),excel.getStringData("LoginAlis", 6, 1));
	Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
	IIT.RenewButtonClick();
	Helper.HandleAlertWindow_common(driver);
	IIT.LogoutButton1();
	Thread.sleep(2000);
	

	//Helper.AlertScrenshot(driver);
	
	//IIT.PersonalInformationSection(excel.getStringData("RenewalTestData", 1, 0), excel.getStringData("RenewalTestData", 1, 1));
	//LogoutButton();
	logger.pass("AliS_Renewal Application Started alert handle for license who are not up for renew");
		}
}
