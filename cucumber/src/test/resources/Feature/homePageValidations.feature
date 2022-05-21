@regression
Feature: Validating Home page 

  @headerAndFooter
  Scenario Outline: Validating header and footer
    Given User lands into site
    Then validate page is loaded
    And validate header elements
      | TID1 | <tid1> |
    And validate footer elements
      | TID2 | <tid2> |
    And Additional Information
      | TID3 | <tid3> |
    And Validate video call and chat icons
    Then Close the browser

    Examples: 
      | tid1 | tid2 | tid3 |
      |    1 |    2 |    3 |

	@search
  Scenario Outline: Search the text and validate in the next page
    Given User lands into site
    Then validate page is loaded
    And user logs into the account
     	| Username | <username> |
      | Password | <password> |
    And user search the text double cot bed
    And user clicks on the first product
    Then Close the browser
    
    	 Examples: 
      | username | password |
      | username | password |
