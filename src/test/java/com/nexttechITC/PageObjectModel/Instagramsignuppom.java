package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagramsignuppom {
	
	WebDriver driver;
	public  Instagramsignuppom (WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/div/p/a/span")
	WebElement click_signup;
	public WebElement signup() {
		return click_signup;
		
	}
	

}
