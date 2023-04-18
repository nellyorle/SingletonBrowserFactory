Feature: Login to account
  Scenario: Succesful Login with valid credentials
    Given I have navigated to the login page
    When I enter a valid username
    And I enter a valid password
    And I click on the submit button
    Then I am directed to logged in page
    And The new page contains expected text
    And The new page has a Log out button

