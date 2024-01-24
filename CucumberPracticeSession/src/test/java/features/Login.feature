Feature: Login to Application

#Background: preconditions
#Given launch the browser
#When user enters facebook url
#Then Facebook login page should be displayed

@smokeTest
Scenario: Login to facebook with valid username valid password
Given user is on facebook loginPage
When user enters valid username "admin" and valid pwd "admin"
Then user click on login btn
Then homePage should be displayed
And notification module should be displayed

@RegTest
Scenario Outline: Login to facebook with valid username valid password
Given user is on facebook loginPage
When user enters valid username <username> and valid pwd <password>
Then user click on login btn
Then homePage should be displayed
And notification module should be displayed
Examples:
|username|password|
|admin|admin|
|admin1|admin|
|admin|admin1|