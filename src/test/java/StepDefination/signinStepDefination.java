package StepDefination;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class signinStepDefination {
	TestContextSetup testcontextsetup;
	Signinpageobjects signinpage;
	landingpageobjects landingpage;
	public signinStepDefination(TestContextSetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
	this.signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
	this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	
	}
	
   @Given("User clicks Sign in link.")
	public void click_sign() {
	
	signinpage.click_signin_link();
	
}
	@When("User enters Username and password and clicks login button.")
	public void enter_username_password_click_btn() throws IOException {
		String username=testcontextsetup.exceldata.getExceldata(1, 0);
		String password=testcontextsetup.exceldata.getExceldata(1, 1);
		signinpage.enter_username(username, password);
		signinpage.click_login_btn();
	}
	@Then("User enters home page.")
	public void get_title_home_page() {
		landingpage.get_Title();
	}
}
