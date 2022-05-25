package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Walmartsearchfeature {
	
	@Given("^user visits walmart homepage http://walmart\\.com$")
	public void user_visits_walmart_homepage_http_walmart_com() throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.walmart.com");
	}

	@When("^user types walmart product into the search field and click on search icon$")
	public void user_types_walmart_product_into_the_search_field_and_click_on_search_icon() throws Throwable {
	   
	}

	@Then("^user will be redirected to the search result page with product\\.$")
	public void user_will_be_redirected_to_the_search_result_page_with_product() throws Throwable {
	  
	}

}
