package com.Automation.ProjectABC.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by ashvimehta on 22/12/2016.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        log.log_def_track(" completing in constructor of HomePage");
    }
WebElement element ;

    String signin = pageElements.readProperty("HomePage.signin");

    public void signin() {
        seleniumLib.clickOnElement(seleniumLib.getElement(signin));
    }

    public static void performMultipleAction() {
        log.log_def_track("performing 1 action on the Home page");
        log.log_def_track("performing 2 action on the Home page");

    }
}
