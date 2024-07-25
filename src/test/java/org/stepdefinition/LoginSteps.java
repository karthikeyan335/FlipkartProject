package org.stepdefinition;

import org.flipkart.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utility.BaseClass;

import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass {
	
	LoginPage l;
	
	@Given("The user should be in flipkart homepage")
	public void the_user_should_be_in_flipkart_homepage() {
		chromeBrowser();
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicitWait(50);	
	}

	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() {
	    l=new LoginPage();
		click(l.getLoginButton());
	}

	@When("User should enter the valid phone number or email and click request OTP button")
	public void user_should_enter_the_valid_phone_number_or_email_and_click_request_OTP_button() {
	    sendkeys(l.getMobileNumberorEmail(), "7373131628");
	    click(l.getRequestOtpButton());
	}

	@Then("The user should wait for one minutes to enter otp and automatically enter to home page")
	public void the_user_should_wait_for_one_minutes_to_enter_otp_and_automatically_enter_to_home_page() throws InterruptedException {
		Thread.sleep(30000);
	}

	@Then("The user should verify the username in home page")
	public void the_user_should_verify_the_username_in_home_page() {
	    WebElement userName = l.getUserName();
		String text = userName.getText();
		Assert.assertEquals("Verify Username", text, "Karthi");
	    System.out.println(text);
	    
	}


}
