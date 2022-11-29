Feature: Login functionality
Scenario: Validation for login functionality
Given User should be at login page
When Enter the username to the text field
And Enter the password into the text field
Then user should be able to login
But User should not see the login button over screen

