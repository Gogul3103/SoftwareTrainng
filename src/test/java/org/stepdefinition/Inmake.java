package org.stepdefinition;

import org.Base.BaseClass;
import org.Base.InmakePojo;

import cucumber.api.java.en.When;

public class Inmake extends BaseClass {
     InmakePojo k;

@When("To click login button to enter page")
public void to_click_login_button_to_enter_page() {
	k = new InmakePojo();
	clickbtn(k.getLoginbtn());
}

}
