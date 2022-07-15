package com.AliS.SmokeTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Pages.BaseClassAliS;
import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;

public class SmokeTestCase4 extends BaseClassAliS{
	@Test
	public void Individual_Information_Tab_TestCase4() throws Exception {
		ExcelDataProvider excel=new ExcelDataProvider();
		logger= report.createTest("Individual Information Tab _ValidationTest");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("AliS_Renewal Application --Individual_InformationTab validations Handle");
		loginpage.LoginToAlis( excel.getStringData("LoginAlis",0,0),excel.getStringData("LoginAlis", 0, 1));
		Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
		IIT.RenewButtonClick();
		IIT.NextButton();
		IIT.CaptureValidation();
		logger.fail("AliS_Renewal Application --Individual_InformationTab validations not Handle");
		}	
}
