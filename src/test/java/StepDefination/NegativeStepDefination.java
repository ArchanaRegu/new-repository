package StepDefination;

import java.io.IOException;

import Pageobjects.Signinpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class NegativeStepDefination {
	TestContextSetup testcontextsetup;
	Signinpageobjects signinpage;
	public NegativeStepDefination(TestContextSetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;	
	signinpage=testcontextsetup.pageobjectmanager.getSigninpageobjects();
	}
	@When("User enters invalid Username and password and clicks login button")
	public void user_enters_invalid_username_and_password_and_clicks_login_button() throws IOException {
		String username=testcontextsetup.exceldata.getExceldata(2, 0);
		String password=testcontextsetup.exceldata.getExceldata(2, 1);
		try {
			signinpage.enter_username(username, password);
			signinpage.click_login_btn();
			
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			testcontextsetup.testbase.driver.switchTo().alert().getText();
		}
		
	}

	@When("User enters invalid Username and invalid password and clicks login button")
	public void user_enters_invalid_username_and_invalid_password_and_clicks_login_button() throws IOException {
		String username=testcontextsetup.exceldata.getExceldata(4, 0);
		String password=testcontextsetup.exceldata.getExceldata(4, 1);
		try {
			signinpage.enter_username(username, password);
			signinpage.click_login_btn();
			
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			testcontextsetup.testbase.driver.switchTo().alert().getText();
			
		}
		
	}

	@When("User enters Username and invalid password and clicks login button")
	public void user_enters_username_and_invalid_password_and_clicks_login_button() throws IOException {
		String username=testcontextsetup.exceldata.getExceldata(3, 0);
		String password=testcontextsetup.exceldata.getExceldata(3, 1);
		try {
			signinpage.enter_username(username, password);
			signinpage.click_login_btn();
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			testcontextsetup.testbase.driver.switchTo().alert().getText();
		}
		
	}

}
