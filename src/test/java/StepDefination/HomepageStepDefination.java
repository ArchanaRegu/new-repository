package StepDefination;

import java.util.List;

import org.testng.Assert;

import Pageobjects.ArraysDocPageObjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class HomepageStepDefination {
	TestContextSetup testcontextsetup;
	ArraysDocPageObjects arraysdocpage;
	landingpageobjects landingpage;
	public HomepageStepDefination(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		landingpage=testcontextsetup.pageobjectmanager.getLandingpageobjects();
	} 
	@Then("User navigates to Homepage and verify dropdown list.")
	public void user_navigates_to_homepage_and_verify_dropdown_list(DataTable dataTable) {
		 List<String>Expected_list=dataTable.asList();
		 System.out.println("ActualList:"+landingpage.dropdownmenu());
	}
}
