 Feature: Validate instagram sign up
 Scenario Outline:
 Given user visit instagram homepage
 When user click on sign up button
 When user type valid "<email>","<full Name>","<Username>" and"<password>"
When user click on sign up button
Then user can sign up successfully
Examples:
|email||full Name||Username||password|
|akterabul1@gmail.com||Abul Hossan||akterabul||Ponyo666|