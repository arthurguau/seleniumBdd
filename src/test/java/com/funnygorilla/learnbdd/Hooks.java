package com.funnygorilla.learnbdd;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
    @Before
    public static void setUp() {
        SeleniumSupport.setUpDriver();
    }
 
    @After
    public static void tearDown(Scenario scenario) {
	    //validate if scenario has failed
	    if(scenario.isFailed()) {
	        final byte[] screenshot = ((TakesScreenshot) SeleniumSupport.getDriver()).getScreenshotAs(OutputType.BYTES);
	        scenario.attach(screenshot, "image/png", scenario.getName()); 
	    }   
	     
	    SeleniumSupport.tearDown();
    }
}
