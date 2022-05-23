package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPOM {
	
WebDriver driver;

public AmazonSearchPOM (WebDriver driver) {
    this.driver=driver;
   
    PageFactory.initElements(driver, this);
   }
  
 // @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
  @FindBy(name="field-keywords")
  WebElement edit_searchbox;
  public WebElement Search(){
	return edit_searchbox;
 
   
  }
  @FindBy(id="nav-search-submit-button")
  WebElement click_searchbutton;
  public WebElement searchbutton(){
  return click_searchbutton;
   

}
}
