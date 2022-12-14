Feature: Title of your feature
	
@Test
Scenario: Login to actiTIME
Given User should be able to open actiTIME web
When  User enter username
And   User enter password
And   User click on Login button
And   User click on Tasks tab
Then  User click on Reports tab
