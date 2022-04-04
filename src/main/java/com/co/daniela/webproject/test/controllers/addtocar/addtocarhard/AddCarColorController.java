package com.co.daniela.webproject.test.controllers.addtocar.addtocarhard;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.page.addtocar.addcarcolor.AddCarColorDressesPage;
import com.co.daniela.webproject.test.page.addtocar.addcarcolor.CheckoutColorPage;
import io.cucumber.java.an.E;
import org.apache.poi.ss.formula.functions.T;

import static com.co.daniela.webproject.test.helpers.Dictionary.EVIDENCE;
import static com.co.daniela.webproject.test.helpers.Dictionary.TIME;

public class AddCarColorController {

    private WebAction webAction;

    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public AddCarColorController(WebAction webAction) {
        this.webAction = webAction;
    }

    public AddCarColorController() {
    }

    public void AnadirAlCarroDeCompras(){

        try {
            AddCarColorDressesPage addCarColorDresses = new AddCarColorDressesPage(webAction.getDriver());
            webAction.click(addCarColorDresses.getDresses(),TIME,EVIDENCE);
            addCarColorDresses = new AddCarColorDressesPage(webAction.getDriver());
            webAction.moveTo(addCarColorDresses.getImgDressesColor13(),TIME,EVIDENCE);
            webAction.click(addCarColorDresses.getDressesColor13(),TIME,EVIDENCE);
            webAction.click(addCarColorDresses.getAddToCarButton(),TIME,EVIDENCE);
            addCarColorDresses = new AddCarColorDressesPage(webAction.getDriver());
            webAction.click(addCarColorDresses.getContinueShopping(),TIME,EVIDENCE);

            webAction.click(addCarColorDresses.getDresses(),TIME,EVIDENCE);
            addCarColorDresses = new AddCarColorDressesPage(webAction.getDriver());
            webAction.moveTo(addCarColorDresses.getImgDressesColor16(),TIME,EVIDENCE);
            webAction.click(addCarColorDresses.getDressesColor16(),TIME,EVIDENCE);
            webAction.click(addCarColorDresses.getAddToCarButton(),TIME,EVIDENCE);
             addCarColorDresses = new AddCarColorDressesPage(webAction.getDriver());
             webAction.click(addCarColorDresses.getProceedCheckout(),TIME,EVIDENCE);

            CheckoutColorPage checkoutColorPage = new CheckoutColorPage(webAction.getDriver());
            webAction.click(checkoutColorPage.getCheckoutReadyColor(),TIME,EVIDENCE);
            webAction.click(checkoutColorPage.getRealizedPaymentColor(),TIME,EVIDENCE);
            webAction.moveTo(checkoutColorPage.getTermsAndConditionsColor(),TIME,EVIDENCE);
            webAction.click(checkoutColorPage.getTermsAndConditionsColor(),TIME,EVIDENCE);
            webAction.click(checkoutColorPage.getCheckoutAndShippingColor(),TIME,EVIDENCE);
            webAction.click(checkoutColorPage.getCheckPaymentColor(),TIME, EVIDENCE);
            webAction.click(checkoutColorPage.getMakeAnOrderColor(),TIME,EVIDENCE);


        }catch (WebActionsException e){
            Report.reportFailure("Se dificulto agregar al carrito");

        }
    }

}
