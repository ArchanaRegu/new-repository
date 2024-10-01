package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.DataStructPage;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class DataStructureStepDefination {
	public WebDriver driver;
	public TestContextSetup testcontextsetup;
	public DataStructPage datastructpage;
	landingpageobjects landingpage;
	public DataStructureStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.datastructpage=testcontextsetup.pageobjectmanager.getDataStructPage();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	}
	@Given("Click  GetStarted button of Data Structures-Introduction pane.")
	public void click_get_stated_button_of_pane() {
		datastructpage.click_DSgetstart();
	}
	@When("Data Structures-Introduction page is displayed with Topics covered.User clicks TimeComplexity link.")
	public void data_structures_introduction_page_is_displayed_with_topics_covered() {
	Assert.assertTrue(datastructpage.topic_displayed());
	datastructpage.click_timecomplex();
	}
	@Then("User Enters valid code in editorpage")
	public void Enter_valid() throws IOException {
	String validcode=testcontextsetup.exceldata.getExceldata(1, 2);	
	datastructpage.enter_valideditor(validcode);	
	}
	@Then("User Enters Invalid code in editorpage")
     public void Enter_Invalid() throws IOException {
		String Invalidcode=testcontextsetup.exceldata.getExceldata(1, 3);	
		datastructpage.enter_Invalideditor(Invalidcode);
			
		}
	@Then("Click Run button and capture the output")
	public void Run_capture() {
		System.out.println(datastructpage.Output());
	}
	@Then("User navigates to home page.")
	public void navigates_home() {
		System.out.println(landingpage.get_Title());
	}
	
	}
