package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pageobjects.PageObjectManger;
import StepDefination.Testngannotations;

public class TestContextSetup {
public WebDriver driver;
public PageObjectManger pageobjectmanager;
public TestBase testbase;
public ExcelDataRetriver exceldata;
public Testngannotations testngannotations;
public TestContextSetup() throws IOException {
	testbase=new TestBase();
	pageobjectmanager=new PageObjectManger(testbase.WebDriverManager());
	exceldata=new ExcelDataRetriver();
	testngannotations=new Testngannotations();
	
}
}
