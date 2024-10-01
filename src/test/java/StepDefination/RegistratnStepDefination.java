package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pageobjects.ArraysDocPageObjects;
import Pageobjects.RegistrationPage;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class RegistratnStepDefination {
	TestContextSetup testcontextsetup;
	public RegistrationPage registerpage;
	public RegistratnStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.registerpage=testcontextsetup.pageobjectmanager.getRegistrationPage();
	} 
	@Given("Click Registration Link and User is in Registration page.")
	public void click_registration_link_and_user_is_in_registration_page() {
		registerpage.click_Register();
	}

	@When("User enter credentials and Click Register or Clicks login link")
	public void user_enter_credentials() throws IOException {
		String Username=testcontextsetup.exceldata.getExceldata(1, 0);
		String password=testcontextsetup.exceldata.getExceldata(1, 1);
		registerpage.enter_username(Username);
		registerpage.enter_password(password);
		registerpage.enter_confirmpassword(password);
		registerpage.click_register_button();
	}

	@Then("User is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		registerpage.get_title();
	}
}
