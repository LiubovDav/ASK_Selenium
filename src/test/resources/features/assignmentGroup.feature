Feature: Assignment - Group
  Scenario: Assignment - Group
    When I navigate to login page
    And I type email "teacher3@gmail.com"
    And I type password "12345Abc"
    And I click Sign In button.
    And I click "Quizzes" menu item
    And I click Create new quiz button
    And I type quiz title "What is the unit test?"
    And I click Add question button
    And I click on radio-button "Textual"
    And I type text "What is the unit test?" for question 1
    And I click Save button
    And I click "Assignments" menu item
    And I click Create new assignments button
    And I click Group filter "ABC"
    And I select the option in the drop-down list "What is the unit test?"
    And I click the button Select All
    And I click the button Give assignment

