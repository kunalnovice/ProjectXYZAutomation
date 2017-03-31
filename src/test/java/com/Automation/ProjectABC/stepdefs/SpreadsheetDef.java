package com.Automation.ProjectABC.stepdefs;

import com.Automation.SharedLibrary.SharedDriver;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

/**
 * Created by ashvimehta on 22/12/2016.
 */
public class SpreadsheetDef extends BaseDefs {
    public SpreadsheetDef(SharedDriver driver) {
        super(driver);

        log.log_def_track("completing SpreadsheetDef Def constructor");
    }
    @Before
    public void beforeStepDef(Scenario scenario) {

        log.log_def_track("Start Before method of SpreadsheetDef ");
        scenarios= scenario;
        log.log_def_track("Completing Before method of SpreadsheetDef ");
    }

    @Given("^Read from Spreadsheet$")
    public void when_step() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        log.log_def_track("I am in Given Step");

    }

}
