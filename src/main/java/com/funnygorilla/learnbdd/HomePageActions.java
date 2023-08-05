package com.funnygorilla.learnbdd;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
   HomePageLocators homePageLocators = null;
    
    public HomePageActions() {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumSupport.getDriver(), homePageLocators);
    }
 
    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.getHomePageUserName().getText();
    }
}
