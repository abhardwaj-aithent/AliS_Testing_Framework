package com.AliS.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.AliS.Pages.BaseClassAliS;
import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;

public class LoginTest extends BaseClassAliS {

	
	
	@Test
	public void LoginAliS() {
		
				
		ExcelDataProvider excel=new ExcelDataProvider();
		
		logger= report.createTest("LoginAliS");
				
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting AliSLogin Application");
		
		loginpage.LoginToAlis( excel.getStringData("LoginAlis",0,0),excel.getStringData("LoginAlis", 0, 1));
		
		logger.pass("LoginAliS Success");
		
		
		
	}

	
}
