package com.AliS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AliS.Utility.ExcelDataProvider;
import com.AliS.Utility.ExcelDataSupplier;

//Create a Main class LoginPage 
public class LoginPage {
	
	//this is commit 
	WebDriver driver;

	
	// Create a class constructor for the Main class LoginPage 
	public LoginPage(WebDriver ldriver) 
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="m_LoginControl_UserName") WebElement LoginName;
	@FindBy(id="m_LoginControl_Password") WebElement Password;
	@FindBy(xpath="//span[contains(text(),'Login')]")WebElement LoginButton;

	
	
	//Here we have create a Method By LoginToAlis() by passing parameters and their references
	
	public void  LoginToAlis(String Lname, String pwd)
	{
		try 
		{
			Thread.sleep(4000);
		} 
		catch (InterruptedException e) {
		}
		
		LoginName.sendKeys(Lname);
		Password.sendKeys(pwd);
		LoginButton.click();
		


	}
	
}

