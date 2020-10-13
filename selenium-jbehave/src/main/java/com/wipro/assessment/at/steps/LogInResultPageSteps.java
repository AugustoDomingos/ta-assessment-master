package com.wipro.assessment.at.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.wipro.assessment.at.pages.LogInResultPage;

import lombok.extern.slf4j.Slf4j;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LogInResultPageSteps extends AbstractSteps {
	
	@Autowired
	private LogInResultPage logInResultPage;
	
	
	@Then("I should log in successfully with '$userId'")
	public void IShouldLogInSuccessfully(@Named("userId") String userId) {
		String loginId = logInResultPage.getLoginId(userId);
		log.info("Login id: '{}' ...", loginId);
		assertEquals(userId,loginId);	
	    	    
	}
	
	@Then("I should not log in successfully with '$userId'")
	public void IShouldNotLogInSuccessfully() {
		String errorMessage = logInResultPage.getLogInErrorMessage();
		log.info("Login error message: '{}' ...", errorMessage);		
		assertTrue(errorMessage.contains("Sorry, unrecognized username or password."));	
		
	}
	
}
