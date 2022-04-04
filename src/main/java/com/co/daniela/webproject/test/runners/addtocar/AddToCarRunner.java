package com.co.daniela.webproject.test.runners.addtocar;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/main/resources/features/addtocar",
        glue = "com.co.daniela.webproject.test.stepdefinition.addtocart",
        tags = "",
        publish = true
)
public class AddToCarRunner {
}
