package com.cucumber.junit.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "@regression",
        glue = {"com.cucumber.junit.hooks","com.cucumber.junit.steps"},
        features = "src/test/resources/features"
)
public class CucumberTestRunner {
}
