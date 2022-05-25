package com.nexttech.project012022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebookloginfeature {
	WebDriver driver;

@Given("^user visits facebook homepage$")
public void user_visits_facebook_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32.\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
}

@When("^user type valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_type_valid_and(String arg1, String arg2) throws Throwable {
  
}

@When("^user click on login button$")
public void user_click_on_login_button() throws Throwable {
    
}

@Then("^user will be able to log in successfully\\.$")
public void user_will_be_able_to_log_in_successfully() throws Throwable {
   
}



}
