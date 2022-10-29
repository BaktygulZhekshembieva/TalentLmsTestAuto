Feature: Create new user functionality

  Background: land to Home page
    Given Go to login page
    Given Enter "Baktygul" in userName or Email input field
    And Enter "baktygul87" in password input field
    When user click on login button
    Then user should logged in

    Scenario: Positive: Create new user
      Given user should click Add user button in Admin Home Page
      And verify following field names are displayed
        | First name | Last name | Email address | Username   | Password  | Bio | User type  | Time zone | Language      |
      And enter following date to create new user
        | firstName | lastName | mailAddress      | userName | password      |
        | Elon      | Musk     | musl@tesla.com   | elaon    | Very@PJ77     |
        | Leo       | Musk1    | musrel@tesla.com | leo      | Very@2244PJ77 |