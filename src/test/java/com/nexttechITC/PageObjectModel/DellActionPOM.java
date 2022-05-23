package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {
	WebDriver driver;

	public DellActionPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a/span")
	  WebElement act_Solutions;
	  public WebElement Solutions() { 
	   return act_Solutions;
	  }
	 
	  
	  @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[3]/a")
	  WebElement act_ViewAllSolutions;
	  public WebElement viewallSolutions() { 
	   return act_ViewAllSolutions;
	  }
}
