package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechITC.PageObjectModel.Aliexpresspom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Aliexpressfeature {
	WebDriver driver;
	
	@Given("^user visits ali express home page$")
	public void user_visits_ali_express_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.aliexpress.com");
	    driver.manage().window().maximize();
	}

	@When("^user go to account option$")
	public void user_go_to_account_option() throws Throwable {
		Actions act = new Actions(driver);
		Aliexpresspom obg=new Aliexpresspom(driver);
		act.moveToElement(obg.account()).build().perform();
		obg.join().click();
	   
	}

	@When("^user click on join button$")
	public void user_click_on_join_button() throws Throwable {
	   
	}

	@When("^user select Bangladesh in dropdown menu$")
	public void user_select_Bangladesh_in_dropdown_menu() throws Throwable {
	
	}

	@When("^user type valid \"([^\"]*)\" and \"([^\"]*)\" and click creat button$")
	public void user_type_valid_and_and_click_creat_button(String arg1, String arg2) throws Throwable {
	  
	}

	@Then("^user will be able to create account\\.$")
	public void user_will_be_able_to_create_account() throws Throwable {
	    
	}

}
