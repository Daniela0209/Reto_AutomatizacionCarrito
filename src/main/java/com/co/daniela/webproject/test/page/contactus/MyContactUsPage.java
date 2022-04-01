package com.co.daniela.webproject.test.page.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyContactUsPage {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement messageGood;

    public WebElement getMessageGood() {
        return messageGood;
    }

    public MyContactUsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
