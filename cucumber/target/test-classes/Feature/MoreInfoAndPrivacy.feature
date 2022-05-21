@regression
Feature: More info and privacy policy

	@moreInfo
  Scenario Outline: More info
    Given User lands into site
    Then validate page is loaded
    And user prints the more info text
    Then Close the browser
   

	@privacy
   Scenario Outline: Validating seating icon
    Given User lands into site
    Then validate page is loaded
    And user clicks on privacy policy and user prints the content
    Then Close the browser
    
     
     
