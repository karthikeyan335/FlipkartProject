package org.stepdefinition;

import org.flipkart.RegistrationPage;
import org.utility.BaseClass;

import io.cucumber.java.en.*;

public class RegistrationSteps extends BaseClass {
	
	RegistrationPage r;
	
	@When("The user should move the login button and click signup button")
	public void the_user_should_move_the_login_button_and_click_signup_button() {
	    r=new RegistrationPage();
	    moveToElement(r.getLoginButton());
	    click(r.getSignUpButton());
	}

	@When("User should enter the valid phone number and click continue button")
	public void user_should_enter_the_valid_phone_number_and_click_continue_button() {
	    sendkeys(r.getMobileNumber(), "7373131628");
	    click(r.getContinueButton());
	}

	@Then("The user should wait for one minutes to enter otp and click signup button")
	public void the_user_should_wait_for_one_minutes_to_enter_otp_and_click_signup_button() throws InterruptedException {
		Thread.sleep(30000);
		click(r.getSignUpAfterOTP());
	}

	@Then("The user should move to account button and click my profile button and enter the user details of it")
	public void the_user_should_move_to_account_button_and_click_my_profile_button_and_enter_the_user_details_of_it() throws InterruptedException {
		moveToElement(r.getAccountButton());
		click(r.getMyProfile());
		click(r.getNameEditReg());
		sendkeys(r.getFirstNameReg(), "karthi");
		sendkeys(r.getLastNameReg(), "keyan");
		click(r.getMale());
		click(r.getNameSave());
		click(r.getEmailEdit());
		sendkeys(r.getEmailReg(), "karthi335@gmail.com");
		click(r.getEmailSave());
		Thread.sleep(30000);
		
	}

}
