Feature: Login to MAI Project Owner Portal
  As a project owner
  I want to log in to the MAI portal
  So that I can access my construction projects

  Scenario: Successful login with valid credentials
    Given I am on the MAI Project Owner Login page
    When I enter a valid email address "jrb224487@gmail.com"
    And I enter a valid password "Jrb@224487"
    And I click on the  button
    Then I should be redirected to the dashboard

  Scenario: Login attempt with invalid credentials
    Given I am on the MAI Project Owner Login page
    When I enter an invalid email address "HSIFIFF.com"
    And I enter an invalid password "Je2999292@"
    And I click on the "Login" button
    Then I should see an error message "Invalid email or password"

  Scenario: Login attempt with empty fields
    Given I am on the MAI Project Owner Login page
    When I leave the email address field blank
    And I leave the password field blank
    And I click on the "Login" button
    Then I should see an error message "Email and password are required"

  Scenario: Password recovery
    Given I am on the MAI Project Owner Login page
    When I click on the "Forgot Password?" link
    Then I should be redirected to the password recovery page
