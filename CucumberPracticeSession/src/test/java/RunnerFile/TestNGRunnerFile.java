package RunnerFile;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/java/features",glue = "stepDefination",dryRun = false,tags = "@RegTest or @smokeTest",
plugin = {"pretty","html:target/cucumber.html"})
public class TestNGRunnerFile extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}