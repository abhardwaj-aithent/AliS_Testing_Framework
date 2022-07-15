package com.AliS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Question_Tab {

	WebDriver driver;

	public Question_Tab(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void Question(String exp1, String exp2) throws Exception {
		WebElement Response1= driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-disclosure[1]/form[1]/sh-questions[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/mat-radio-group[1]/mat-radio-button[1]/label[1]/div[1]/div[2]"));
		Response1.click();
		Thread.sleep(1000);
	
		WebElement ExpalanationField1= driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-disclosure[1]/form[1]/sh-questions[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/textarea[1] "));
		ExpalanationField1.sendKeys(exp1);
		Thread.sleep(1000);
		
		WebElement Response2= driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-disclosure[1]/form[1]/sh-questions[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/mat-radio-group[1]/mat-radio-button[4]/label[1]/div[1]/div[2]"));
		Response2.click();
		Thread.sleep(1000);
		
						
		//WebElement ExpalanationField2= driver.findElement(By.cssSelector("div.container.mainContainer:nth-child(2) form.ng-invalid.ng-dirty.ng-touched div.container.section-gray-body.questionsList-container div.row:nth-child(2) div.col-lg-12.ng-invalid.ng-dirty.ng-touched div.ng-invalid.ng-dirty.ng-touched:nth-child(2) div:nth-child(1) div:nth-child(2) div:nth-child(2) > textarea.txtArea.ng-untouched.ng-pristine.ng-invalid"));
		//ExpalanationField2.sendKeys(exp2);
		
		WebElement Response3= driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-disclosure[1]/form[1]/sh-questions[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/mat-radio-group[1]/mat-radio-button[2]/label[1]/div[1]/div[2]"));
		Response3.click();
		Thread.sleep(1000);
		
	}
	
	public void NextButton() {
		WebElement NextButton=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/initial-disclosure[1]/form[1]/sh-back-next-buttons[2]/div[1]/div[1]/div[1]/span[2]/button[1]"));
		NextButton.click();
	
		
		
	}

}
