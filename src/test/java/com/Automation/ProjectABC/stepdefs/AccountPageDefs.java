package com.Automation.ProjectABC.stepdefs;

import com.Automation.SharedLibrary.SharedDriver;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

/**
 * Created by ashvimehta on 22/12/2016.
 */
public class AccountPageDefs extends BaseDefs {
    public AccountPageDefs(SharedDriver driver) {
        super(driver);
        log.log_def_track("completing Account Page Def constructor");
    }

    @Before
    public void beforeStepDef(Scenario scenario) {

        log.log_def_track("Start Before method of Account Page Def");
        scenarios= scenario;
        log.log_def_track("Completing Before method of Account Page Def");
    }

    @Then("^My Account Page is displayed$")
    public void myAccountPageIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Then("^I perform single action$")
    public void iperformsingleaction() {
        log.log_def_track("--START Scenario Name = "+ scenarios.getName());
        try {
            accountPage.iperformsingleaction();
        } catch (Exception e) {
            log.log_def_error( "Exception Caught", e );
            throw e;
        }
        log.log_def_track("--FINISH Scenario Name = "+ scenarios.getName());
    }
}
