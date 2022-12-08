Feature: signup functionality
Scenario: Enter details over the page
Given User is at signup page
When user enters following details
| Daniel | Martin | abc |
| Eder | Mejia | xyz |
| Ron | Dutta | tuv |
Then user should see values