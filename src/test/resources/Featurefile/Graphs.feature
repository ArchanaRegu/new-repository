Feature: Verify Graphs page

  Background: Verify Graphs page Signin
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User navigates to Homepage and Clicks GetStated button of Graphs pane.

  @GraphsTest
  Scenario Outline: Verify Graphpage 
    Given User is in Graphs Page.
    When User scrols to TopicsCovered.
    Then Graphs page is displayed with Topics covered.
      | Graph                 |
      | Graph Representations |

  @GraphsTest
  Scenario Outline: Verify the Graph introduction in the Topics
    Given User clicks "Graph"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @GraphsTest
  Scenario Outline: Verify the Graph Representations in the Topics
    Given User clicks "Graph Representations"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
