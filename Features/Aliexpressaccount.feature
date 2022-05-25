Feature: Validate aliexpress account button


Scenario Outline:
Given user visits ali express home page
When user go to account option
When user click on join button
When user select Bangladesh in dropdown menu
And user type valid "<email>" and "<password>" and click creat button
Then user will be able to create account.

Examples:
|email||password|
|afrozamukta79@gmail.com||123456|