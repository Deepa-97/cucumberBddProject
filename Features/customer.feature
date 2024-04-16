
Feature: customer
  

  
  Scenario: Add New customer
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User click on Login
    Then User can view Dashboard
    When User click on customers menu
    And click on customers menu item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on save button
    Then User can view  confirmation message"The new customer has been added successfully"
    And close browser
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
