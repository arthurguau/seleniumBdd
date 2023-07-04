package com.funnygorilla.learnbdd;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageDefinitions {
	
    SearchPageActions searchAction = new SearchPageActions();
    CourseSearchResultPageActions searchResultAction = new CourseSearchResultPageActions();
    String searchKey = null;
  
    @Given("User is on TAFE home page {string}")
    public void goToHomePage(String url) {
        HelperClass.openPage(url);
    }
  
    @When("User enters searchKey as {string}")
    public void goToSeardh(String searchKey) {
    	this.searchKey = searchKey;
        searchAction.search(searchKey);
        // go the next page
    }
       
    @Then("User should be able to search successfully and new page open")
    public void verifySearch() {
    	Assertions.assertTrue(searchResultAction.getCourseSearchResult().contains(searchKey));
    }
     
    @When("User click Delivery and On campus")
    public void applyFilter() {
    	searchResultAction.applyFilter("Delivery", "On campus");
    }
    
    @Then("filter has been applied correctly to the chosen course")
    public void verifyFiltering() {
    	Assertions.assertTrue(searchResultAction.getCourseSearchResult().contains(searchKey));
    }
    
}
