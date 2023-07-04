package com.funnygorilla.learnbdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {
	
    @FindBy(xpath = "//input[@id='homePageSearch']")
    public WebElement searchKey;
  
//    @FindBy(id = "logInPanelHeading")
//    public WebElement titleText;
  
    @FindBy(xpath = "//*[@aria-label='Submit search']")
    public WebElement search;
  
    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    public  WebElement errorMessage;    
}
