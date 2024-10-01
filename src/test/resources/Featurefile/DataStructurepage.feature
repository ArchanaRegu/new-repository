Feature: DsAlgo Landing page
Background:
Given User clicks Sign in link.
When User enters Username and password and clicks login button.
Then User navigates to home page.
@DataStructure
Scenario Outline: Verify DataStructure page
Given Click  GetStarted button of Data Structures-Introduction pane.
When Data Structures-Introduction page is displayed with Topics covered.User clicks TimeComplexity link.
Then User Enters <validInvalid> code in editorpage
And Click Run button and capture the output
Examples:
|validInvalid|
|valid|
|Invalid|


      
   


