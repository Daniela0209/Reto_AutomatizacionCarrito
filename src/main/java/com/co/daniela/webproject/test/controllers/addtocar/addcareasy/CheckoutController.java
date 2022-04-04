package com.co.daniela.webproject.test.controllers.addtocar.addcareasy;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.page.addtocar.addcarrealized.CheckoutRealizedPage;
import org.openqa.selenium.WebElement;

import static com.co.daniela.webproject.test.helpers.Dictionary.EVIDENCE;
import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class CheckoutController {

    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public CheckoutController() {

    }

    public CheckoutController(WebAction webAction) {
        this.webAction = webAction;
    }

    public void realizarLaCompra(){

        try {
            CheckoutRealizedPage checkoutRealizedPage = new CheckoutRealizedPage(webAction.getDriver());
            webAction.click(checkoutRealizedPage.getCheckoutReady(),TIME,EVIDENCE);
            webAction.click(checkoutRealizedPage.getRealizedPayment(),TIME,EVIDENCE);

            WebElement test = checkoutRealizedPage.getTermsAndConditions();
            webAction.moveTo(test,TIME,EVIDENCE);
            webAction.click(test,TIME,EVIDENCE);
            webAction.click(checkoutRealizedPage.getCheckoutAndShipping(), TIME,EVIDENCE);
            webAction.click(checkoutRealizedPage.getCheckPayment(),TIME,EVIDENCE);
            webAction.click(checkoutRealizedPage.getMakeAnOrder(),TIME,EVIDENCE);
        }catch (WebActionsException e){
            Report.reportFailure("Hubo un fallo al abrir la pagina de confirmar la compra");

        }
    }
}
