package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dellhomesolutionpom {
		
	WebDriver driver;	
	public Dellhomesolutionpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	

	@FindBy(xpath="//span[text()='Solutions']")

	WebElement act_Solutions;
	public WebElement Solutions() { 
	 return act_Solutions;
	 }

	@FindBy(xpath="//a[text()='View All Solutions']")
	WebElement click_all_Solutions;	
	public WebElement AllSolutions() {
		return click_all_Solutions; 

	}
}
