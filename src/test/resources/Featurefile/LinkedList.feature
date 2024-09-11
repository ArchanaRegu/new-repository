Feature: Verify Linked List page

  Background: Verify loginpage Signin
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    And User Clicks GetStated button of LinkedList pane.
    Then LinkedList page is displayed with Topics covered.
      | Introduction                    |
      | Creating Linked LIst            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Introduction"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Creating Linked LIst"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Implement Linked List in Python"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Types of Linked List"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Traversal"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Insertion"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Deletion"
    Then new page is displayed with [Try here>>>] button
    When User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |