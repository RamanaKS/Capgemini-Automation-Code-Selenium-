package testRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/FeatureFile/FlipCart.feature" }, glue = "StepDefinition", dryRun =false)
public class RunnerIo_ninzaCRM extends AbstractTestNGCucumberTests {
	
}
