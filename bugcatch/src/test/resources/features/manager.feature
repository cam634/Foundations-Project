
Feature: managers should be able to enter any defects 
Scenario:   Managers should be able to create a defect

        Given   the manager is on the manager homepage page
        When    the manager enters a defect 
        When    the manager assigns it to a tester
        When    the manager clicks the submit button
        Then    the manager should see a alert with a defect 
 