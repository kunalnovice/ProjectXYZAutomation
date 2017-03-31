package com.Automation.ProjectABC.pages;


import com.Automation.ProjectABC.Utility.Utility;
import com.Automation.SharedLibrary.PropertyReader;
import com.Automation.SharedLibrary.SeleniumLib;
import com.Automation.SharedLibrary.Logging;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by ashvimehta on 13/12/2016.
 */
public class BasePage extends Utility {

     WebDriver driver;
     //PropertyReader  pageElementInstance=  PropertyReader.getPageElementInstance();
     //PropertyReader  testConfigInstance= PropertyReader.getTestConfigInstance();
     public static SeleniumLib seleniumLib ;



    public BasePage(WebDriver driver) {
        log.log_def_track("Started Base Page Constructor");
        this.driver= driver;
        seleniumLib = new SeleniumLib(driver);
        log.log_def_track(" completing in constructor of BasePage");
    }
    @Test
    public void chk() {
        System.out.println(pageElements.readProperty("BROWSER"));
       // System.out.println(testConfigInstance.readProperty("BROWSER"));
    }

public void clickURL(String URL) {
    seleniumLib.openURL(URL);


}

    public void openTestSite() {
        clickURL(testConfigs.readProperty("TEST_URL"));

    }

 public  void displayProperty() {
     String str = pageElements.readProperty("somepage.somevariable");
     seleniumLib.getElement(str);

     seleniumLib.clickOnElement(seleniumLib.getElement(str));
    }
}
