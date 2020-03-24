package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Printtable.feature",
tags = {"@tc05_printtable"},
glue = {"steps"},
monochrome = true
)
public class Printtable_runner {

}
