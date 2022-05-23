@sc2
Feature:  amazon search

In order to verify search 
as a register user 
i want to visit amazon web page and write a text in search box then search
  
Scenario Outline: 
Given user will visit amazon home page
And user will search by "<productName>" 
Then user will click on search button

Examples:

|productName| 
|iPhone 12 pro max |