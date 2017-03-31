package com.Automation.ProjectABC.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by ashvimehta on 22/12/2016.
 */
public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
        log.log_def_track(" completing in constructor of AccountPage");
    }

    public void iperformsingleaction() {
        log.log_def_track("I am in Account Page -iperformsingleAction Method");
    }
}
