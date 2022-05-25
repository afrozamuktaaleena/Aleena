package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.Darazwebpagepom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Darazwebpagefeature {
	WebDriver driver;
	
	@Given("^user go to daraz home page$")
	public void user_go_to_daraz_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.daraz.com.bd");
		driver.manage().window().maximize();
	   
	}

	@When("^user go to Womens fashion$")
	public void user_go_to_Womens_fashion() throws Throwable {
		Actions act=new Actions(driver);
		Darazwebpagepom obg=new Darazwebpagepom(driver);
		act.moveToElement(obg.womensfashion()).build().perform();
		obg.sweater().click();
		
	  
	}

	@Then("^user will be able click on sweaters and cardigans$")
	public void user_will_be_able_click_on_sweaters_and_cardigans() throws Throwable {
	    
	}
}
