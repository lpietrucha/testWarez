package pl.testwarez.base;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.StoryReporterBuilder.Format;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.testwarez.steps.LoginSteps;
import pl.testwarez.utils.SystemHelper;

public abstract class GitLab extends JUnitStories {

    public static String browserName = SystemHelper.getSystemPropertyOrDefault("Browser", "FIREFOX");
    public static WebDriver driver = DriverFactory.valueOf(browserName).getDriver();

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration().useStoryLoader(
                new LoadFromClasspath(this.getClass())).useStoryReporterBuilder(
                new StoryReporterBuilder().withFormats(Format.HTML));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new LoginSteps());
    }

    @Override
	@Test
    public void run() {
        try {
        	super.run();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @AfterScenario
    public void tearDown() {
        driver.quit();
    }
}
