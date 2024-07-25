Feature: To valid the login functionality of flipkart application
	
	Background:
		Given The user should be in flipkart homepage
		@login
		Scenario: To valid the login functionality with valid credentials
	   	When The user should click the login button
	   	And User should enter the valid phone number or email and click request OTP button
	   	Then The user should wait for one minutes to enter otp and automatically enter to home page
	   	And The user should verify the username in home page
	   	
