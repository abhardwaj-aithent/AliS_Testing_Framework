package com.AliS.Test;

import java.util.ArrayList;

import org.testng.TestNG;

public class TestNgRunnerClass {
	
	public static void main (String args[]) {
		
		TestNG obj=new TestNG();
		
		ArrayList<String>suite=new ArrayList<String>();
		
		suite.add("C:\\Users\\abhardwaj\\eclipse-workspace\\AliS_DPBH_3.0\\testng.xml");
		
		//call the run method 
		obj.setTestSuites(suite);
		
		
		obj.run();
		
	}

}
