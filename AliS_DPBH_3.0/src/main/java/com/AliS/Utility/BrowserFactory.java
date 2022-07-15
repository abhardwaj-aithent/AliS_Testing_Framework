package com.AliS.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BrowserFactory {
     //Here 
	@Parameters("browsername")
	public static WebDriver StartApplication(WebDriver driver, String browsername, String appurl)
	{
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else 
		{
			System.out.println("System is not supporting Browser");
		}
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		}
	
	public static void quitbrowser(WebDriver driver) 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		driver.quit();
	}
	
}
