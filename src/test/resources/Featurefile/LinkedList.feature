Feature: Verify Linked List page

  Background: Verify loginpage Signin
    Given User clicks Sign in link.
    When User enters Username and password and clicks login button.
    Then User navigates to Homepage and Clicks GetStated button of LinkedList pane.

  @LinkedTest
  Scenario Outline: Verify Linked page
    Given User is in LinkedList page.
    When User scrols to TopicsCovered.
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
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Creating Linked LIst"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Implement Linked List in Python"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Types of Linked List"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Traversal"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Insertion"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |

  @LinkedTest
  Scenario Outline: Verify the Basic Operations in Linked Lists Topics
    Given User clicks "Deletion"
    When new page is displayed with [Try here>>>] button
    Then User Enters <validInvalid> code in editorpage
    And Click Run button and capture the output

    Examples: 
      | validInvalid |
      | valid        |
      | Invalid      |
