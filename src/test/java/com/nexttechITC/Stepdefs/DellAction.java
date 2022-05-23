package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {
	WebDriver driver;
	
	@Given("^user visits Dell home page$")
	public void user_visits_Dell_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		  driver = new ChromeDriver();
		     //soft wait
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		         
		           //how to maximize the browser
		  driver.manage().window().maximize();
		       
		       //how to open URL  driver.get method
		   driver.get("https://www.dell.com/en-us");
		        //Thread.sleep(10000);
		 }

	@When("^user go to Solutions drop down menu and able to see View All Solutions$")
	public void user_go_to_Solutions_drop_down_menu_and_able_to_see_View_All_Solutions() throws Throwable {
		DellActionPOM obj = new DellActionPOM(driver);
		Actions act =new Actions (driver);
		act.moveToElement(obj.Solutions()).perform();
		obj.viewallSolutions().click();
		
		  
		  //act.moveToElement(obj.Solutions()).build().perform();
		//obj.Solutions().click();
	}
	

	@Then("^user redirects to solution Portfolio$")
	public void user_redirects_to_solution_Portfolio() throws Throwable {
		Thread.sleep(2000);
		  driver.quit();
	
		

	}


}
