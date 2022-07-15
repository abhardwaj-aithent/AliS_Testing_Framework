package com.AliS.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Base.BaseClassAliS;
import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;
import com.AliS.Utility.Helper;

public class AliS_TC_001 extends BaseClassAliS  {

@Test(priority=1)
public void SmokeTestCaseScenario1() throws Exception {
	
ExcelDataProvider excel=new ExcelDataProvider();
logger= report.createTest("Individual Information Tab _Renewal Alert Skipped");
LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
logger.info("AliS_Renewal Application Started alert skipped");
loginpage.LoginToAlis( excel.getStringData("LoginAlis",1,0),excel.getStringData("LoginAlis",1, 1));
Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
IIT.RenewButtonClick();
IIT.PersonalInformationSection(excel.getStringData("RenewalTestData", 1, 0), excel.getStringData("RenewalTestData", 1, 1));
IIT.AdditionalInfo();
IIT.AdditionalCardInformationsection(excel.getStringData("RenewalTestData", 1, 2), excel.getStringData("RenewalTestData", 1, 3),excel.getStringData("RenewalTestData", 1, 4));
Thread.sleep(1000);
IIT.LogoutButton();
Helper.HandleAlertWindow1(driver);
Thread.sleep(2000);
logger.pass("AliS_Renewal Application Started alert skipped succesfully");
	}

@Test(priority=2)
public void SmokeTestCaseScenario2() throws Exception {
	
ExcelDataProvider excel=new ExcelDataProvider();
logger= report.createTest("Renewal Alert Handle first -->Then Start Application from View/Pending Online Application page");
LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
logger.info("AliS_Renewal Application Started alert Handle");
loginpage.LoginToAlis(excel.getStringData("LoginAlis",3,0),excel.getStringData("LoginAlis",3,1));
Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
IIT.RenewButtonClick();
IIT.HandleAlertWindow();
IIT.PersonalInformationSection(excel.getStringData("RenewalTestData", 1, 0), excel.getStringData("RenewalTestData", 1, 1));
IIT.AdditionalInfo();
IIT.AdditionalCardInformationsection(excel.getStringData("RenewalTestData", 1, 2), excel.getStringData("RenewalTestData", 1, 3),excel.getStringData("RenewalTestData", 1, 4));
Thread.sleep(1000);
IIT.LogoutButton();
Helper.HandleAlertWindow1(driver);
Thread.sleep(2000);
logger.pass("AliS_Renewal Application Started alert Handle");

}


@Test(priority=3)
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

@Test(priority=5)
public void Individual_Information_Tab_TestCase4() throws Exception {
	ExcelDataProvider excel=new ExcelDataProvider();
	logger= report.createTest("Individual Information Tab _ValidationTest");
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	logger.info("AliS_Renewal Application --Individual_InformationTab validations notssss Handle");
	loginpage.LoginToAlis( excel.getStringData("LoginAlis",5,0),excel.getStringData("LoginAlis", 5, 1));
	Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
	IIT.RenewButtonClick();
	IIT.NextButton();
	IIT.CaptureValidation();
	IIT.LogoutButton1();

	logger.fail("AliS_Renewal Application --Individual_InformationTab validations not Handle");
	}	

@Test(priority=4)
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
logger.pass("AliS_Renewal Application Started alert handle for license who are not up for renew");
	}

}




