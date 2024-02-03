package org.stepdefinition;

import org.Base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
	@Before
	private void Precondition() {
		LaunchBrowser();
		WindowsMaximize();
      
	}
	
	@After
	private void postcondition() {
        closebrowser();
	}

}
