package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aliexpresspom {
	WebDriver driver;
	 
	 
	  public  Aliexpresspom (WebDriver driver) {
	    this.driver=driver;
	   
	    PageFactory.initElements(driver, this);
	   }
	  @FindBy(xpath="//*[@id=\"nav-user-account\"]/span/a/span")
	  WebElement act_account;
	  public WebElement account() {
		return act_account;
		  
	  }
	  @FindBy(xpath="//*[@id=\"nav-user-account\"]/div/div/p[3]/a[1]")
	  WebElement click_join;
	  public WebElement join() {
		return click_join;
		  
	  }

}
