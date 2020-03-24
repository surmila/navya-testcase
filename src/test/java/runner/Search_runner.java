package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Search.feature",
tags = {"@tc03_Search"},
glue = {"steps"},
monochrome = true
)
public class Search_runner {

}
