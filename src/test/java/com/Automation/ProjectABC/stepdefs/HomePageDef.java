package com.Automation.ProjectABC.stepdefs;

import com.Automation.SharedLibrary.SharedDriver;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by ashvimehta on 22/12/2016.
 */
public class HomePageDef extends BaseDefs {
    public HomePageDef(SharedDriver driver) {
        super(driver);

        log.log_def_track("completing HomePage Def constructor");
    }
    @Before
    public void beforeStepDef(Scenario scenario) {

        log.log_def_track("Start Before method of Home Page Def");
        scenarios= scenario;
        log.log_def_track("Completing Before method of Home Page Def");
    }


    @Given("^Given I have reached HomePage$")
    public void givenIHaveReachedHomePage()   {
        // Write code here that turns the phrase above into concrete actions
        log.log_def_track("--START Scenario Name = "+ scenarios.getName());
        try {
            basePage.openTestSite();
        } catch (Exception e) {
            log.log_def_error( "Exception Caught", e );
            throw e;
        }
        log.log_def_track("--FINISH Scenario Name = "+ scenarios.getName());
    }

    @Then("^I can navigate to Login Page$")
    public void iCanNavigateToLoginPage()  {
        log.log_def_track("--START Scenario Name = "+ scenarios.getName());
        try {
        homePage.signin();
        } catch (Exception e) {
            log.log_def_error( "Exception Caught", e );
            throw e;
        }
        log.log_def_track("--FINISH Scenario Name = "+ scenarios.getName());
    }


    @Given("^I perform multiple action together$")
    public void Iperformmultipleactiontogether()   {
        // Write code here that turns the phrase above into concrete actions
        log.log_def_track("--START Scenario Name = "+ scenarios.getName());
        try {
            basePage.clickURL("https://www.bbc.co.uk");
           moduleOne.performingModuleAction();
        } catch (Exception e) {
            log.log_def_error( "Exception Caught", e );
            throw e;
        }
        log.log_def_track("--FINISH Scenario Name = "+ scenarios.getName());
    }


}
