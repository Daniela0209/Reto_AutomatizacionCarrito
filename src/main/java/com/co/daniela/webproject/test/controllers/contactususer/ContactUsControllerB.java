package com.co.daniela.webproject.test.controllers.contactususer;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import com.co.daniela.webproject.test.helpers.Helper;
import com.co.daniela.webproject.test.model.Customer;
import com.co.daniela.webproject.test.page.contactus.ContactUsPage;

import static com.co.daniela.webproject.test.helpers.Dictionary.*;

public class ContactUsControllerB {

    private String message;
    private String email;
    private WebAction webAction;
    private Customer customer;

    public void setCustomer(Customer customer) {this.customer = customer;}
    public void setMessage(String message) {this.message = message;}
    public void setEmail(String email) {
        this.email = email;
    }



    public void setWebAction(WebAction webAction) {
        this.webAction = webAction;
    }

    public Customer crearMensajeSoport(){
        try {
            customer = Helper.generateCustomer(SPANISH_CODE_LANGUAGE, COUNTRY_CODE, EMAIL_DOMAIN);

            ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());
            webAction.selectByPartialText(contactUsPage.getContact(),"Webmaster",TIME,EVIDENCE);
            webAction.click(contactUsPage.getEmail(), EVIDENCE);
            webAction.sendText(contactUsPage.getEmail(),email,EVIDENCE);
            webAction.click(contactUsPage.getMessage(), EVIDENCE);
            webAction.sendText(contactUsPage.getMessage(),message,EVIDENCE);
            webAction.click(contactUsPage.getButtonSend(),EVIDENCE);
        }catch (WebActionsException e){
            Report.reportFailure("sE REFLEJO UN ERROR AL INTENTAR ACCEDER A LA PAGINA CONTACTO");
        }
        return customer;
    }
}
