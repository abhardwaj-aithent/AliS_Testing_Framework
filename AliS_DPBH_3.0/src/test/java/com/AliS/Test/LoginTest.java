package com.AliS.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AliS.Pages.LoginPage;
import com.AliS.Utility.ExcelDataProvider;

public class LoginTest extends com.AliS.Base.BaseClassAliS {

	@Test
	public void LoginAliS() throws Exception {
		
	    ExcelDataProvider excel=new ExcelDataProvider();
		
	    logger= report.createTest("LoginAliS");
				
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting AliSLogin Application");
		
		loginpage.LoginToAlis( excel.getStringData("LoginAlis",3,0),excel.getStringData("LoginAlis", 3, 1));
		
		
		logger.pass("LoginAliS Success");
		
		
		
	}
	

	
}
