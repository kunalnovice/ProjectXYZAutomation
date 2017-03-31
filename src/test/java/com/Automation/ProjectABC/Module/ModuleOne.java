package com.Automation.ProjectABC.Module;

import com.Automation.ProjectABC.Utility.Utility;
import com.Automation.ProjectABC.pages.HomePage;
import com.Automation.ProjectABC.pages.LoginPage;

/**
 * Created by ashvimehta on 26/12/2016.
 */
public class ModuleOne extends Utility {
    public ModuleOne() {
               log.log_def_track("I have executed ModuleOne Constructor");
    }

    public void performingModuleAction() {
        HomePage.performMultipleAction();
        LoginPage.performAction();
    }
}
