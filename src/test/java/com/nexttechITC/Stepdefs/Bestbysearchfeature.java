package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bestbysearchfeature {
	
WebDriver driver;
	
	@Given("^User Visits Bestbuy homepage$")
	public void user_Visits_Bestbuy_homepage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.drive", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.bestbuy.com");
	}

	@When("^User Clicks on search field$")
	public void user_Clicks_on_search_field() throws Throwable {
	 
	}

	@When("^User type \"([^\"]*)\"$")
	public void user_type(String arg1) throws Throwable {
		
	}
	  

	@When("^User clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
	   
	}

	@Then("^user will see the search result page$")
	public void user_will_see_the_search_result_page() throws Throwable {
	  
	}

}
