package com.funnygorilla.learnbdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
    @FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    private WebElement homePageUserName;

	public WebElement getHomePageUserName() {
		return homePageUserName;
	}

	public void setHomePageUserName(WebElement homePageUserName) {
		this.homePageUserName = homePageUserName;
	}
    
    
}
