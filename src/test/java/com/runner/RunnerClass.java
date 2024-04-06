package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "featureFiles",
        glue = {"com.stepDefinitions","com.hooks"},
        dryRun = true,
        monochrome = true,
        plugin = {"html:report/webReport.html",
                  "json:report/jsonReport.json",
                  "junit:report/xmlReport.xml"},
//        tags = "not @Positive"// used to exclude the tag
//        tags = ("@DataDriven or @SimpleSearch")
       tags = "@BackgroundExample"
)
public class RunnerClass {


}
