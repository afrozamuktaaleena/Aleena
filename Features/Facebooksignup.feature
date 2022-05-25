Feature: facebook signup
in order to verify fb sign up
 as a user
i want to do facebook sign up

 @fbsignup_happypath
  

 
  Scenario Outline: 
    Given user visits facebook url
    When user enter  "<First name>"and "<Last name>" and valid "<email address>" and valid "<password>"
    When user selects dropdown month and dropdown day and dropdown year
    When user click gender radio button and click on sign up
    Then user will be sign up successfully.

    Examples: 
    | First name | Last name | email address | password |
    | Abul        | Hossan     |akterabul1@gmail.com   | Ponyo666 |
