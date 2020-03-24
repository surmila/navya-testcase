package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Addtocart.feature",
tags = {"@tc04_addtocart"},
glue = {"steps"},
monochrome = true
)
public class Addtocart_runner {

}
