package org.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InmakePojo extends BaseClass {
	public InmakePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
