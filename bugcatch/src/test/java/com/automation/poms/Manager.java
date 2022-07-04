package com.automation.poms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Manager {
    @FindBy(id =  "btn")
    public WebElement submitButton;
    @FindBy(id = "Defect")
    public WebElement defectDescription;
    
    
    

    public Manager(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    public void clickSubmit(){
        this.submitButton.click();
    }
    public void enterDefect(String Defect){
        this.defectDescription.sendKeys(Defect);
    }
    
}
