package com.wipro.assessment.at.pages;

import org.openqa.selenium.By;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LogInResultPage extends AbstractPage {
	
	private final String LOGIN_SUCC_USER_ID = ".field-item.even";
	private final String LOGIN_WRONG_CREDENTIAL_CSS = ".alert.alert-block.alert-danger.messages.error";
	
		
	
	public String getLoginId(String userId) {
		log.info("Checking login success  ...");
		 //waitPageLoad();		
		return webDriverProvider.get().findElement(By.cssSelector(LOGIN_SUCC_USER_ID)).getText();		
	}
	
	public String getLogInErrorMessage( ) {
		log.info("Checking login failure  ...");	
		 //waitPageLoad();
		 return webDriverProvider.get().findElement(By.cssSelector(LOGIN_WRONG_CREDENTIAL_CSS)).getText();
	}
	
	
	
	
}
