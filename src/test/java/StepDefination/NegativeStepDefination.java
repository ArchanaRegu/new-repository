package StepDefination;

import java.io.IOException;

import org.testng.Assert;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
import Utils.ExcelDataRetriver;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class NegativeStepDefination {
	TestContextSetup testcontextsetup;
	Signinpageobjects signinpage;
	landingpageobjects landpage;
	public ExcelDataRetriver exceldata;
	public NegativeStepDefination(TestContextSetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;	
	signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
	landpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	}
	@When("User enters invalid Username and password and clicks login button")
	public void user_enters_invalid_username_and_password_and_clicks_login_button() throws IOException {
		String username=testcontextsetup.exceldata.getExceldata(2, 0);
		String password=testcontextsetup.exceldata.getExceldata(2, 1);
		signinpage.enter_username(username, password);
		signinpage.click_login_btn();
	}
	@Then("Compare expected Title and actual Tiles.")
	public void compare() {
		String expect_title="NumpyNinja";
		String actual_title=landpage.get_Title();
		//if login is successful then it is failed scenario
		if(expect_title.equals(actual_title)) {
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
		}
		
	}


	@When("User enters invalid Username and invalid password and clicks login button")
	public void user_enters_invalid_username_and_invalid_password_and_clicks_login_button() throws IOException {
		String username=testcontextsetup.exceldata.getExceldata(4, 0);
		String password=testcontextsetup.exceldata.getExceldata(4, 1);
		signinpage.enter_username(username, password);
		signinpage.click_login_btn();
		
		
	}

	@When("User enters Username and invalid password and clicks login button")
	public void user_enters_username_and_invalid_password_and_clicks_login_button() throws IOException {
		String username=testcontextsetup.exceldata.getExceldata(3, 0);
		String password=testcontextsetup.exceldata.getExceldata(3, 1);
		signinpage.enter_username(username, password);
		signinpage.click_login_btn();
		
	}
	

}
