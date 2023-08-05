package com.funnygorilla.learnbdd;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
	
    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();
  
    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) {
        SeleniumSupport.openPage(url);
    }
  
    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
        objLogin.login(userName, passWord);
    }
      
    @Then("User should be able to login sucessfully and new page open")
    public void verifyLogin() {
        Assertions.assertTrue(objHomePage.getHomePageText().contains("Employee Information"));
    }
     
    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
        Assertions.assertEquals(objLogin.getErrorMessage(),expectedErrorMessage);
    }
}
