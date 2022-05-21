@regression
Feature: Validating TvUnits and Seating

	@TvUnit
  Scenario Outline: Validating TvUnit
    Given User lands into site
    Then validate page is loaded
     And user logs into the account
     	| Username | <username> |
      | Password | <password> |
    And user clicks on TvUnit icon and checks and uncheck on exclude out of stock
    Then Close the browser
    
     Examples: 
      | username | password |
      | username | password |

	@seating
   Scenario Outline: Validating seating icon
    Given User lands into site
    Then validate page is loaded
     And user logs into the account
     	| Username | <username> |
      | Password | <password> |
    And user clicks on seating icon
    And user clicks on Lounge Chairs
 #   And user clicks on recommended price
    Then Close the browser
    
     Examples: 
      | username | password |
      | username | password |
