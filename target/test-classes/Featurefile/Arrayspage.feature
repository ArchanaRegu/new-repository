Feature: Verify Arrays page

  Background: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User navigated to HomePage and Clicks GetStarted button of ArrayPane

  @SmokeTest
  Scenario Outline: Verify ArraysPage
    Given User is navigated to Arrays Page.
    When Arrays page is displayed with Topic Covered.Scroll to TopicsCovered.
    Then List of Topic covered in ArrayPage.
      | Arrays in Python          |
      | Arrays Using List         |
      | Basic Operations in Lists |
      | Applications of Array     |

  @SmokeTest
  Scenario Outline: Verify the Basic Operations in Lists in Array Topics
    Given User clicks "Basic Operations in Lists".
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @SmokeTest
  Scenario Outline: Verify the Arrays in Python Topics
    Given User clicks "Arrays in Python".
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @SmokeTest
  Scenario Outline: Verify the Arrays Using List Topics
    Given User clicks "Arrays Using List".
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @SmokeTest
  Scenario Outline: Verify Applications of Array Topics
    Given User clicks "Applications of Array".
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
