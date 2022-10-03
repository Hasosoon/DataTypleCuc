package com.demoblazeTogetherShared.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {
        "json:target/cucumber.json",
        "html:target/default-html-reports",
        "rerun:target/rerun.txt"
},
        features = {


        }

)
public class cukesRunner {

}
