Feature: Verify Arrays page

  Background: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    And User Clicks GetStated button of Stack pane.
    Then Stacks page is displayed with Topics covered.
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  @StackTest
  Scenario Outline: Verify the Operations in Stack Topics
    Given User clicks "Operations in Stack".
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @StackTest
  Scenario Outline: Verify the Implementation Topics
    Given User clicks "Implementation".
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @StackTest
  Scenario Outline: Verify the Applications Topics
    Given User clicks "Applications".
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
