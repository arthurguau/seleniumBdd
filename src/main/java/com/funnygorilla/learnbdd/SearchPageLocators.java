package com.funnygorilla.learnbdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {
	
    @FindBy(xpath = "//input[@id='homePageSearch']")
    public WebElement searchKey;
  
    @FindBy(xpath = "//*[@aria-label='Submit search']")
    public WebElement search; 
}
