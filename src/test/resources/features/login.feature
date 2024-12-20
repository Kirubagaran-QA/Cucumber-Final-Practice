Feature: Login Feature ,
  As a User I can login with Valid username and password
  Scenario: Successful Login
    Given I am on the application Browser
    And I Navigate to the application URL
    And I click the login button
    When I enter valid username "9360658995" and password "Kiruba@4545"
    Then I should be logged in successfully
    Then I quit the login browser

