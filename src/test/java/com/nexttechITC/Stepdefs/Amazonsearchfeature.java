package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.AmazonSearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazonsearchfeature {
	
WebDriver driver;
	
@Given("^user will visit amazon home page$")
public void user_visit_amazon_home_page() throws Throwable {
		
		//how to open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//how to max the window to get all our web elements visible
		//how to open URL
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}

@Given("^user will search by \"([^\"]*)\"$")
public void user_search_by(String arg1) throws Throwable {
AmazonSearchPOM AS = new AmazonSearchPOM(driver);   
AS.Search().sendKeys(arg1);
Thread.sleep(5000);
			
	}

@Then("^user will click on search button$")
public void user_click_on_search_button() throws Throwable {
	AmazonSearchPOM AS = new AmazonSearchPOM(driver);   
	AS.searchbutton().click();
	Thread.sleep(10000); 
	}

}
