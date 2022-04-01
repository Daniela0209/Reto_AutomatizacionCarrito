package com.co.daniela.webproject.test.page.contactus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

    @CacheLookup
    @FindBy(id = "id_contact")
    WebElement contact;

    @CacheLookup
    @FindBy(id = "email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "id_order")
    WebElement order;

    @CacheLookup
    @FindBy(id = "message")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
    WebElement buttonSend;

    public ContactUsPage (WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public WebElement getContact() {
        return contact;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getOrder() {
        return order;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getButtonSend() {
        return buttonSend;
    }
}
