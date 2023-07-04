package com.funnygorilla.learnbdd;

import org.openqa.selenium.support.PageFactory;

public class SearchPageActions {
	
    SearchPageLocators searchPageLocators = null; 
    
    public SearchPageActions() {
        this.searchPageLocators = new SearchPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), searchPageLocators);
    }
    
//    // Get the title of Search Page
//    public String getLoginTitle() {
//        return searchPageLocators.titleText.getText();
//    }
        
    // Get the title of Login Page
    public String getErrorMessage() {
        return searchPageLocators.errorMessage.getText();
    }
       
    public void search(String searchkey) {
        // Fill user name
        this.setSearchKey(searchkey);
        // Click Login button
        this.clickSearch();  
    }
    
    //---------------------------------------------------------- private methods
    // Set search key in textbox
    private void setSearchKey(String searchkey) {
    	searchPageLocators.searchKey.sendKeys(searchkey);
    }
    
    // Click on login button
    private void clickSearch() {
    	searchPageLocators.search.click();
    }
}
