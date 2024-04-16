
Feature:Login
  

  
  Scenario: Successful Login With Valid Credentials
   Given User Launch Chrome Browser
   When User Opens URL "https://admin-demo.nopcommerce.com/login"
   And User enters Email as "admin@yourstore.com "and Password as "admin"
   And Click on Login
   Then Page Title should be "Dashboard / nopcommerce administration"
   When User click on Logout link
   Then Page Title should be "Your store.Login"
   And Close browser
   
   
 Scenario Outline: Successful Login With Valid Credentials DDT
   
   Given User Launch Chrome Browser
   When User Opens URL "https://admin-demo.nopcommerce.com/login"
   And User enters Email as "<email>" and Password as "<password>"
   And Click on Login
   Then Page Title should be "Dashboard / nopcommerce administration"
   When User click on Logout link
   Then Page Title should be "Your store.Login"
   And Close browser   
   
Examples:
 |email|password|   
 |admin@yourstore.com|admin|
 |test@yourstore.com|admin12| 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   