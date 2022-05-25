@tag1
Feature: verify amazon return and orders button.
In order to verify amazon return and order button
as a registered user
i want to visit amazon home page,click on return and
 order button type email and click on contintue.
 
 Scenario Outline:
 Given user visits amazon homepage
 When user click on Returns & Orders button
 Then user type valid "<email>" and click on continue button
 
 Examples:
 |email|
 |afrozamukta79@gmail.com|