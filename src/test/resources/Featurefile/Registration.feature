Feature: Verify Registration page.
@Registration
  Scenario: Verify Registration
    Given Click Registration Link and User is in Registration page.
    When User enter credentials and Click Register or Clicks login link
    Then User is navigated to homepage
