package com.wipro.assessment.at.pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HomePage extends AbstractPage {
	
	private final String LOGIN_BUTTON_CLASS = "sign-in-btn";
	private final String LOGIN_EMAIL_BUTTON_CLASS = "ulogin-button-mail";
	private final String USERNAME_FIELD_ID = "edit-name--2";
	private final String PASSWORD_FIELD_ID = "edit-pass";
	private final String LOGIN_SUBMIT_BUTTON_ID = "edit-submit--3";
	
	
	
	@Value("${URL}")
	private String URL;
	
	public void navigateTo() {
		webDriverProvider.get().get(URL);
	}
	
	public void clickLogIn() {
		log.info("Clicking on Log in button ...");
		waitElementToBeClickable(By.className(LOGIN_BUTTON_CLASS));
	}
	
	public void clickLogInWithEmail() {
		log.info("Clicking on Log in with email button ...");
		waitElementToBeClickable(By.className(LOGIN_EMAIL_BUTTON_CLASS));
	}	
	
	public void enterLoginCredentials(String userEmail, String userPassword)  {
		log.info("Entering login credentials '{}' ...", userEmail);		
		webDriverProvider.get().findElement(By.id(USERNAME_FIELD_ID)).sendKeys(userEmail);
		webDriverProvider.get().findElement(By.id(PASSWORD_FIELD_ID)).sendKeys(userPassword);		
	}	
	
	public void logInWithEmail() {
		log.info("Logging in  ...");
		waitElementToBeClickable(By.id(LOGIN_SUBMIT_BUTTON_ID));
	}
	
	
	
	
}



