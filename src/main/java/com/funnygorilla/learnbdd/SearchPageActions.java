package com.funnygorilla.learnbdd;

import org.openqa.selenium.support.PageFactory;

public class SearchPageActions {
	
    SearchPageLocators searchPageLocators = null; 
    
    public SearchPageActions() {
        this.searchPageLocators = new SearchPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), searchPageLocators);
    }
    
    public void search(String searchkey) {
        this.setSearchKey(searchkey);
        this.clickSearch();  
    }
    
    //---------------------------------------------------------- private methods
    // Set search key in textbox
    private void setSearchKey(String searchkey) {
    	searchPageLocators.searchKey.sendKeys(searchkey);
    }
    
    private void clickSearch() {
    	searchPageLocators.search.click();
    }
}
