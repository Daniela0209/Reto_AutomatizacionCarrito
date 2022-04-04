package com.co.daniela.webproject.test.controllers.addtocar.addcareasy;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.page.addtocar.addcarrealized.MyCompletOrderPage;

import static com.co.daniela.webproject.test.helpers.Dictionary.EVIDENCE;
import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class CompletOrderController {

    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public CompletOrderController(WebAction webAction) {
        this.webAction = webAction;
    }

    public CompletOrderController() {
    }

    public String CompletOrder(){

        String messageGood = "";

        try {
            MyCompletOrderPage completOrderPage = new MyCompletOrderPage(webAction.getDriver());
            messageGood = webAction.getText(completOrderPage.getCompletaOrder(),TIME,EVIDENCE);

        }catch (WebActionsException e){

            Report.reportFailure("Ocurrio un error al abrir la ventana de resultado exitoso");

        }
        return messageGood;
    }

}
