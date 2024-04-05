package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles/OpenGoogle.feature", glue = "stepDefinitions")
public class CucumberRunner{


}
