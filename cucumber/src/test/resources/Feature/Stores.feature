  @regression
  Feature: store address
  
  @stores
  Scenario Outline: Search the text and validate in the next page
    Given User lands into site
    Then validate page is loaded
    And user logs into the account
     	| Username | <username> |
      | Password | <password> |
    And user clicks on stores
    Then Close the browser
    
    	 Examples: 
      | username | password |
      | username | password |