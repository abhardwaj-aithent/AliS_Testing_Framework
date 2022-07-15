package com.AliS.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Individual_Information_Tab {

	WebDriver driver;

	public Individual_Information_Tab(WebDriver ldriver) {
		this.driver = ldriver;
	}

	
	public void RenewButtonClick() throws Exception {
		WebElement Renew = driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ucMenu_2__aMenuLink']"));
		Renew.click();
		Thread.sleep(1000);
		
		/*
		 String url= driver.getCurrentUrl();
		 if(url.equals("http://172.16.1.32/ALiSDPBH3TESTING11.1.125/EntityInformation"
		  )) 
		  { System.out.println("System succesfully able to redirect on Individual Information Tab");
		 } else {
		 
		  System.out.print(HandleAlertWindow()); }
		 */
	}

		public void PersonalInformationSection(String Sufx, String Fname) {
		WebElement Suffix = driver.findElement(By.name("txtSuffix"));
		Suffix.sendKeys(Sufx);

		WebElement FormerName = driver.findElement(By.name("txtFormerName"));
		FormerName.sendKeys(Fname);

		Select sel = new Select(driver.findElement(By.id("ddlGender")));
		sel.selectByVisibleText("Female");
		sel.selectByValue("F");

		Select sel1 = new Select(driver.findElement(By.id("ddlMilitaryVeter")));
		sel1.selectByVisibleText("Yes - Army/Army Reserve");
		sel1.selectByValue("YAR");
	}

	// Additional Information
	public void AdditionalInfo() {
		WebElement Radio1 = driver.findElement(By.xpath(
				"//body/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/cc-personal-information[1]/div[1]/div[2]/div[7]/div[2]/sh-common-check-box-radio-list[1]/mat-radio-group[1]/mat-radio-button[1]/label[1]/div[1]/div[2]"));
		Radio1.click();

		WebElement NVID = driver.findElement(By.id("txtNVBusinessID"));
		NVID.sendKeys("NV80980909809");
		if (Radio1.isEnabled()) {
			System.out.println("System able to click on Yes Radio Button");
		} else {
			System.out.println("System Unable to click on Yes Radio Button");
		}
	}

	// Additional Card Information
	public void AdditionalCardInformationsection(String crn, String comnt, String comnt1) {

		// WebElement ADD=driver.findElement(By.xpath("//a[contains(text(),'Add')]"));
		// ADD.click();

		WebElement CDR = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/cc-card-information[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/select[1]"));
		Select sel2 = new Select(driver.findElement(By.xpath(
				"//body[1]/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/cc-card-information[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/select[1]")));
		sel2.selectByVisibleText("CDR");
		sel2.selectByValue("CDR");

		WebElement CardNumber = driver.findElement(By.xpath(
				"//body[1]/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/cc-card-information[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		CardNumber.sendKeys(crn);

		WebElement Comment = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/textarea[1]"));
		Comment.sendKeys(comnt);

		WebElement Calendaricon = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/i[1]"));
		Calendaricon.click();

		String date = "Dec/31/2023";
		String DateArr[] = date.split("/");
		String month = DateArr[0];
		String day = DateArr[1];
		String year = DateArr[2];

		Select sel3 = new Select(driver.findElement(By.xpath(
				"//tbody/tr[1]/td[3]/div[1]/ngb-datepicker[1]/div[1]/ngb-datepicker-navigation[1]/ngb-datepicker-navigation-select[1]/select[1]")));
		sel3.selectByVisibleText(month);
		WebElement Day = driver.findElement(By.xpath("//div[contains(text(),'31')]"));
		Day.click();

		// Select sel4=new
		// Select(driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/ngb-datepicker[1]/div[1]/ngb-datepicker-navigation[1]/ngb-datepicker-navigation-select[1]/select[2]")));
		// sel4.selectByVisibleText(year);

		//Document Upload section popup WebElement Document=
		 WebElement Document= driver.findElement(By.xpath(
		 "//body[1]/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/cc-card-information[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/span[1]/a[1]"
		 )); 
		  Document.click();
		  boolean turnedOn=true;
		 if(turnedOn) {
		  WebDriverWait wait= new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-document-upload[1]/form[1]/cc-document-upload[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/strong[1]/a[1]\"")));
		 }
		 else {
			 System.out.println("System unable to Click on given Xpath");
		 }
		  
		 // WebElement ADD1= driver.findElement(By.xpath(
		// "//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-document-upload[1]/form[1]/cc-document-upload[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/strong[1]/a[1]"
		// )); ADD1.click();
		 
		 WebElement ChooseFile=
		 driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
		 ChooseFile.sendKeys("C:\\Users\\abhardwaj\\Desktop\\TESTDO~1\\TESTLA~1.DOC");
		  
		  WebElement
		  uploadComment=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/textarea[1]")); 
		  uploadComment.sendKeys(comnt1);
		  
		  WebElement UploadButton=driver.findElement(By.xpath("//button[contains(text(),'Upload')]"));
		  UploadButton.click();
		  
	
		/*
		 * String beforeXpath=
		 * "//html[1]/body[1]/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/cc-card-information[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[";
		 * 
		 * String afterXpath="]/td[";
		 * 
		 * final int totalWeekDays=7;
		 * 
		 * for(int rowNum=2; rowNum<=7; rowNum++) { for(int colNum=1;
		 * colNum<=totalWeekDays; colNum++) {
		 * 
		 * String
		 * dayval=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]"))
		 * .getText(); System.out.println(dayval); } }
		 * 
		 * 
		 */

	}
	
	public void NextButton() {
		WebElement NextButton=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/sh-back-next-buttons[2]/div[1]/div[1]/div[1]/span[2]/button[1]"));
		NextButton.click();
	
		
	}
	
	public void HandleAlertWindow() {
		// Alert Class object is used to handle Alert window of application
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());// this sysout is used to print alert text
		alert.accept();// this method to click alert ok button
		//alert.dismiss();//this method to click cancel button
		
		boolean turnedOn = true;
		if(turnedOn) // Here, you are saying "if turnedOn (is true, that's implicit)
		{
		WebElement ViewPendingLink=driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucMenu_1__aMenuLink"));
		ViewPendingLink.click();
		WebElement ContinueApplication= driver.findElement(By.xpath("//span[contains(text(),'Continue Application')]"));
		ContinueApplication.click();
		
		}
		else // if it is NOT true (it is false)
		{
			System.out.println("System unable to find alert on Home Page**");
		}
	}
	
	public void CaptureValidation() {
		// Store message in variable
		//String expect1="Gender is a required field.";
		String expect2="Do you own a business in State of NV? (If Yes, enter your Nevada Business Identification Number) is a required field.";
		String expect3="Card Number is a required field.";
		String expect4= "Expiration Date is a required field.";
		String expect5="Comments is a required field.";
		
		// This will capture error message
		//WebElement Gender= driver.findElement(By.xpath("//li[contains(text(),'Gender is a required field.')]"));
		//String actual1=Gender.getText();
		//System.out.println("Error message is: "+ actual1);
		
		WebElement NV= driver.findElement(By.xpath("//li[contains(text(),'Do you own a business in State of NV? (If Yes, ent')]"));
		String actual2=NV.getText();
		System.out.println("Error message is: "+ actual2);
		
		WebElement Card= driver.findElement(By.xpath("//li[contains(text(),'Card Number is a required field.')]"));
		String actual3=Card.getText();
		System.out.println("Error message is: "+ actual3);
		
		WebElement ExpirationDate= driver.findElement(By.xpath("//li[contains(text(),'Expiration Date is a required field.')]"));
		String actual4=ExpirationDate.getText();
		System.out.println("Error message is: "+ actual4);
		
		WebElement Commnets= driver.findElement(By.xpath("//li[contains(text(),'Comments is a required field.')]"));
		String actual5=Commnets.getText();
		System.out.println("Error message is: "+ actual5);
		// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
		//exception and fail testcases
		// Verify error message
		
		try {
		// Assert.assertEquals(expect1, actual1);
		 Assert.assertEquals(expect2, actual2);
		 Assert.assertEquals(expect3, actual3);
		 Assert.assertEquals(expect4, actual4);
		 Assert.assertEquals(expect5, actual5);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("System unable to find this error message:--"+ e);
			}
		    
 }
		
	
	public void LogoutButton() {
		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout.click();
		
		
	}
	
	public void LogoutButton1() throws Exception {
		WebElement logout1=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logout1.click();
		driver.get("http://172.16.1.32/ALiSDPBH2TESTING11.1.125/login.aspx?BusinessUnit=HCQC");
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	
	

	

	

}
