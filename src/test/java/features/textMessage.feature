Feature: Message sending functionality testing

  Scenario: Verify that the user can send a message to the specific user successfully
    Given Start chat button is displayed
    When Click on the Start Chat button
    And Click on the Contact name button
    And Send the message "Hello, how are you? are you available for now" to the specific user
    And Click on the Send button



