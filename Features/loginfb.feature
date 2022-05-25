Feature: Validate facebook login.
Scenario Outline:
Given user will visit facebook url.
When user will type valid "<email>" and "<password>"
When user will click on log in button.
Then user will be log in successfully.

Examples:
|email|password|
|akterabul1@gmail.com|Ponyo666|

