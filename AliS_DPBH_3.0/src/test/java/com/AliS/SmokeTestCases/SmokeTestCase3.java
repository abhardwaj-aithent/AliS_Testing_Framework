package com.AliS.SmokeTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;

public class SmokeTestCase3 extends com.AliS.Base.BaseClassAliS  {

	@Test
	public void SmokeTestCaseScenario3() throws Exception {
	ExcelDataProvider excel=new ExcelDataProvider();
	logger= report.createTest("Individual Information Tab _ValidationTest");
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	logger.info("AliS_Renewal Application --Individual_InformationTab validations Handle");
	loginpage.LoginToAlis( excel.getStringData("LoginAlis",2,0),excel.getStringData("LoginAlis", 2, 1));
	Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
	IIT.RenewButtonClick();
	IIT.NextButton();
	IIT.CaptureValidation();
	Thread.sleep(2000);
    IIT.LogoutButton1();
    Thread.sleep(2000);
	logger.pass("AliS_Renewal Application --Individual_InformationTab validations Handle succesfully");
	}
}	