package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( glue = { "runner.stepDefinitions" }, features = { "src/test/resources/features" })
public class TestRunner {

}
