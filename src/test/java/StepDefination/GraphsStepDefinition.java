package StepDefination;

import java.util.List;

import org.testng.Assert;

import Pageobjects.GraphsPageObjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphsStepDefinition {

	TestContextSetup textContextSetup;
	GraphsPageObjects graphsPageObjects;

	public GraphsStepDefinition(TestContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
		graphsPageObjects = textContextSetup.pageobjectmanager.getGraphsPageObjects();

	}

	@When("User Clicks GetStated button of Graphs pane.")
	public void user_clicks_get_stated_button_of_graphs_pane() {
		graphsPageObjects.click_graphsGetStarted();
		graphsPageObjects.equals(graphsPageObjects);

	}

	@Then("Graphs page is displayed with Topics covered.")
	public void graphs_page_is_displayed_with_topics_covered(DataTable dataTable) {
		List<String> Expected_list = dataTable.asList();
		System.out.println("expected list: " + Expected_list);
		System.out.println("actaual list:" + graphsPageObjects.graph_topicsDisplayed());
		Assert.assertEquals(graphsPageObjects.graph_topicsDisplayed(), Expected_list);

	}

}