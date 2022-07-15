package com.AliS.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Pages.Address_Information_Tab;
import com.AliS.Pages.BaseClassAliS;
import com.AliS.Pages.Credential_Information_Tab;
import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;

public class Credential_Information_Test extends BaseClassAliS {

	@Test
	public void CredentialInformationTab_Test() throws Exception {
		
		ExcelDataProvider excel=new ExcelDataProvider();
	
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.LoginToAlis( excel.getStringData("LoginAlis",0,0),excel.getStringData("LoginAlis", 0, 1));
	
		Individual_Information_Tab  IIT=PageFactory.initElements(driver, Individual_Information_Tab.class);
		IIT.RenewButtonClick();
		IIT.HandleAlertWindow();
		IIT.PersonalInformationSection(excel.getStringData("RenewalTestData", 1, 0), excel.getStringData("RenewalTestData", 1, 1));
		IIT.AdditionalInfo();
		IIT.AdditionalCardInformationsection(excel.getStringData("RenewalTestData", 1, 2), excel.getStringData("RenewalTestData", 1, 3),excel.getStringData("RenewalTestData", 1, 4));
		IIT.NextButton();
	
		Address_Information_Tab AITAB=PageFactory.initElements(driver, Address_Information_Tab.class);
		AITAB.ResidenceAddressCopy();
		AITAB.NextButton();
		
		Credential_Information_Tab CIT=PageFactory.initElements(driver,Credential_Information_Tab.class );
		CIT.NextButton();
	}
	}
	
