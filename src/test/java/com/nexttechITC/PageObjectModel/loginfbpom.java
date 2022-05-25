package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginfbpom {
	WebDriver driver;
	public loginfbpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//*[@id=\"email\"]")
		WebElement edit_email;
		public WebElement email() {
			return edit_email;
			
		}
		
		@FindBy(id="pass")
		WebElement edit_password;
		public WebElement password() {
			return edit_password;
			
		}
		
		@FindBy(xpath="//button[ @value=\"1\" and @ name=\"login\"]")
		WebElement click_loginbutton;
		public WebElement loginbutton() {
			return click_loginbutton;
			
		}
	

}
