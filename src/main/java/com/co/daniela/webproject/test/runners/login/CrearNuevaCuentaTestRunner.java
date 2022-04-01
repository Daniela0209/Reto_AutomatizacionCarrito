package com.co.daniela.webproject.test.runners.login;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets=CucumberOptions.SnippetType.CAMELCASE,
        features="src/main/resources/features/login",
        glue="com.co.daniela.webproject.test.stepdefinition.login",
        tags = "",
        publish = true
)
public class CrearNuevaCuentaTestRunner {
}
