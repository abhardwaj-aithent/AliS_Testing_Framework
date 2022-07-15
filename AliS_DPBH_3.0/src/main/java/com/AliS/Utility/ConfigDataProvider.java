package com.AliS.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Config/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to Find config File -->" + e.getMessage());
		}
	}
	
	public String getDataFromConfig(String KeyToSearch) {
		return pro.getProperty(KeyToSearch);
		
	}

	
	public String getBrowser() {
		return pro.getProperty("Browser");
		
	}
	
	public String getTestingUrl() {
		return pro.getProperty("QAUrl");
	}
}
