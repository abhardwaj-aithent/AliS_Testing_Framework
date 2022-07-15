package com.AliS.Pages;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FeeDetail_PaymentGateway_Tab {
	WebDriver driver;

	public FeeDetail_PaymentGateway_Tab(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	public void FeeDetailPage() throws Exception {
		WebElement PayNow= driver.findElement(By.xpath("//button[contains(text(),'Pay Now')]"));
		Thread.sleep(2000);
		PayNow.click();
	}
	
	public void FeeDetailPage1() {
		WebElement EditApplication= driver.findElement(By.xpath("//button[contains(text(),'Edit Application')]"));
		EditApplication.click();
	
	}
	
	public void ApplicationSummary() throws IOException {
		WebElement summary=driver.findElement(By.xpath("//body/app-root[1]/basepage[1]/div[2]/app-success-page[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/a[1]/u[1]"));
		summary.click();
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		URL url=new URL(currentUrl);
		
		InputStream is =url.openStream();
		BufferedInputStream fileParse =new BufferedInputStream(is);
		PDDocument document=null;
		
		document =PDDocument.load(fileParse);
		String pdfContent =new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
	
		Assert.assertTrue(pdfContent.contains(""));
	
		
		
	}

	
}
