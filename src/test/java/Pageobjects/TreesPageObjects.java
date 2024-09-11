package Pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TreesPageObjects {

	private By btnGetStarted = By.xpath("//a[@href =\"tree\" and text() = \"Get Started\"]");
	private By heading = By.xpath("//h4[text() = \"Tree\"]");
	private By topicsCovered = By.xpath("//p[text() = \"Topics Covered\"]");
	private By treesTopics = By.cssSelector(".list-group-item");
	WebDriver driver;
	
	public TreesPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_TreesgetButton() {
		driver.findElement(btnGetStarted).click();
		System.out.println("Title of new page " + driver.getTitle());

	}

	public boolean displayHeading() {
		WebElement linkedHeading = driver.findElement(heading);
		return linkedHeading.isDisplayed();
	}

	public List<String> topics_displayed() {
		List<String> TreesListNames = new ArrayList<>();
		List<WebElement> list_Topics = driver.findElements(treesTopics);
		for (WebElement List_name : list_Topics) {
			String arrayName = List_name.getText();
			TreesListNames.add(arrayName);
		}
		return TreesListNames;

	}

	public void user_clicks(String string) {
		driver.findElement(By.linkText(string)).click();
	}
}