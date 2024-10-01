Feature: Negative Scenario for username and password
@negative
Scenario: Verify loginpage with invalid username and valid password.
    Given User clicks Sign in link.
    When User enters invalid Username and password and clicks login button
    Then Compare expected Title and actual Tiles.
@negative
Scenario: Verify loginpage with invalid username and invalid password.
    Given User clicks Sign in link.
    When User enters invalid Username and invalid password and clicks login button
    Then Compare expected Title and actual Tiles.
@negative
Scenario: Verify loginpage with valid username and valid password.
   Given User clicks Sign in link.
    When User enters Username and invalid password and clicks login button
    Then Compare expected Title and actual Tiles.

