Feature: Search TAFE NSW 
 
Background: 
   Given User is on TAFE home page "http://www.tafensw.edu.au/"
  
   @ValidSearchKey
   Scenario: Search with valid course name     
    When User enters searchKey as "<searchKey>"
    Then User should be able to search successfully and new page open
    When User click Delivery and On campus   
    Then filter has been applied correctly to the chosen course 
    
  Examples:
  | searchKey   | resultMessage |
  | Advanced Barista Skills | 1 Result for "Advanced Barista Skills" |
   