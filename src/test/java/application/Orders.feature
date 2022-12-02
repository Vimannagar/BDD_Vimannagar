Feature: Check orders

Background:
Given user should be at the login page
When user enters the username
When user enters the password
And user clicks on the login button
Then user should get logged in


Scenario: Validate the previous order history
When user click on previous order link
Then user should see the previously ordered product


Scenario: Validate the current order status
When user click on current order link
Then user should see the status of ordered product