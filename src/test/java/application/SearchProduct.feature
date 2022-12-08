Feature: Search product functionality
Scenario: validation of search functionality
Given user should have logged in
When user enters the text "mobile phone" in search field
And Click on search button
Then user gets result

