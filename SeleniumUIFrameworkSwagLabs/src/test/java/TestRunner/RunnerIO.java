package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/FeatureFile/AddToCart.feature" }, glue = "stepDefinition", dryRun =false)
public class RunnerIO extends AbstractTestNGCucumberTests {
	
}
