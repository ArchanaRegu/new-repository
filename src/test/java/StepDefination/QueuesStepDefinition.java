package StepDefination;

import java.util.List;

import org.testng.Assert;

import Pageobjects.QueuesPageObjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuesStepDefinition {

	TestContextSetup textContextSetup;
	QueuesPageObjects queuesPageObjects;

	public QueuesStepDefinition(TestContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
		queuesPageObjects = textContextSetup.pageobjectmanager.getQueuesPageObject();

	} 
	@Then("User navigates to Homepage and Clicks GetStated button of Queue pane.")
	public void user_clicks_get_stated_button_of_queues_pane() {
		queuesPageObjects.click_queuesGetStarted();
		Assert.assertTrue(queuesPageObjects.displayHeading());
	}
	@Given("User is in Queue Page.")
	public void Quesuepage() {
		queuesPageObjects.get_Title();
	}

	@Then("Queues page is displayed with Topics covered.")
	public void queues_page_is_displayed_with_topics_covered(DataTable queues_topics) {
		List<String> Expected_list = queues_topics.asList();
		System.out.println("expected list: " + Expected_list);
		System.out.println("actaual list:" + queuesPageObjects.topicsDisplayed());
		Assert.assertEquals(queuesPageObjects.topicsDisplayed(), Expected_list);
		//System.out.println(queuesPageObjects.topicsDisplayed());

	}
	

	@Given("User click {string}")
	public void user_click(String string) {
		
		queuesPageObjects.user_clicks(string);
	}

	

}
