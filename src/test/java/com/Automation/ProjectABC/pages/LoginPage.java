package com.Automation.ProjectABC.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by ashvimehta on 22/12/2016.
 */
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        log.log_def_track(" completing in constructor of LoginPage");
    }

    static String registered_email_address = pageElements.readProperty("LoginPage.registered.email.address");
    static String  registered_password = pageElements.readProperty("LoginPage.registered.password");
    static String signin_button = pageElements.readProperty("LoginPage.signin.button");

    public void verifyPage() {
        seleniumLib.verifyPage(seleniumLib.getElement(registered_email_address));
    }

    public static void enterEmail() {
        seleniumLib.enterText(seleniumLib.getElement(registered_email_address), "frameworkbuild@gmail.com");
    }

    public static void enterPassword() {
        seleniumLib.enterText(seleniumLib.getElement(registered_password), "Framework1!");
    }
    public static void pressSignin() {
        seleniumLib.clickOnSpecifiedItemInList(seleniumLib.getElementList(signin_button), 0);
    }

    public static void performAction() {
        log.log_def_track("Performing last Action as part of validating modules. Action done on Login Page");
    }
}
