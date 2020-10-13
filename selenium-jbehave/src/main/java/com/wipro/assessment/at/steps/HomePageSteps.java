package com.wipro.assessment.at.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.assessment.at.pages.HomePage;

@Component
public class HomePageSteps extends AbstractSteps {
	
	
	@Autowired
	private HomePage homePage;
	
	@Given("I am on startup jedi main page")
	public void IAmOnStartupJediMainPage() {
		homePage.navigateTo();
	}
	
	@When("I click on log in button")
	public void IClickOnLogInButton() {
		homePage.clickLogIn();
	}
	
	@When("I click on log in with email button")
	public void IClickOnLogInWithEmailButton() {
		homePage.clickLogInWithEmail();
	}
	
	@When("I enter credentials '$userEmail' and '$userPassword")
	public void IEnterCredentials(@Named("userEmail") String userEmail,@Named("userPassword") String userPassword) {
		homePage.enterLoginCredentials(userEmail,userPassword);
		homePage.logInWithEmail();
	}
	
	
	

}
