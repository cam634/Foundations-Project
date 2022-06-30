package com.automation.steps;

import java.sql.Driver;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class ManagerCreateDefect {
    @Given("the manager is on the manager homepage page")
public void the_manager_is_on_the_manager_homepage_page() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File:///Users/cameronhauser/Documents/GitHub/Automation-Project/Bugcatch/bugcatch/src/test/resources/webpages/Manager/index.html");
}

@When("the manager enters a defect")
public void the_manager_enters_a_defect() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.manager.enterDefect("Defect Automation Test");
}
@When("the manager assigns it to a tester")
public void the_manager_assigns_it_to_a_tester() {
    // Write code here that turns the phrase above into concrete actions
    Select assignDefect = new Select(TestRunner.driver.findElement(By.id("DefectAssgin")));
    assignDefect.selectByVisibleText("Tester");
}
@When("the manager clicks the submit button")
public void the_manager_clicks_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    TestRunner.manager.clickSubmit();
}
@Then("the manager should see a alert with a defect")
public void the_manager_should_see_a_alert_with_a_defect() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    // Write code here that turns the phrase above into concrete actions
    String checkIfCreated = TestRunner.driver.switchTo().alert().getText();
     Assert.assertEquals("Created", checkIfCreated);
     TestRunner.driver.switchTo().alert().dismiss();
}


    
}
