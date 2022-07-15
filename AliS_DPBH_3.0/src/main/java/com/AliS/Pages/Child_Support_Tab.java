package com.AliS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Child_Support_Tab {
	WebDriver driver;

	public Child_Support_Tab(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void childsuport() {
		WebElement RadioButton=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/child-support[1]/form[1]/div[1]/div[3]/div[1]/sh-common-check-box-radio-list[1]/mat-radio-group[1]/mat-radio-button[3]/label[1]/div[1]/div[2]"));
		RadioButton.click();
	}
	
	public void NextButton() {
		WebElement NextButton=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/child-support[1]/form[1]/sh-back-next-buttons[2]/div[1]/div[1]/div[1]/span[2]/button[1]"));
		NextButton.click();
		
	}
}
