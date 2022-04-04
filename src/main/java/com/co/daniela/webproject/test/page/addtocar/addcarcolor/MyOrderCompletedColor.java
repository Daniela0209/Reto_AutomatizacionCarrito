package com.co.daniela.webproject.test.page.addtocar.addcarcolor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrderCompletedColor {

    @CacheLookup
    @FindBy(xpath = "//*[@id=\'center_column\']/p[1]")
    WebElement completaOrderColor;

    public WebElement getCompletaOrderColor() {
        return completaOrderColor;
    }

    public MyOrderCompletedColor(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
