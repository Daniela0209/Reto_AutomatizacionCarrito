package com.co.daniela.webproject.test.page.addtocar.addcarrealized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCompletOrderPage {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/p[1]")
    WebElement completaOrder;

    public WebElement getCompletaOrder() {
        return completaOrder;
    }

    public MyCompletOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
