package StepDefination;

import java.util.List;

import org.testng.Assert;

import Pageobjects.StackPageobjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class StackStepDefination {
	TestContextSetup testcontestsetup;
	StackPageobjects stackpageobjects;
public StackStepDefination(TestContextSetup testcontestsetup) {
	this.testcontestsetup=testcontestsetup;
	this.stackpageobjects=testcontestsetup.pageobjectmanager.getStackpageobjects();
	
}
@Given("User is in Home page.User clicks Get Started button of {string} pane .")
public void user_is_in_home_page_user_clicks_get_started_button_of_pane(String string) {
stackpageobjects.click_stack_pane();

Assert.assertTrue(stackpageobjects.display_topic_cover());
}

@Then("User navigated to Stack page and get the Title of that page")
public void user_navigated_to_stack_page_and_get_the_title_of_that_page() {
	System.out.println(stackpageobjects.get_title());
}

@And("Stack information is displayed with related Links below.")
public void stack_information_is_displayed_with_related_links_below(DataTable dataTable) {
	List<String>Expected_list=dataTable.asList();
	System.out.println(Expected_list);
	Assert.assertEquals(Expected_list, stackpageobjects.alltopics());
}
}
