package com.AliS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Address_Information_Tab {


	WebDriver driver;

	public Address_Information_Tab(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void ResidenceAddress(String add, String suit, String city, String zip, String pp, String PPext, String Altphn, String Altphnext, String fx,String PE, String AE) {
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='CountryCode_RES']")));		
		sel.selectByVisibleText("UNITED STATES");
		
		WebElement Address=driver.findElement(By.xpath("//input[@id='txtAddress_RES']"));
		Address.sendKeys(add);
		
		WebElement Suite =driver.findElement(By.xpath("//input[@id='lblApt_RES']"));
		Suite.sendKeys(suit);
		
		WebElement City =driver.findElement(By.xpath("//input[@id='txtCity_RES']"));
		City.sendKeys(city);
		
		Select sel1=new Select(driver.findElement(By.id("ddlState_RES")));
		sel1.selectByVisibleText("NEVADA");
		
		WebElement Zip =driver.findElement(By.xpath("//input[@id='txtZip_RES']"));
		Zip.sendKeys(zip);
		
		Select sel2=new Select(driver.findElement(By.id("//select[@id='ddlCounty_RES']")));
		sel2.selectByVisibleText("MINERAL");
		
		WebElement PrimaryPhone =driver.findElement(By.xpath("//input[@id='txtPrimaryPhone_RES']"));
		PrimaryPhone.sendKeys(pp);
		
		WebElement PrimaryExt =driver.findElement(By.xpath("//input[@id='Extension_RES']"));
		PrimaryExt.sendKeys(PPext);
		
		WebElement AlternatePhone =driver.findElement(By.xpath("//input[@id='txtAlternatePhone_RES']"));
		AlternatePhone.sendKeys(Altphn);
		
		WebElement Alternatephnext =driver.findElement(By.xpath("//input[@id='AlternatePhoneExtension_RES']"));
		Alternatephnext.sendKeys(Altphnext);
		
		WebElement FAX =driver.findElement(By.xpath("//input[@id='txtFax_RES']"));
		FAX.sendKeys(fx);
		
		WebElement PrimaryEmail =driver.findElement(By.xpath("//input[@id='txtPrimaryEmail_RES']"));
		PrimaryEmail.sendKeys(PE);
		
		WebElement AlternateEmail=driver.findElement(By.xpath("//input[@id='txtAlternateEmail_RES']"));
		AlternateEmail.sendKeys(AE);
		}
	
	
	public void ResidenceAddressCopy() throws Exception {
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='ddlCopy_RES']")));
		sel.selectByVisibleText("Individual Mailing Address");
		Thread.sleep(2000);
		
	}
	
	public void NextButton() {
		WebElement NextButton=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/address-information[1]/form[1]/sh-back-next-buttons[2]/div[1]/div[1]/div[1]/span[2]/button[1]"));
		NextButton.click();
		Thread.sleep(2000);
		
		
		}
