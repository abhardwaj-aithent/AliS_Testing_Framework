package com.AliS.RegressionTestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Pages.Address_Information_Tab;
import com.AliS.Pages.Attestation_Tab;
import com.AliS.Pages.BaseClassAliS;
import com.AliS.Pages.Child_Support_Tab;
import com.AliS.Pages.Credential_Information_Tab;
import com.AliS.Pages.FeeDetail_PaymentGateway_Tab;
import com.AliS.Pages.Individual_Information_Tab;
import com.AliS.Pages.LoginPage;
import com.AliS.Pages.Question_Tab;
import com.AliS.Utility.ExcelDataProvider;
import com.AliS.Utility.Helper;

public class RegressionTesting  extends BaseClassAliS{

		@Test(priority=1)
		public void RegressionTestCase1() throws Exception {
			ExcelDataProvider excel=new ExcelDataProvider();
			logger= report.createTest("Renewal Application Regression TestCase1");
			LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
			loginpage.LoginToAlis( excel.getStringData("LoginAlis",0,0),excel.getStringData("LoginAlis", 0, 1));
			logger.info("AliS_Renewal Application Regreession Flow Test1 ");
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
		    Thread.sleep(2000);
			
		    Credential_Information_Tab CIT=PageFactory.initElements(driver,Credential_Information_Tab.class );
			CIT.NextButton();
			Thread.sleep(2000);
			
			Child_Support_Tab CST=PageFactory.initElements(driver, Child_Support_Tab.class);
			CST.childsuport();
			CST.NextButton();
			Thread.sleep(2000);
			
			Question_Tab QT= PageFactory.initElements(driver, Question_Tab.class);
			QT.Question(excel.getStringData("QuestionData", 1, 0), excel.getStringData("QuestionData", 1, 1));
			QT.NextButton();
				
			Attestation_Tab AT=PageFactory.initElements(driver, Attestation_Tab.class);
			AT.Handle_AttestaionChckBox(excel.getStringData("AttestaionTab", 1, 0));
			AT.SubmitApplicationButton();
			Thread.sleep(2000);
			
			FeeDetail_PaymentGateway_Tab FPGT=PageFactory.initElements(driver, FeeDetail_PaymentGateway_Tab.class);
			FPGT.FeeDetailPage();
			Thread.sleep(2000);
			//FPGT.ApplicationSummary();
			logger.pass("AliS_Renewal Application Regression Testcase1 ");
		}
		
		
	}


