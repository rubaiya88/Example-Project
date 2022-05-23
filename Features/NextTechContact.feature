Feature:NextTechContact 

In order to contact NextTech
As a student/site visitors
I want to click on contact and type name, email, message
and click on submit button


Scenario: NextTechContact

Given user will visit NextTech homepage
When user will clicks on contact option
When user will type valid "<Name>", valid "<Email>" and valid "<Message>"
When user will click on submit button
Then user will be able to submit message successfully

