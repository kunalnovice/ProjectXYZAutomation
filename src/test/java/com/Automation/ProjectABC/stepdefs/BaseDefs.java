package com.Automation.ProjectABC.stepdefs;

import com.Automation.ProjectABC.Module.ModuleOne;
import com.Automation.ProjectABC.Utility.Utility;
import com.Automation.ProjectABC.pages.AccountPage;
import com.Automation.ProjectABC.pages.BasePage;
import com.Automation.ProjectABC.pages.HomePage;
import com.Automation.ProjectABC.pages.LoginPage;
import com.Automation.SharedLibrary.SharedDriver;
import cucumber.api.Scenario;

/**
 * Created by ashvimehta on 20/12/2016.
 */


public class BaseDefs extends Utility {

    protected static BasePage basePage;
    protected static HomePage homePage;
    protected static LoginPage loginPage;
    protected static AccountPage accountPage;
    protected static ModuleOne moduleOne= new ModuleOne();
    protected static Scenario scenarios;

    public BaseDefs(SharedDriver driver) {
        log.log_def_track("START In Constructor of Base Defs");
        initalize(driver);
       // basePage = new BasePage(driver);
       // homePage = new HomePage(driver);
        //loginPage = new LoginPage(driver);
        //accountPage = new AccountPage(driver);
        //moduleOne= new ModuleOne(driver);
        log.log_def_track("FINISH In Constructor of Base Defs");
    }

    private void initalize(SharedDriver driver) {
        if (basePage == null) {
            basePage = new BasePage(driver);
        }
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        if (accountPage == null) {
            accountPage = new AccountPage(driver);
        }

    }


}
