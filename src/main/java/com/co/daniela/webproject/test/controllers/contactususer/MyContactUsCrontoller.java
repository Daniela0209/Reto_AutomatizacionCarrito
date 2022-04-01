package com.co.daniela.webproject.test.controllers.contactususer;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.page.contactus.MyContactUsPage;

import static com.co.daniela.webproject.test.helpers.Dictionary.EVIDENCE;
import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class MyContactUsCrontoller {

    private WebAction webAction;
    private String feature;
    private Browser browser;

    public MyContactUsCrontoller() {

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

    public MyContactUsCrontoller(WebAction webAction) {
        this.webAction = webAction;

    }

    public String messageVeryGood(){
        String message = " ";
        try {
            MyContactUsPage myContactUsPage = new MyContactUsPage(webAction.getDriver());
            message = webAction.getText(myContactUsPage.getMessageGood(),TIME,EVIDENCE);
        }catch (WebActionsException e){
            Report.reportFailure("No llego el mensaje a soporte");
        }
        return message;
    }
}
