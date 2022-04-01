package com.co.daniela.webproject.test.controllers.loginuser;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.page.login.LandingPage;

import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class LoginPageController {
    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public void irHaciaLoginPage(){
        try{
            LandingPage landingPage = new LandingPage(webAction.getDriver());

            webAction.click(landingPage.getSignIn(), TIME,true);

        } catch (WebActionsException e) {
            Report.reportFailure("Ocurrio un error al intentar abrir la tienda online", e);
        }
    }
}
