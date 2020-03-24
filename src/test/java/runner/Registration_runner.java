package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Registration.feature",
tags = {"@tc01_Registration"},
glue = {"steps"},
monochrome = true
)
public class Registration_runner {


}
