Feature:add product to cart 

#Background:
#Given open the browserAnd load the url "https://www.saucedemo.com/"
#When enter the username "standard_user" and password "secret_sauce"
#And click on login button in swagLabs

Scenario:add single product 
When inventory is displayed click on product "Sauce Labs Backpack"
And click on add-to-cart button 
When product is added to cart click on cart button
Then validate whether the product name "Sauce Labs Backpack" is in cart

#Scenario Outline:Scenario:add single product 
#When inventory is displayed click on product "<productname>"
#And click on add-to-cart button 
#When product is added to cart click on cart button
#Then validate whether the product name "<productname>" is in cart

#Examples:
#|productname|
#|Sauce Labs Backpack|
#|Sauce Labs Bike Light|
#|Sauce Labs Bolt T-Shirt|