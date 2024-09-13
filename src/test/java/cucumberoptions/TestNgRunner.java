package cucumberoptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources",glue="StepDefination",monochrome=true,
tags= "@SmokeTest or @Monkey or @TreesTest or @GraphsTest or  @LinkedTest or @StackTest or @QueuesTest or @negative",plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNgRunner extends AbstractTestNGCucumberTests {
@Override
@DataProvider(parallel=true)
public Object[][] scenarios(){
	return super.scenarios();
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("Before Suite");
}

@AfterSuite
public void afterSuite() {
	System.out.println("After Suite");
}
}
