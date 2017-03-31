package com.Automation.ProjectABC.stepdefs;

import com.Automation.SharedLibrary.SharedDriver;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by ashvimehta on 22/12/2016.
 */
public class LoginPageDef extends BaseDefs {
    public LoginPageDef(SharedDriver driver) {
        super(driver);
        log.log_def_track("completing LoginPage Def constructor");

    }

    @Before
    public void beforeStepDef(Scenario scenario) {
        log.log_def_track("Start Before method of Login Page Def");
        scenarios = scenario;
        log.log_def_track("Completing Before method of Login Page Def");
    }


    @When("^when I submit valid credentials on Login Page$")
    public void whenISubmitValidCredentialsOnLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I am on Login Page$")
    public void givenIAmOnLoginPage() {
        log.log_def_track("--START Scenario Name = " + scenarios.getName());
        try {
            loginPage.verifyPage();
            loginPage.enterEmail();
            loginPage.enterPassword();
            loginPage.pressSignin();
        } catch (Exception e) {
            log.log_def_error("Exception Caught Hint:Verify Page Object is initalised", e);
            throw e;
        }
        log.log_def_track("--FINISH Scenario Name = " + scenarios.getName());
    }
}
