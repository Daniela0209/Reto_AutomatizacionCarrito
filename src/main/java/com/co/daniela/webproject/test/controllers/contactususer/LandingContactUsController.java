package com.co.daniela.webproject.test.controllers.contactususer;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.automationtools.selenium.Browser;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.helpers.Dictionary;
import com.co.daniela.webproject.test.helpers.Helper;
import com.co.daniela.webproject.test.page.login.LandingPage;

import static com.co.daniela.webproject.test.helpers.Dictionary.EVIDENCE;
import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class LandingContactUsController {

    private WebAction webAction;
    private Browser browser;
    private String feature;

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;

    }

    public void irHaciaContactUs(){

        try {
            webAction.startWebApp(browser, Helper.getProperty(Dictionary.APP_URL_PROPERTY), feature);
            LandingPage landingPage = new LandingPage(webAction.getDriver());
            webAction.click(landingPage.getContactUs(), TIME, EVIDENCE);
        }catch (WebActionsException e){

            Report.reportFailure("Se dificulto abrir la pagina de contacto");

        }
    }
}
