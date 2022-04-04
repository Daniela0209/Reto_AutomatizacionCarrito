package com.co.daniela.webproject.test.controllers.addtocar.addcareasy;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.page.addtocar.addcarrealized.AddToCarPage;
import static com.co.daniela.webproject.test.helpers.Dictionary.EVIDENCE;
import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class AddToCarController {

    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;

    }

    public AddToCarController() {

    }

    public AddToCarController(WebAction webAction) {
        this.webAction = webAction;
    }

    public void AgregarAlCarro(){

        try {
            AddToCarPage addToCarPage = new AddToCarPage(webAction.getDriver());
            webAction.click(addToCarPage.getDresses(),TIME,EVIDENCE);

            webAction.moveTo(addToCarPage.getImageDresses1(),TIME,EVIDENCE);
            webAction.click(addToCarPage.getAddDresses1(),TIME,EVIDENCE);
            webAction.click(addToCarPage.getContinueShopping(),TIME,EVIDENCE);


            webAction.moveTo(addToCarPage.getImageDresses2(),TIME,EVIDENCE);
            webAction.click(addToCarPage.getAddDresses2(),TIME,EVIDENCE);
            webAction.click(addToCarPage.getContinueShopping(),TIME,EVIDENCE);

            webAction.moveTo(addToCarPage.getImageDresses3(),TIME,EVIDENCE);
            webAction.click(addToCarPage.getAddDresses3(),TIME,EVIDENCE);
            webAction.click(addToCarPage.getProceedToCheckout(),TIME,EVIDENCE);


        }catch (WebActionsException e){

            Report.reportFailure("Se dificulto abrir la de agregar al carrito");

        }
    }
}
