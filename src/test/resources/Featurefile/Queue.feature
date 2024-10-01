Feature: Validate the Queue Page

  Background: Verify loginpage Signin page
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User navigates to Homepage and Clicks GetStated button of Queue pane.

  @QueuesTest
  Scenario Outline: Verify the Queues page.
    Given User is in Queue Page.
    When User scrols to TopicsCovered.
    Then Queues page is displayed with Topics covered.
      | Implementation of Queue in Python      |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |

  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Implementation of Queue in Python"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Implementation using collections.deque"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Implementation using array"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @QueuesTest
  Scenario Outline: Verify the Basic Operations in Queues Topics
    Given User click "Queue Operations"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
