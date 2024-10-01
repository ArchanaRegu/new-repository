Feature: Verify Homepage
@Homepage
Scenario Outline: Verify signpage and homepage
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User navigates to Homepage and verify dropdown list.
    |Arrays|
    |Linked List|
    |Stack|
    |Queue|
    |Tree|
    |Graph|
