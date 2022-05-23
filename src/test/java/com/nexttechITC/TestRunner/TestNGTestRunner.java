package com.nexttechITC.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestRunner {
	@CucumberOptions (
		      
		      features = {"Features"},
		      glue = {"com.nexttechITC.stepdefs"}
		      //tags= {"@fbsignup_happypath"}
		      
		      )

		 public class TestRunner extends AbstractTestNGCucumberTests{}

}
