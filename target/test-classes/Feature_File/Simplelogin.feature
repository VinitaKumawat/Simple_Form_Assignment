Feature: Simple Form Submission

  Scenario: Submit the Simple Form with valid details
    Given I am on the Simple Form page
    When I enter "John" in the First Name field
    And I enter "doe" in the Last Name field
    And I enter "john.doe@example.com" in the Email field
    And I enter "1234567890" in the Contact Number field
    And I click on the Submit button
    Then I should see a confirmation message
