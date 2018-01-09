Feature: Login Action

Scenario: Succcessful Login with Valid Credentials


Given User is  on Home page
When user navigate to login page
And User enters username and password
Then Message displayed login Succseefully
