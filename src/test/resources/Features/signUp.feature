#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@signup
Feature: Die Benutzerregistrierung bestätigen

  @tag1
Scenario: Create a New User 
Given browser will open 
And user is on signup page
And user click on Registartion tab
When User fill in username
And User fill in email
And User fill in password
And User fill in re password
And user clicks on terms
And user clicks register button
Then user is navigated to same page


