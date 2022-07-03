package com.automation.poms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Tester {
    @FindBy(id = "pendingsubmitbutton")
    public WebElement submitButtonTester;

    public Tester(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    public void submitButtonTester(){
        this.submitButtonTester.click();
    }
    
}
