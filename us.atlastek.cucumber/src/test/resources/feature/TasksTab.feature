Feature: Add Task
 
 @Test    
Scenario: Login to actiTIME with valid data

      Given User should be able to navigate to Actitime URL
      When  User enters valid user
      When  User enters valid password
      Then  User clicks login button
      And   User see the home page for Actitime system
      Then  User should click on “Tasks” tab
      Then  User must click on “+ Add Task” button
      Then  User enter Actitime System Testing on the “Enter Task Name” field
      Then  User click on “+ Add Task” button
      And   User should see the newly added task on the “Fight operations” page