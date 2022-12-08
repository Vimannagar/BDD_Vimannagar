Feature: Login functionality
Scenario Outline: login with different combination of credentials
Given user is at the login screen
When user enter the "<username>" in username field
And user enter the "<password>" in password field
And user clicks on signin button
Then user should get message

Examples:

| username | password |
| abc | 123456 |
| invalidusername | abc123 |
| invalidusername | invalidpassword |
