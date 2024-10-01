package StepDefination;

import java.util.List;

import org.testng.Assert;

import Pageobjects.GraphsPageObjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class GraphsStepDefinition {

	TestContextSetup textContextSetup;
	GraphsPageObjects graphsPageObjects;

	public GraphsStepDefinition(TestContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
		graphsPageObjects = textContextSetup.pageobjectmanager.getGraphsPageObjects();

	}
	@Then("User navigates to Homepage and Clicks GetStated button of Graphs pane.")
	public void user_clicks_get_stated_button_of_graphs_pane() {
		graphsPageObjects.get_Title();
		graphsPageObjects.click_graphsGetStarted();
		

	}
	@Given("User is in Graphs Page.")
	public void Graphpage() {
	graphsPageObjects.get_Title();
	
	}
    @When("User scrols to TopicsCovered.")
    public void scrol_to_topic() {
    	graphsPageObjects.scroll_topicscovered();
    }

	@Then("Graphs page is displayed with Topics covered.")
	public void graphs_page_is_displayed_with_topics_covered(DataTable dataTable) {
		List<String> Expected_list = dataTable.asList();
		System.out.println("expected list: " + Expected_list);
		System.out.println("actaual list:" + graphsPageObjects.graph_topicsDisplayed());
		Assert.assertEquals(graphsPageObjects.graph_topicsDisplayed(), Expected_list);

	}

}