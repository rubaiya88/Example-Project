Feature: Facebook sign up

In order to verify search
as a user 
i want to Face book sign up 

@fbsignup_happypath
Scenario Outline:
Given user will visiting Facebook URL
When user will enter "<First name>" and"<Last name>" and valid "<email address>" and "<new password>"
Then user will select dropdown Month and dropdown Day and dropdown Year

Examples:
|First name| Last name| email address   |new password|
|Amy       | Bari     |esdy@gmail.com   |class@2020  |

