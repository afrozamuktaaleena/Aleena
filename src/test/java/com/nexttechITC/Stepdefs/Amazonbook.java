package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.Amazonbookpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbook {
	WebDriver driver;

	@Given("^user  visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
	 try{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe" );
	    driver= new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    }
	 catch(Exception e)
	 {
		 System.out.println("url issue");
	 }
	}

@When("^user  click on book button$")
public void user_click_on_book_button() throws Throwable {
   try
	{
	   Amazonbookpom bookclick=new Amazonbookpom(driver);
	bookclick.book().click();
	}
   catch(Exception e) {
	 System.out.println("xpath issue")  ;
   }
}

@Then("^user will be able to redirected to book page successfully$")
public void user_will_be_able_to_redirected_to_book_page_successfully() throws Throwable {
    
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}	
	
}
