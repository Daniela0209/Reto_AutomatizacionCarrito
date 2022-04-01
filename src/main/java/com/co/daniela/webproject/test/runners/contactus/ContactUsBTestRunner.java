package com.co.daniela.webproject.test.runners.contactus;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src\\main\\resources\\features\\contactus",
        glue = "com.co.daniela.webproject.test.stepdefinition.contactus",
        publish = true
)
public class ContactUsBTestRunner {
}
