package myCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  
@CucumberOptions(plugin = {"json:target/cucumber.json", "pretty"}, features = "src/test/resources/features",

strict = true,
monochrome = true,
glue = {"com.tools.steps"},
tags = {"~@unimplemented"})  
public class CucumberTest {  
}  
