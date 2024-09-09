package StepDefination;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pageobjects.Signinpageobjects;
import Pageobjects.landingpageobjects;
import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	public TestContextSetup testcontextsetup;
	public landingpageobjects landingpage;
	public WebDriver driver;
	public Hooks(TestContextSetup testcontextsetup) throws IOException {
		this.testcontextsetup=testcontextsetup;
		driver=testcontextsetup.testbase.WebDriverManager();
		}
	@Before
	public void BeforeScenario() throws IOException {
		System.out.println("This is Before Hook");
		System.out.println(driver.getTitle()+" from hooks");
		
		}
	@After
	public void AfterScenario(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot",new ByteArrayInputStream(screenshot));
		}
		driver.quit();
	}
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}}
	}


