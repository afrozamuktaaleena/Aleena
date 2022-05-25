package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageObjectModel.Facebooksignuppom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooksignup {
	WebDriver driver;

@Given("^user visits facebook url$")
public void user_visits_facebook_url() throws Throwable {
	try {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/r.php");
    driver.manage().window().maximize();
    
    Thread.sleep(3000);
    }
	catch(Exception e) {
		System.out.println("Browser issue");
		
	}
}

@When("^user enter  \"([^\"]*)\"and \"([^\"]*)\" and valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
public void user_enter_and_and_valid_and_valid(String arg1, String arg2, String arg3, String arg4) throws Throwable {
   try { 
	Facebooksignuppom obg=new Facebooksignuppom(driver);
	obg.firstname().sendKeys(arg1);
	
	obg.lastname().sendKeys(arg2);
	obg.email().sendKeys(arg3);
	obg.password().sendKeys(arg4);
	Thread.sleep(3000);
	}
   catch(Exception e) {
	   System.out.println("typing issue");
	   
   }
}

@When("^user selects dropdown month and dropdown day and dropdown year$")
public void user_selects_dropdown_month_and_dropdown_day_and_dropdown_year() throws Throwable {
	try
	{
	 Facebooksignuppom sel=new Facebooksignuppom (driver);
	 Select dropdown=new Select(sel.click_month);
	 dropdown.selectByIndex(2);
	 Select dropdown1=new Select(sel.click_day);
	 dropdown1.selectByValue("3");
	 Select dropdown2=new Select(sel.click_year);
	 dropdown2.selectByVisibleText("2000");
	 Thread.sleep(3000);
	}
	catch(Exception e) {
		System.out.println("dropdown issue");
	}
	
}

@When("^user click gender radio button and click on sign up$")
public void user_click_gender_radio_button_and_click_on_sign_up() throws Throwable {
    try {
	Facebooksignuppom radio=new Facebooksignuppom(driver);
	radio.male().click();
	radio.signup().click();
	Thread.sleep(2000);
	
	driver.quit();
	
    }
    catch(Exception e) {
    	System.out.println("radio button");
    }
}

@Then("^user will be sign up successfully\\.$")
public void user_will_be_sign_up_successfully() throws Throwable {

    
}


}
