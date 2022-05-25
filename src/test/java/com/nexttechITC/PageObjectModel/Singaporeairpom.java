package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singaporeairpom {
	WebDriver driver;
	public Singaporeairpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  
	
	@FindBy(id="redeemFlights")
	WebElement click_redeembutton;
	public WebElement redeembutton() {
		return click_redeembutton;
		
	}
	
	
}
