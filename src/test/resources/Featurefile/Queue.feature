Feature: Validate the Queue Page

  Background: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    And User Clicks GetStated button of Queues pane.
    Then Queues page is displayed with Topics covered.
      | Implementation of Queue in Python      |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |

  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Implementation of Queue in Python"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Implementation using collections.deque"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |


  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Implementation using array"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Queue Operations"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |