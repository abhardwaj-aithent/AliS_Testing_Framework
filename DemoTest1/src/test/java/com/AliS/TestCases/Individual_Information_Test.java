package com.AliS.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.AliS.Pages.BaseClassAliS;
import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;

public class Individual_Information_Test extends BaseClassAliS {
	
	@Test(priority=1)
	public void Individual_Information_Tab_TestCase1() throws Exception {
	ExcelDataProvider excel=new ExcelDataProvider();
	logger= report.createTest("Individual Information Tab _Renewal Alert Handle");
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	logger.info("AliS_Renewal Application Started alert Handle");
	loginpage.LoginToAlis( excel.getStringData("LoginAlis",0,0),excel.getStringData("LoginAlis", 0, 1));
	Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
	IIT.RenewButtonClick();
	IIT.HandleAlertWindow();
	IIT.PersonalInformationSection(excel.getStringData("RenewalTestData", 1, 0), excel.getStringData("RenewalTestData", 1, 1));
	IIT.AdditionalInfo();
	IIT.AdditionalCardInformationsection(excel.getStringData("RenewalTestData", 1, 2), excel.getStringData("RenewalTestData", 1, 3),excel.getStringData("RenewalTestData", 1, 4));
	IIT.NextButton();
	logger.pass("AliS_Renewal Application Started alert Handle and redirected to Individual Tab");

	}
	
	
	
	@Test(priority=2)
	public void Individual_Information_Tab_TestCase2() throws Exception {
	ExcelDataProvider excel=new ExcelDataProvider();
	logger= report.createTest("Individual Information Tab _Renewal Alert Skipped");
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	logger.info("AliS_Renewal Application Started alert skipped");
	loginpage.LoginToAlis( excel.getStringData("LoginAlis",1,0),excel.getStringData("LoginAlis", 1, 1));
	Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
	IIT.RenewButtonClick();
	IIT.PersonalInformationSection(excel.getStringData("RenewalTestData", 1, 0), excel.getStringData("RenewalTestData", 1, 1));
	IIT.AdditionalInfo();
	IIT.AdditionalCardInformationsection(excel.getStringData("RenewalTestData", 1, 2), excel.getStringData("RenewalTestData", 1, 3),excel.getStringData("RenewalTestData", 1, 4));
	IIT.NextButton();
	logger.pass("AliS_Renewal Application Started alert skipped succesfully");
	
	}
	
	
	@Test(priority=3)
		public void Individual_Information_Tab_TestCase3() throws Exception {
		ExcelDataProvider excel=new ExcelDataProvider();
		logger= report.createTest("Individual Information Tab _ValidationTest");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("AliS_Renewal Application --Individual_InformationTab validations Handle");
		loginpage.LoginToAlis( excel.getStringData("LoginAlis",2,0),excel.getStringData("LoginAlis", 2, 2));
		Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
		IIT.RenewButtonClick();
		IIT.NextButton();
		IIT.CaptureValidation();
		logger.pass("AliS_Renewal Application --Individual_InformationTab validations Handle succesfully");
		
	}	

	@Test(priority=4)
	public void Individual_Information_Tab_TestCase4() throws Exception {
		ExcelDataProvider excel=new ExcelDataProvider();
		logger= report.createTest("Individual Information Tab _ValidationTest");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("AliS_Renewal Application --Individual_InformationTab validations Handle");
		loginpage.LoginToAlis( excel.getStringData("LoginAlis",1,0),excel.getStringData("LoginAlis", 1, 1));
		Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
		IIT.RenewButtonClick();
		IIT.NextButton();
		IIT.CaptureValidation();
		logger.fail("AliS_Renewal Application --Individual_InformationTab validations not Handle");
		}	
	}
