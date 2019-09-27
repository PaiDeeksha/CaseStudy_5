Feature: Login Action 
 
Scenario Outline: susseccfully Login with Valid Credentialsd
 
Given the Login page is opened 
When  users click on signin link
 And users enters "<username>" and "<password>"
 Then messages displayed Login Successfully

Examples:
 
|username| password   |
|Lalitha | password123|
|admin   | password456|
