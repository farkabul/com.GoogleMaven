package com.GoogleStepDifinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

import come.GooglePOs.PageObjects;
import come.GooglePOs.initializeBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDif extends initializeBrowser{
	
	PageObjects pageObjectsClass;
	
	@Given("^I open the ie browser$")
	public void i_open_the_ie_browser() {
		initialize();
	}

	@When("^I go to the Google site$")
	public void i_go_to_the_Google_site() throws Exception {
		navigateToSite();
	}

	@When("^I see site Google page tile$")
	public void i_see_site_Google_page_tile() {
	System.out.println(driver.getTitle());
//	assertEquals(driver.getTitle(), "Google");
//	assertEquals(driver.getTitle(), "Google");
	
	String expected = driver.getTitle();
	String actual = "Google";
	assertEquals(expected, actual);
	}

	@When("^I search for selenium automation testing jobs$")
	public void i_search_for_selenium_automation_testing_jobs() throws Exception {
	pageObjectsClass=new PageObjects();
	
		pageObjectsClass.searchtextBox();
		Thread.sleep(3000);
	}
	

	@Then("^I click Google Search and choose$")
	public void i_click_Google_Search_and_choose() throws Exception {
		pageObjectsClass=new PageObjects();

		pageObjectsClass.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[2]/div[4]/div/div/div[2]/div/a[1]")).click();

		
	}
}
