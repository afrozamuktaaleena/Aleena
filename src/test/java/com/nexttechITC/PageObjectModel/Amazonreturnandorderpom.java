package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Amazonreturnandorderpom {
	WebDriver driver;
	public Amazonreturnandorderpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 @FindBy(xpath="//*[@id=\"nav-orders\"]/span[2]")
 WebElement click_returnorder;
 public WebElement returnorder(){
	 return click_returnorder;
 };
 @FindBy(xpath="//*[@id=\"ap_email\"]")
 WebElement type_email;
 public WebElement email() {
	 return type_email;
 }
 @FindBy(xpath="//*[@id=\"continue\"]")
 WebElement click_continue;
 public WebElement continue1 () {
	 return click_continue; 
 }
 
}
