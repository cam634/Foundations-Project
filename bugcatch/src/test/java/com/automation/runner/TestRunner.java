package com.automation.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.Login;
import com.automation.poms.Manager;
import com.automation.poms.Tester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.Messages.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="com/automation/steps")
public class TestRunner {
    public static WebDriver driver;
    public static Login login;
    public static WebDriverWait wait;
    public static Manager manager;
    public static Tester tester;

    @BeforeClass
    public static void setup(){
    
        driver = new ChromeDriver();
        login = new Login(driver);
        wait = new WebDriverWait(driver, 15);
        manager = new Manager(driver);
        tester = new Tester(driver);
    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
