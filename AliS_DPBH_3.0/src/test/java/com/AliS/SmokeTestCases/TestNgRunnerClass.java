package com.AliS.SmokeTestCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.TestNG;

public class TestNgRunnerClass {
	
	public static void main (String args[]) {
		
		TestNG obj=new TestNG();
		
		ArrayList<String>suite=new ArrayList<String>();
		
		suite.add("C:\\Users\\abhardwaj\\eclipse-workspace\\AliS_DPBH_3.0\\testngRun1.xml");
		suite.add("C:\\Users\\abhardwaj\\eclipse-workspace\\AliS_DPBH_3.0\\testngrun2.xml");
		suite.add("C:\\Users\\abhardwaj\\eclipse-workspace\\AliS_DPBH_3.0\\testngRun3.xml");
		suite.add("C:\\Users\\abhardwaj\\eclipse-workspace\\AliS_DPBH_3.0\\testngRun5.xml");
		
		
		obj.setTestSuites(suite);
		
		//call the run method 
		obj.run();
		
	}

}
