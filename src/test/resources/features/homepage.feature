Feature: HomePage Feature
  As a user , I should see the HomePage by default
  Scenario: Verify user Successfully directed to HomePage
    Given I add the ExtentReport
    And I launch the Browser for HomePage Test
    When I Navigate to the homepage URL
    Then I should see the Homepage Of Application
    Then I flush the report
    Then I quit the browser
