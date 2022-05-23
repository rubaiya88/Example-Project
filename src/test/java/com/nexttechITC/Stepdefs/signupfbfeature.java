package com.nexttechITC.Stepdefs;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import com.nexttechITC.PageObjectModel.signupfbPOM;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	
	
public class signupfbfeature {
	WebDriver driver;
	
			// TODO Auto-generated method stub
		@Given("^user will visiting Facebook URL$")
		public void user_will_visiting_Facebook_URL() throws Throwable {
			//how to open browser
					System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					//how to max the window to get all our web elements visible
					//how to open URL
					driver.get("https://www.facebook.com/r.php");
					driver.manage().window().maximize();
					Thread.sleep(3000);
		 
		}

		@When("^user will enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
		public void user_will_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
			 signupfbPOM se1=new signupfbPOM(driver);
			 se1.lastname().sendKeys(arg1);
			 se1.firstname().sendKeys(arg2);
			 se1.email().sendKeys(arg3);
			 se1.password().sendKeys(arg4); 

		}

		@Then("^user will select dropdown Month and dropdown Day and dropdown Year$")
		public void user_will_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		    
			signupfbPOM se1=new signupfbPOM(driver);
			  
			  Select dropdown =new Select (se1.click_month);
			  //dropdown.selectByIndex(5);
			  dropdown.selectByIndex(5);

			Select dropdown1 =new Select (se1.click_day);
			  dropdown1.selectByValue("6");
			  
			  
			  Select dropdown2= new Select (se1.click_year);
			  dropdown2.selectByVisibleText("1999");
			  


		    }
	}
		
	


