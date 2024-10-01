Feature: Verify Stack page

  Background: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User navigates to Homepage and Clicks GetStated button of Stack pane.

  @StackTest
  Scenario Outline: Verify Stackpage and its Topics Covered.
    Given User is in Stack Page.
    When User scrols to TopicsCovered.
    Then Stacks page is displayed with Topics covered.
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  @StackTest
  Scenario Outline: Verify the Operations in Stack Topics
    Given User clicks "Operations in Stack".
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @StackTest
  Scenario Outline: Verify the Implementation in stack Topics
    Given User clicks "Implementation".
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @StackTest
  Scenario Outline: Verify the Applications in Stack Topics
    Given User clicks "Applications".
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
