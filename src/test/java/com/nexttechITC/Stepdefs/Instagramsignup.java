package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.Instagramsignuppom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Instagramsignup {
	WebDriver driver;
	

@Given("^user visit instagram homepage$")
public void user_visit_instagram_homepage() throws Throwable {
    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.instagram.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}


@When("^user click on sign up button$")
public void user_click_on_sign_up_button() throws Throwable {
   
	 Instagramsignuppom sign=new  Instagramsignuppom(driver);
	 sign.signup().click();
}

@When("^user type valid \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and\"([^\"]*)\"$")
public void user_type_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
   
}

@Then("^user can sign up successfully$")
public void user_can_sign_up_successfully() throws Throwable {
    
}


}
