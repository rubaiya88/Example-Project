package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_ProductPOM {
	WebDriver driver;

	public Dell_ProductPOM (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   }
	@FindBy(xpath="//span[text()='Products']")
	WebElement act_Products;
	public WebElement Products() { 
	return act_Products;
	}
	
	@FindBy(xpath="//a[text()='Laptops']")
	WebElement act_Laptops;
	public WebElement Laptops() { 
	return act_Laptops;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/ul/li[3]/a")
	WebElement click_ForHome;
	public WebElement ForHome() { 
	return click_ForHome;
	}
	  }
