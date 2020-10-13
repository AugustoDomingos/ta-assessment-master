package com.wipro.assessment.at.steps;

import com.wipro.assessment.at.context.TestContext;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractSteps {
	
	@Autowired
	protected TestContext context;
}
