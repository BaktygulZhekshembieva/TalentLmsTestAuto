Feature: login functionality

  Background: land to Home page
    Given Go to login page

  @login
    Scenario:Positive: Sign in
      Given Enter "Baktygul" in userName or Email input field
      And Enter "baktygul87" in password input field
      When user click on login button
      Then user should logged in







