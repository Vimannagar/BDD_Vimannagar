Feature: Search product functionality

@Smoke
Scenario: validation of Login functionality
Given user should be available at login page
When user enters the valid username
When user enters the valid password
And user click on login button
Then user should get logged into app


@Regression
Scenario: validation of search functionality
Given user should have logged into App
When user enters the text
And Click on search icon
Then user should gets result


