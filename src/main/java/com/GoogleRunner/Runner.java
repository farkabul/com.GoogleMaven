package com.GoogleRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="C:\\Users\\Farhad Ahmadzai\\Documents\\QA Engineering\\eclipse\\Workspace\\com.Google\\src\\main\\java\\com\\GoogleFeature\\file.feature",
				glue= {"com.GoogleStepDifinitions"},
				monochrome=true,
				strict=true,
				dryRun=false)

public class Runner {

	
}
