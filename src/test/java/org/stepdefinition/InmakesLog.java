package org.stepdefinition;

import org.Base.BaseClass;
import org.Base.InmakePojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InmakesLog extends BaseClass{
	InmakePojo k;
	@Given("To launch browser and windows maximize")
	public void to_launch_browser_and_windows_maximize() {
		LaunchBrowser();
		WindowsMaximize();
	   
	}

	@When("To launch valid url")
	public void to_launch_valid_url() {
		LaunchUrl("https://www.inmakeslh.in/");
	    
	}

	@When("To click login button")
	public void to_click_login_button() {
		WebElement close = driver.findElement(By.xpath("//button[text()='CLOSE']"));
		close.click();
		
		WebElement login = driver.findElement(By.id("xloginBtn"));
		login.click();
		
	  
	}

	@When("To pass valid email of email field")
	public void to_pass_valid_email_of_email_field() {
		k = new InmakePojo();
		passtext("gogulakannans2019@gmail.com", k.getUsername());
	   
	}

	@When("To pass Valid password of password field")
	public void to_pass_Valid_password_of_password_field() {
		k = new InmakePojo();
		passtext("12345", k.getPass());
	}
	
	
	@When("To check Whethere the page is navigate or not")
	public void to_check_Whethere_the_page_is_navigate_or_not() {
		System.out.println("check");
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
		closebrowser();
	   
	}


}
