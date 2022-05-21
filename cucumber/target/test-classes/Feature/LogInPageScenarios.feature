@regression
Feature: Validatins After login

	@login
  Scenario Outline: Login and validate the dropdown, then log out
    Given User lands into site
    Then validate page is loaded
    And user logs into the account
    	| Username | <username> |
      | Password | <password> |
    And Hover on login and validate Profile
    And Hover on login and validate Order
    And Hover on login and validate Vouchers
    And user clicks on logout
    Then Close the browser

    Examples: 
      | username | password |
      | username | password |