package org.stepdefinition;

import org.Base.BaseClass;
import org.Base.InmakePojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class VariousDatas extends BaseClass {
	InmakePojo l ;
	
	@When("To launch the url of Inmakes learning hub")
	public void toLaunchTheUrlOfInmakesLearningHub() {
	    LaunchUrl("https://www.inmakeslh.in/");
	}

	@When("click login button to enter login field")
	public void clickLoginButtonToEnterLoginField() {
		WebElement close = driver.findElement(By.xpath("//button[text()='CLOSE']"));
		close.click();
		
		WebElement login = driver.findElement(By.id("xloginBtn"));
		login.click();
	   
	}

	@When("user has pass the valid data{string} in email field")
	public void userHasPassTheValidDataInEmailField(String email) {
		l = new InmakePojo();
		passtext(email, l.getUsername());
	   
	}

	@When("user has pass vali data{string} in password field")
	public void userHasPassValiDataInPasswordField(String pass) {
		l = new InmakePojo();
		passtext(pass, l.getPass());
	}

	@When("user has click login button")
	public void userHasClickLoginButton() {
		l = new InmakePojo();
		clickbtn(l.getLoginbtn());
	}



}
