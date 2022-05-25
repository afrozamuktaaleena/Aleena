Feature: Validate Bestbuy Search Function
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
   Given User Visits Bestbuy homepage
   When User Clicks on search field
   When User type "<product name>"
   And User clicks on the search button
   Then user will see the search result page
   
  Examples:
  |product name|
  |Laptop|
