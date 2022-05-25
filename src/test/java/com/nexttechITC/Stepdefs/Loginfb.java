package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.loginfbpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginfb {

	WebDriver driver;

@Given("^user will visit facebook url\\.$")
public void user_will_visit_facebook_url() throws Throwable {
    try {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    }
    catch(Exception e) {
    	System.out.println("url issue");
    }
}

@When("^user will type valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_will_type_valid_and(String arg1, String arg2) throws Throwable {
	try {
	loginfbpom typepe=new loginfbpom(driver);
	typepe.email().sendKeys(arg1);
	typepe.password().sendKeys(arg2);
	Thread.sleep(5000);
	}
	catch(Exception e) {
		System.out.println("Typing issue");
	}
	
   
}

@When("^user will click on log in button\\.$")
public void user_will_click_on_log_in_button() throws Throwable {
	
	try {
	loginfbpom clicklogin=new loginfbpom(driver);
	clicklogin.loginbutton().click();
	Thread.sleep(5000);
	driver.quit();
	}
	catch(Exception e) {
		System.out.println("login issue");
	}
   
}

@Then("^user will be log in successfully\\.$")
public void user_will_be_log_in_successfully() throws Throwable {
    
}
}
