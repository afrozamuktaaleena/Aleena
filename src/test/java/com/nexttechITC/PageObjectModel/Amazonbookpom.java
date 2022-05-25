package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonbookpom {
	WebDriver driver;
	 
	 
	  public Amazonbookpom(WebDriver driver) {
	    this.driver=driver;
	   
	    PageFactory.initElements(driver, this);
	   }
	@FindBy(xpath="//a[@href=\"/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books\"]")
	WebElement click_book;
	public WebElement book() {
		return click_book;
		
	}
}
