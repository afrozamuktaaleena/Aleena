package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechITC.PageObjectModel.Amazonsearchpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazonsearchfeature {
	
	WebDriver driver;
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {
		//how to open the homepage
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
	//how to open the URL
		driver.get("https://www.amazon.com/");
		
		
		driver.manage().window().maximize();

	    
	}

	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		Amazonsearchpom as=new Amazonsearchpom(driver);
		as.Search().sendKeys(arg1);
		Thread.sleep(5000);
		
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		
		Amazonsearchpom sbclick=new Amazonsearchpom(driver);
		sbclick.searchbutton().click();
		Thread.sleep(4000);
		driver.quit();
	    
	}

}
