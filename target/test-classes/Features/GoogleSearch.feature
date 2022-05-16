Feature: feature to test google search fun

Scenario: Validate google seaerch is working

Given Browser is open
And user is on google search page
When user enters text in search box 
And hits enter
Then  user navigate to search result
