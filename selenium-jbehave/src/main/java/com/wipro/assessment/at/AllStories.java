
package com.wipro.assessment.at;

import java.util.List;

import com.wipro.assessment.at.configuration.AbstractStoryConfiguration;
import com.wipro.assessment.at.configuration.ProjectConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllStories extends AbstractStoryConfiguration {

	@Override
	public ApplicationContext getAnnotatedApplicationContext() {
		return new AnnotationConfigApplicationContext(ProjectConfiguration.class);
	}
	
	@Override
	public List<String> storyPaths() {
		List<String> paths = new StoryFinder().findPaths(
				CodeLocations.codeLocationFromClass(this.getClass()), "**/stories/loginStartupJediWebsite.story", "");
		return paths;
	}
}
