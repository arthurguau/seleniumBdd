package com.funnygorilla.learnbdd;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * mvn clean test -Dcucumber.features="src/test/resources/features" -Dwebdriver.chrome.driver="C:\\Opt\\Selenium\\chromedriver.exe"
 * @author Arthur Gu
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.funnygorilla.learnbdd")
public class CucumberRunnerTests {

}
