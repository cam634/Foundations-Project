package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginSteps {


@Given("the employee is on the login page")
public void the_employee_is_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
   TestRunner.driver.get("File:///Users/cameronhauser/Documents/GitHub/Automation-Project/Bugcatch/Foundations-Project/bugcatch/src/test/resources/webpages/Login/index.html");
}



@When("the manager enters his correct username")
public void the_manager_enters_his_correct_username() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterUsername("Hero");
    
}
@When("the manager enters his correct password")
public void the_manager_enters_his_correct_password() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterPassword("manager");
}
@When("the employee clicks the login button")
public void the_employee_clicks_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.clickButton();
}
@Then("the manager should be logged in to the manager home page")
public void the_manager_should_be_logged_in_to_the_manager_home_page() {
    // Write code here that turns the phrase above into concrete actions

TestRunner.wait.until(ExpectedConditions.titleIs("Manager"));
   String title = TestRunner.driver.getTitle();
   
   Assert.assertEquals("Manager", title);
}


@Given("the tester is on the login page")
public void the_tester_is_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File:///Users/cameronhauser/Documents/GitHub/Automation-Project/Bugcatch/Foundations-Project/bugcatch/src/test/resources/webpages/Login/index.html");
}



@When("the tester enters his correct username")
public void the_tester_enters_his_correct_username() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterUsername("Baymax");
}
@When("the tester enters his correct password")
public void the_tester_enters_his_correct_password() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterPassword("tester");
}

@Then("the tester should be logged in to the tester home page")
public void the_tester_should_be_logged_in_to_the_tester_home_page() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.wait.until(ExpectedConditions.titleIs("Tester"));

    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Tester", title);
}






}
