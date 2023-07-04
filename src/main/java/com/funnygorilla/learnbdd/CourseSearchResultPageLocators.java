package com.funnygorilla.learnbdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CourseSearchResultPageLocators {

	@FindBy(xpath = "//*[@class='h3 text-brand-grey-600']")
	public  WebElement courseSearchResult;
	
    @FindBy(xpath = "//div/div/h3[contains(text(),'Delivery')]")
    public  WebElement deliveryFilter;
    
    @FindBy(xpath = "//input[@id='on-campus']")
    public  WebElement onCampus;    
    
    @FindBy(xpath = "//span[contains(text(),'On campus')]")
    public  WebElement appliedDeliveryFilter;  
}
