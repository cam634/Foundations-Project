package com.automation.steps;


import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TesterSteps {
     
    @Given("The tester is on their home profile")
    public void the_tester_is_on_their_home_profile() {
        // Write code here that turns the phrase above into concrete actions
        
        TestRunner.driver.get("File:///Users/cameronhauser/Documents/GitHub/Automation-Project/Bugcatch/Foundations-Project/bugcatch/src/test/resources/webpages/Tester/index.html");
    }
    
        
    @Then("the tester should be able to see all the things they were assigned by the manager")
    public void the_tester_should_be_able_to_see_all_the_things_they_were_assigned_by_the_manager() {
        // Write code here that turns the phrase above into concrete actions
        
        String actualTitle = TestRunner.driver.getTitle();

        // to confirm the title is correct and we are on the right page I will use the Assert class
        Assert.assertEquals("Tester", actualTitle); 
    }
    
    
    
        
    @When("The tester selects delcline")
    public void the_tester_selects_delcline() {
        TestRunner.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    

        // Write code here that turns the phrase above into concrete actions
        Select testdefect = new Select(TestRunner.driver.findElement(By.className("acceptDecline")));
        testdefect.selectByVisibleText("Decline");
    }
    @When("The tester hits submit")
    public void the_tester_hits_submit() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.tester.submitButtonTester();
    }
    @Then("The page should show display if the defect was updated")
    public void the_page_should_show_display_if_the_defect_was_updated() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        // Write code here that turns the phrase above into concrete actions
        
         TestRunner.driver.switchTo().alert().dismiss();
     }
     
     
     
   
     
     @When("The tester selects aceept")
     public void the_tester_selects_aceept() {
         // Write code here that turns the phrase above into concrete actions
         Select testdefect = new Select(TestRunner.driver.findElement(By.className("acceptDecline")));
         testdefect.selectByVisibleText("Accept");
     }
     
    


@When("The tester selects fixed")
public void the_tester_selects_fixed() {
    // Write code here that turns the phrase above into concrete actions
    Select testdefect = new Select(TestRunner.driver.findElement(By.name("accepteddefects")));
    testdefect.selectByVisibleText("Fixed");}







@When("The tester selects reject")
public void the_tester_selects_reject() {
    // Write code here that turns the phrase above into concrete actions
    Select testdefect = new Select(TestRunner.driver.findElement(By.name("accepteddefects")));
    testdefect.selectByVisibleText("Rejected");}








@When("The tester selects shelved")
public void the_tester_selects_shelved() {
    // Write code here that turns the phrase above into concrete actions
    Select testdefect = new Select(TestRunner.driver.findElement(By.name("accepteddefects")));
    testdefect.selectByVisibleText("Defect Shelved");}



   

}
