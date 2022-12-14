Feature: List of Users, on Users tab

@Test
Scenario: Navigating to Actitime with valid data

Given User should be able to login to Actitime URL.
When User should enter valid user
When User should enter valid password
When User click on login button
When User click on Users tab
When User click on “PTO Settings” PTO details should be displayed.
When User click on “Sick Days Settings” sick days details should be displayed.
When User click on “Work Assignments” the “My Team (All Users)” details should be displayed.