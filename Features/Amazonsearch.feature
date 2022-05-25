@sc2
Feature: user want to visit amazon web page and verify search

In order to verify search
as a register user
i want to visit amazon web page and write a text in search box then search

Scenario Outline:
 Given  user visit amazon home page
 And  user search by "<productname>"
 Then  user click on search button
 
 Examples:
 |productname|
 | iphone 12 pro max|