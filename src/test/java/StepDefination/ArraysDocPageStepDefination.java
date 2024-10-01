package StepDefination;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.ArraysDocPageObjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class ArraysDocPageStepDefination {
	
	TestContextSetup testcontextsetup;
	ArraysDocPageObjects arraysdocpage;
	landingpageobjects landingpage;
	public ArraysDocPageStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.arraysdocpage=testcontextsetup.pageobjectmanager.getArrayDocPage();
		this.landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	} 
	@Then("User navigated to HomePage and Clicks GetStarted button of ArrayPane")		
	 public void user_clicks_get_stated_button_of_pane() {
		arraysdocpage.click_getstarted();
		Assert.assertTrue(arraysdocpage.topic_display());
	}
	 @Given("User is navigated to Arrays Page.")
	 public void navigate_arrpage() {
		 landingpage.get_Title();
	 }
	 @Then("List of Topic covered in ArrayPage.")
	 public void ArrayTopics(DataTable datatable) {
		 List<String>Expected_list=datatable.asList();
		 Assert.assertEquals(Expected_list,arraysdocpage.List_arraysTopics());
	 }
	 @Then("User navigated to HomePage.")
	 public void user_navigated_to_home_page() {
	     landingpage.get_Title();
	 }
	 
	 @When("Arrays page is displayed with Topic Covered.Scroll to TopicsCovered.")
	public void page_is_displayed_with_topics_covered() {
	   System.out.println("actaual list:"+arraysdocpage.List_arraysTopics());
	}
	@Given("User clicks {string}.")
	public void click_arrays_in_python(String ArraysLinks) {
		System.out.println("Title:"+landingpage.get_Title());
		System.out.println(ArraysLinks+" This link ");
		arraysdocpage.clickPaneListLinks(ArraysLinks);
	}
	@Then("new page is displayed with [Try here>>>] button")
	public void arrays_try_here_button() {
		System.out.println("Title:"+landingpage.get_Title());
		arraysdocpage.click_Tryhere_btn();
	}

}
