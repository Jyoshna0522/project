Feature: To Buy the product 
#@Addto_Bag
  #Scenario: Signup into Nykaa
  #Given user can enter into homepage of nykaa
  #When user can enter the email address
  #Then Signup successfully
  #@Addto_Bag
#Scenario: To choose a product
#Given User can select a particular product
#When User can select one item
#Then Add to bag
@regression
 Scenario Outline: test with multiple parameters
 
 Given User can enter into homepage
 When User can enter into valid username "<username>" and password "<password>"
 
 
 
Examples:
|username|password|
|jyoshna|j@0522|
|Green|G@076|

 