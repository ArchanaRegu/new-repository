package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.DataStructPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.*;

public class DataStructureStepDefination {
	public WebDriver driver;
	public TestContextSetup testcontextsetup;
	public DataStructPage datastructpage;
	public DataStructureStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		datastructpage=testcontextsetup.pageobjectmanager.getDataStructPage();
	}
	@Given("Click  GetStated button of {string} pane.")
	public void click_get_stated_button_of_pane(String string) {
		datastructpage.click_DSgetstart(string);
	}
	@When("Data Structures-Introduction page is displayed with Topics covered.User clicks TimeComplexity link.")
	public void data_structures_introduction_page_is_displayed_with_topics_covered() {
	Assert.assertTrue(datastructpage.topic_displayed());
	datastructpage.click_timecomplex();
	}
	@Then("Enter valid code in editorpage")
	public void Enter_valid() {
	datastructpage.enter_valideditor();	
	}
	@Then("Enter Invalid code in editorpage")
     public void Enter_Invalid() {
		datastructpage.enter_Invalideditor();
			
		}
	@And("Click Run button and capture the output")
	public void Run_capture() {
		System.out.println(datastructpage.Output());
	}
	@Given("Enter some thing")
	public void dope() {
		System.out.println("I have to do");
	}
	@When("Do something")
	public void doped() {
		System.out.println("I have to dope");
	}
	}
