package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageObjectModel.Singaporeairpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Singaporeairfeature {
	
	WebDriver driver;
	
	@Given("^user visit singapore air home page$")
	public void user_visit_singapore_air_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("https://www.singaporeair.com/en_UK/bd/home#/book/bookflight");
	    driver.manage().window().maximize();
	}

	

	@When("^user click on redeem flight  button$")
	public void user_click_on_redeem_flight_button() throws Throwable {
		Singaporeairpom sing1=new Singaporeairpom(driver);
		sing1.redeembutton().click();
		 WebDriverWait wait=new WebDriverWait(driver,30);
	}

	@Then("^user will be redirected to that page$")
	public void user_will_be_redirected_to_that_page() throws Throwable {
	    
	}



}
