package com.Automation.ProjectABC.Utility;

import com.Automation.SharedLibrary.Logging;
import com.Automation.SharedLibrary.PropertyReader;

/**
 * Created by ashvimehta on 20/12/2016.
 */
public class Utility {
    public static final Logging log = Logging.getLogger();
    public static PropertyReader pageElements = PropertyReader.getPageElementInstance();
    public static PropertyReader testConfigs = PropertyReader.getTestConfigInstance();



}
