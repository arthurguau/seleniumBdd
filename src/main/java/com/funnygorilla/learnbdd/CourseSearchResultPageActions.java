package com.funnygorilla.learnbdd;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CourseSearchResultPageActions {
	
    CourseSearchResultPageLocators courseSearchPageLocators = null;
    
    public CourseSearchResultPageActions() {
        this.courseSearchPageLocators = new CourseSearchResultPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), courseSearchPageLocators);
    }     
    
    // Get the search result from Course-Search Page
    public String getCourseSearchResult() {
    	// need to fix this waiting strategy
    	HelperClass.getAWait("//*[@class='h3 text-brand-grey-600']");
        return courseSearchPageLocators.courseSearchResult.getText();
    }
    
    public void applyFilter(String type, String detail) {
    	HelperClass.getAWait("//div/div/h3[contains(text(),'Delivery')]");    
    	courseSearchPageLocators.deliveryFilter.click();    	
    	HelperClass.getAWait("//input[@id='on-campus']");    	
    	courseSearchPageLocators.onCampus.click();
    }    
}
