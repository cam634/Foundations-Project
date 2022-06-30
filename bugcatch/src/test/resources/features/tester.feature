Feature: Tester should be able to view the defects assigned to them 


    Scenario: As a tester I want to be able to see which defects are assigned to me 

        Given The tester is on their home profile
        Then the tester should be able to see all the things they were assigned by the manager 

    Scenario: As a Tester I want to be able to decline defects if they are low priority 

        Given The tester is on their home profile

        When  The tester selects delcline
        When The tester hits submit
        Then The page should show display if the defect was updated 

     Scenario: As a Tester I want to be able to acept defects if they can be fixed 

        Given The tester is on their home profile
        When  The tester selects aceept
        When The tester hits submit
        Then The page should show display if the defect was updated 
    Scenario: As a Tester I want to be able to reclassify my accepted defects if the get fixed 

        Given The tester is on their home profile
        When  The tester selects fixed
        When The tester hits submit
        Then The page should show display if the defect was updated 
     Scenario: As a Tester I want to be able to reclassify my accepted defects if the get sheleved 

        Given The tester is on their home profile
        When  The tester selects shelved
        When The tester hits submit
        Then The page should show display if the defect was updated 
    Scenario: As a Tester I want to be able to reclassify my accepted defects if the get rejected 

        Given The tester is on their home profile
        When  The tester selects reject
        When The tester hits submit
        Then The page should show display if the defect was updated 






