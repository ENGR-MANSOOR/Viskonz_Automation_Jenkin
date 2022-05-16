@login
Feature: Authentication Testing

Scenario: Login in successfully to my website
        
Given browser is open
And user is on login page
When I fill in username
And I fill in password
And I press <submit>
Then user is navigated to home page




