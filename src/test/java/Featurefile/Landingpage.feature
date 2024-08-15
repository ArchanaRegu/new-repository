Feature: DsAlgo Landing page
#Background: Verify loginpage Signin page
#Given Click Signin link
#When Enter valid "Nirvana" and "archanachaya", click login.
#Then Click login button.
@Monkey
Scenario Outline: Verify DataStructure page
Given Click  GetStated button of "Data Structures-Introduction" pane.
When Data Structures-Introduction page is displayed with Topics covered.User clicks TimeComplexity link.
Then Enter <validInvalid> code in editorpage
And Click Run button and capture the output
Examples:
|validInvalid|
|valid|
|Invalid|




