package com.Automation.ProjectABC.stepdefs;

import com.Automation.SharedLibrary.SharedDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.TakesScreenshot;

/**
 * Created by ashvimehta on 13/12/2016.
 */
public class Test1StepDefs extends BaseDefs {

    public Test1StepDefs(SharedDriver driver) {
        super(driver);
        log.log_def_track("completing Test1 Def constructor");
    }

    @Before
    public void beforeStepDef(Scenario scenario) {

        log.log_def_track("Start Before method of Test1 Step Def");
        scenarios= scenario;
        log.log_def_track("Completing Before method of Test1 Step Def");
    }

    @Given("^given step$")
    public void given_step() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


        log.log_def_track("SCENARIO Name = "+ scenarios.getName());
        basePage.openTestSite();
        basePage.clickURL("Https://www.google.co.uk");
        log.log_def_track("given printing info");


    }

    @When("^when step$")
    public void when_step() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        log.log_def_track("I am in when Step");
    }

    @Then("^then step$")
    public void then_step() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        log.log_def_track("I am in Then Step");
    }

/*
    @After
    public void take_screenshot(Scenario scenario) {
        //scenario.write("Current Page Url is" +driver.getCurrentUrl());
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }


    }

*/





}
