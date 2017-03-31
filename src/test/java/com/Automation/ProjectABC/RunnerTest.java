package com.Automation.ProjectABC;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by ashvimehta on 13/12/2016.
 */
@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features", glue = "com.Automation.ProjectABC.stepdefs", tags = {"@one"}, format = {"html:target/cucumber-report/Project XYZ","json:target/cucumber.json"})
public class RunnerTest {
}
