package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Login.feature",
tags = {"@tc02_Login"},
glue = {"steps"},
monochrome = true
)
public class Login_runner 
{

}
