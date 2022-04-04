package com.co.daniela.webproject.test.controllers.addtocar.addcareasy;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.page.addtocar.addcarrealized.MyCompletOrderPage;

import static com.co.daniela.webproject.test.helpers.Dictionary.EVIDENCE;
import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class MyAddToCarController {

    private WebAction webAction;
    private String feature;
    private Browser browser;

    public MyAddToCarController( ) {
    }

    public MyAddToCarController(WebAction webAction) {
        this.webAction = webAction;
    }

    public WebAction getWebAction() {
        return webAction;
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public String messageCar(){
        String message = " ";
        try {
            {
                MyCompletOrderPage myCompletOrderPage = new MyCompletOrderPage(webAction.getDriver());
                message = webAction.getText(myCompletOrderPage.getCompletaOrder(),TIME,EVIDENCE);

            }
        }catch (WebActionsException e){
            Report.reportFailure("No se pudo realizar la compra");

        }
        return message;
    }
}
