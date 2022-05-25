package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.Amazonreturnandorderpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonreturnandorder {
	WebDriver driver;

	@Given("^user visits amazon homepage$")
	public void user_visits_amazon_homepage() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   driver.manage().window().maximize();
	}

	@When("^user click on Returns & Orders button$")
	public void user_click_on_Returns_Orders_button() throws Throwable {
		Amazonreturnandorderpom aro=new Amazonreturnandorderpom(driver);
		aro.returnorder().click();
	}

	@Then("^user type valid \"([^\"]*)\" and click on continue button$")
	public void user_type_valid_and_click_on_continue_button(String arg1) throws Throwable {
		Amazonreturnandorderpom type=new Amazonreturnandorderpom(driver); 
		type.email().sendKeys(arg1);
		type.continue1().click();
	}
}
