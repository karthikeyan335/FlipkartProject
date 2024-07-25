Feature: To valid the search functionality of flipkart application
	
	Background:
		Given The user should be in flipkart homepage
	  @productsearch
		Scenario: To valid the search a product functionality with valid credentials
	   	When The user should enter the product name and click search button
	   	And User should verify the relevent products came in the search page
	   	Then User click the first product of showed in page and enter the pincode
	   	And User click the add to cart button and moved in to the place order page and click it
	   	Then User enter the delivery address and click save and deliver here button
	   	And User enter email address for order confirmation and click continue button
	   	Then User choose to enter the payment details and click place order button
	   	And User logout the flipkart application and verify it
