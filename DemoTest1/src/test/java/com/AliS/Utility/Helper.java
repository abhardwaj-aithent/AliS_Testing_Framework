package com.AliS.Utility;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	public static String captureScreenshot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+"/ScreenShots/AliSLoginPage_"+ getCurrentDateTime() + ".png";
		try {
			
			FileHandler.copy(src, new File(screenshotPath));

			System.out.println("Screenshot Captured");

		} catch (IOException e) {
			System.out.println("Unable to Capture Screenshots" + e.getMessage());
		}
		return screenshotPath;
	}

	public static String getCurrentDateTime() {

		String time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				
		//DateFormat dateformat = new SimpleDateFormat("DD/mm/yyyy");
		//Date CurrentDate = new Date();
		//System.out.println(CurrentDate);
		//dateformat.format(CurrentDate);
		
		return time;
				
	}
	
	public static void HandleDocumentUploadPopup(WebDriver driver, String comnt1) throws Exception {
		//Document Upload section popup

				WebElement Document= driver.findElement(By.xpath("//body[1]/app-root[1]/basepage[1]/div[2]/app-personal-information[1]/form[1]/cc-card-information[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/span[1]/a[1]"));
				Document.click();
				
				WebElement ADD1= driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-document-upload[1]/form[1]/cc-document-upload[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/strong[1]/a[1]"));
				ADD1.click();
				
				WebElement ChooseFile= driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
				ChooseFile.sendKeys("C:\\Users\\abhardwaj\\Desktop\\TESTDO~1\\TESTLA~1.DOC");
				
				WebElement uploadComment=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/textarea[1]"));
				uploadComment.sendKeys(comnt1);
				
				WebElement UploadButton=driver.findElement(By.xpath("//button[contains(text(),'Upload')]"));
				UploadButton.click();

	}
	
	public static void ReadPDFTest() throws IOException {
		URL url=new URL("");
		
		InputStream is =url.openStream();
		BufferedInputStream fileParse =new BufferedInputStream(is);
		PDDocument document=null;
		
		document =PDDocument.load(fileParse);
		String pdfContent =new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
		
}
	
	

	
	
}

