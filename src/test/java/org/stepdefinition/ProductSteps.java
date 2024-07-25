package org.stepdefinition;

import java.util.List;

import org.flipkart.ProductPage;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps extends BaseClass {
	
	ProductPage p;
	
	@When("The user should enter the product name and click search button")
	public void the_user_should_enter_the_product_name_and_click_search_button() {
		p=new ProductPage();
		sendkeys(p.getSearchBox(), "laptop");
		click(p.getClickSearchBox());
	}

	@When("User should verify the relevent products came in the search page")
	public void user_should_verify_the_relevent_products_came_in_the_search_page() {
	    List<WebElement> productName = p.getProductName();
	    for(int i=0;i<productName.size();i++) {
	    	WebElement oneProduct = productName.get(i);
	    	String text = oneProduct.getText();
	    	System.out.println(text);
	    }
	   	
	}
	
	@Then("User click the first product of showed in page and enter the pincode")
	public void user_click_the_first_product_of_showed_in_page_and_enter_the_pincode() {
	    
		
	}

	@Then("User click the add to cart button and moved in to the place order page and click it")
	public void user_click_the_add_to_cart_button_and_moved_in_to_the_place_order_page_and_click_it() {
	   
		
	}

	@Then("User enter the delivery address and click save and deliver here button")
	public void user_enter_the_delivery_address_and_click_save_and_deliver_here_button() {
	    
		
	}

	@Then("User enter email address for order confirmation and click continue button")
	public void user_enter_email_address_for_order_confirmation_and_click_continue_button() {
	    
		
	}

	@Then("User choose to enter the payment details and click place order button")
	public void user_choose_to_enter_the_payment_details_and_click_place_order_button() {
	    
		
	}

	@Then("User logout the flipkart application and verify it")
	public void user_logout_the_flipkart_application_and_verify_it() {
	    
		
	}

}
