package com.nexttechITC.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Darazwebpagepom {
	WebDriver driver;
	      public Darazwebpagepom(WebDriver driver) {
	    	  this.driver=driver;
	    	  PageFactory.initElements(driver, this);
	      }
	      @FindBy(xpath="//*[@id=\"Level_1_Category_No1\"]/a/span")
	      WebElement act_womensfashion;
	      public WebElement womensfashion() {
	    	  return act_womensfashion;
	      }
	      @FindBy(xpath="//*[@id=\"J_3442298940\"]/div/ul/ul[1]/li[1]/a/span")
	      WebElement click_sweater;
	      public WebElement sweater() {
	    	  return click_sweater;
	      }

}
