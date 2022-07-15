package com.AliS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Credential_Information_Tab {
	WebDriver driver;

	public Credential_Information_Tab (WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void NextButton() {
		WebElement NextButton=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/credentialinformation[1]/form[1]/sh-back-next-buttons[2]/div[1]/div[1]/div[1]/span[2]/button[1]"));
		NextButton.click();
		
	}
}
