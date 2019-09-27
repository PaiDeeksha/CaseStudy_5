Feature: Login Feature
Scenario: registration process
Given the login page is opened
When enter user name as "Deeska1234"
When enter first anme as "Deeksha"and enter last name as "Pai"
When enter password as "Dpai123" and enter confirm password as "Dpai123"
When enter gender as Female
When enter email as "paideek97@gmail.com" and enter mobile number as "8277609549" and DOB as "26/11/1997"
When enter address "Manipal,Udupi" 
When enter sercurity question as 0 and answer as "Manipal"
Then click on register
And user click on signout to exit the app

