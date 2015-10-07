package pl.testwarez.scenarios;

import static java.util.Arrays.asList;

import java.util.List;

import pl.testwarez.base.GitLab;

public class LoginScenarios extends GitLab {

	@Override
	protected List<String> storyPaths() {
    	return asList(
    			"stories/login.story"
    	);
	}
}