package com.AliS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Attestation_Tab {

	WebDriver driver;

	public Attestation_Tab(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void Handle_AttestaionChckBox(String nam) {
		
		WebElement Checkbox1=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[1]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox1.click();
		
		WebElement Checkbox2=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[2]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox2.click();
		
		WebElement Checkbox3=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[3]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox3.click();
		
		WebElement Checkbox4=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[4]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox4.click();
		
		WebElement Checkbox5=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[5]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox5.click();
		
		WebElement Checkbox6=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[6]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox6.click();
		
		WebElement Checkbox7=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[7]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox7.click();
		
		WebElement Checkbox8=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[8]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox8.click();
		
		WebElement Checkbox9=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-attestation[1]/form[1]/div[1]/sh-attestation[1]/div[1]/div[1]/div[3]/div[9]/mat-list-item[1]/div[1]/mat-checkbox[1]/label[1]/div[1]"));
		Checkbox9.click();
		
		
		 //Name Field
		  WebElement Name=driver.findElement(By.id("txtAttestationName"));
		  Name.sendKeys(nam);
		  
		 //List <WebElement> AllCheckboxes =  driver.findElements(By.xpath("//mat-checkbox[@id='mat-checkbox']"));
		 
		// for(int i = 0; i<AllCheckboxes.size(); i++) {
		        
			//  AllCheckboxes.get(i).click();
		  //}
		
	}
	
	public void SubmitApplicationButton() {
		 WebElement SubmitApplicationButton=driver.findElement(By.xpath("//button[contains(text(),'Submit Application')]"));
		 SubmitApplicationButton.click();
		 
		
	
	}
	
}

