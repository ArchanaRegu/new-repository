package StepDefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class SigninpageStepDefination {
	WebDriver driver;
	TestContextSetup testcontextsetup;
	landingpageobjects landingpage;
	Signinpageobjects signinpage;
	public SigninpageStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
		
	}
	@Given("Click Signin link")
	public void click_signin_link() {
	signinpage.click_signin_link();	
	}

	@When("Enter valid {string} and {string}, click login.")
	public void enter_valid_nirvana_and_archanachaya_click_login(String username,String password) {
		signinpage.enter_username(username, password);
		System.out.println("Enter username:"+username);
	}
	@Then("Click login button.")
	public void click_loginbtn(){
		signinpage.click_login_btn();
		Assert.assertTrue(signinpage.logged_in().isDisplayed());
		
	}

	

}
