Feature: Order's

  Background:
    Given user is on qa "https://qa.imoving.com"


  @test
  Scenario: Verify items still visible when user come back to previous page
    Given choose My Apartment
    And choose "1 Bedroom (600-900 sq ft)" in Move List
    And user click on Compare Quotes button
    And click on Continue button
    And add sofa to my inventory
    And add Lamp to my inventory
    And add rug to my inventory
    Then living room item's should have "3 items"
    Then under My Inventory Living room item's should have "3 items"
    And click on Save and go to next button
    And add Bar stool to my inventory
    And add Kitchen chair to my inventory
    Then Dining room item's should have "2 items"
    Then under My Inventory Dining Room item's should have "2 items"
    And click on Save and go to next button
    And add to inventory Toaster
    And add to inventory Washer
    Then Kitchen item's should have "2 items"
    Then under My Inventory Kitchen item's should have "2 items"
    And click on Save and go to next button
    And add to my inventory Bookcase
    And add TV to my inventory
    Then Bedroom item's should be "2 items"
    Then under My Inventory Bedroom should be "2 items"
    And click on Save and go to next button
    Then Box Calculator appear
    And click on Add and Continue button
    Then user is on moving details page1
    And enter following address in Pick up from input field1 "Trump Tower, North Wabash Avenue, Chicago, IL, 60611"
    And click on Pick up from Approve button
    And User should enter in Drop off at field "Hilton Drive, Hilton, NY 14468"
    And click on Approve in Drop off at
    And click on Confirm button in Your delivery window frame is
    Then go back to Living room page
    Then living room item's should have "3 items"
    Then under My Inventory Living room item's should have "3 items"
    And click on Save and go to next button
    Then Dining room item's should have "2 items"
    Then under My Inventory Dining Room item's should have "2 items"
    And click on Save and go to next button
    Then Kitchen item's should have "2 items"
    Then under My Inventory Kitchen item's should have "2 items"
    And click on Save and go to next button
    Then Bedroom item's should be "2 items"
    Then under My Inventory Bedroom should be "2 items"
    And click on Save and go to next button
    Then Box Calculator appear
    And click on Add and Continue button
    Then Pick up from input field should be "Trump Tower, North Wabash Avenue, Chicago, IL, 60611"
    Then Drop off at input field should be "Hilton Drive, Hilton, NY 14468"
    And click on Confirm button in Your delivery window frame is
    Then click on Choose Movers button
    Then click on In & Out Moving Book Now button
    And user should click on i have read and agreed to the terms and conditions checkbox
    And click on Back to Movers button
    Then click on In & Out Moving Book Now button
    And user should click on i have read and agreed to the terms and conditions checkbox
    And user should click on Continue to payment button
    And fill up all Personal information with fake data
    And Go back to full inventory page
    Then living room item's should have "3 items"
    Then under My Inventory Living room item's should have "3 items"
    And click on Save and go to next button
    Then Dining room item's should have "2 items"
    Then under My Inventory Dining Room item's should have "2 items"
    And click on Save and go to next button
    Then Kitchen item's should have "2 items"
    Then under My Inventory Kitchen item's should have "2 items"
    And click on Save and go to next button
    Then Bedroom item's should be "2 items"
    Then under My Inventory Bedroom should be "2 items"
    And click on Save and go to next button
    Then Box Calculator appear
    And click on Add and Continue button
    Then Pick up from input field should be "Trump Tower, North Wabash Avenue, Chicago, IL, 60611"
    Then Drop off at input field should be "Hilton Drive, Hilton, NY 14468"
    And click on Confirm button in Your delivery window frame is
    Then click on Choose Movers button
    Then click on In & Out Moving Book Now button
    And user should click on i have read and agreed to the terms and conditions checkbox
    And user should click on Continue to payment button