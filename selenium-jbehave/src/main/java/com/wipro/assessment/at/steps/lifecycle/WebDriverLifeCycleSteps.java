package com.wipro.assessment.at.steps.lifecycle;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.ScenarioType;
import org.jbehave.web.selenium.WebDriverProvider;
import org.jbehave.web.selenium.WebDriverSteps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.assessment.at.configuration.pageobjects.PageObjectBeanPostProcessor;

@Component
public class WebDriverLifeCycleSteps extends WebDriverSteps{

	@Autowired
	PageObjectBeanPostProcessor pageObjectPostProcessor;

	@Autowired
	WebDriverProvider driverProvider;

    public WebDriverLifeCycleSteps(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    @BeforeScenario(uponType = ScenarioType.EXAMPLE)
    public void beforeExample() throws Exception {       
        driverProvider.initialize();           
        // Maximize browser window:
		driverProvider.get().manage().window().maximize();
    
    }

    @AfterScenario(uponType = ScenarioType.EXAMPLE)
    public void afterExample() throws Exception {
        driverProvider.end();
        
    }	
	
	
	
	
}
