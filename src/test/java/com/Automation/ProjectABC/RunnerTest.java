package com.Automation.ProjectABC;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

/**
 * Created by ashvimehta on 13/12/2016.
 */
@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features", glue = "com.Automation.ProjectABC.stepdefs", tags = {"@one"}, monochrome= true , plugin = {"pretty", "html:target/cucumber-report/Project XYZ","json:target/cucumber.json"})
public class RunnerTest {
    //public static void main (String[] args) throws Exception {
      //  JUnitCore.main("src.test.java.com.Automation.ProjectABC.RunnerTest");
    //}
}
