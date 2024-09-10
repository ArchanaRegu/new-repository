Feature: Negative Scenario for username and password
@negative
Scenario: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters invalid Username and password and clicks login button
    
@negative
Scenario: Verify login page
    Given User clicks GetStarted button.
    Then User clicks Sign in link.
    When User enters invalid Username and invalid password and clicks login button
   
@negative
Scenario: Verify login page
   Given User clicks GetStarted button.
   Then User clicks Sign in link.
    When User enters Username and invalid password and clicks login button
    
    