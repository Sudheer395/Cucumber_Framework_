@regression
Feature: Validating Explore more Section
	@referAndEarn
  Scenario Outline: Validating refer and earn
    Given User lands into site
    Then validate page is loaded
    And user logs into the account
     	| Username | <username> |
      | Password | <password> |
    And user clicks on Refer and Earn in Explore more Section
    Then Close the browser
    
    	 Examples: 
      | username | password |
      | username | password |

   @giftcard
   Scenario Outline: Validating Gift card
    Given User lands into site
    Then validate page is loaded
    And user logs into the account
     	| Username | <username> |
      | Password | <password> |
    And user clicks on Gift card in Explore more Section
    Then Close the browser
    
    	 Examples: 
      | username | password |
      | username | password |
