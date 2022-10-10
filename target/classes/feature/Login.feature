Feature: login functionality

  Background: land to Home page
    Given Go to login page

  @smoke
    Scenario:Positive: Sign in
      Given Enter "Baktygul" in userName or Email input field
      And Enter "baktygul87" in password input field
      When user click on login button
      Then user should logged in


    Scenario: Positive: creating user
    Given Enter "Baktygul" in userName or Email input field
    And Enter "baktygul87" in password input field
    When user click on login button
    Then user should logged in
    When user click on administrator Dashboard button
    Then user should successfully logged in
    When user click add user button
    Then user should be in add user page
    And user should see following field names
      | First name | Last name | Email address |
      | Username   | Password  | Bio           |
      | User type  | Time zone | Language      |


