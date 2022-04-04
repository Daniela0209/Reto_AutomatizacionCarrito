package com.co.daniela.webproject.test.stepdefinition.contactus;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import com.co.daniela.webproject.test.controllers.contactususer.ContactUsControllerB;
import com.co.daniela.webproject.test.controllers.contactususer.ContactUsReferenceController;
import com.co.daniela.webproject.test.controllers.contactususer.LandingContactUsController;
import com.co.daniela.webproject.test.controllers.contactususer.MyContactUsCrontoller;
import com.co.daniela.webproject.test.data.objects.TestInfo;
import com.co.daniela.webproject.test.helpers.Helper;
import com.co.daniela.webproject.test.model.Customer;
import com.co.daniela.webproject.test.page.login.LandingPage;
import com.co.daniela.webproject.test.stepdefinition.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.co.daniela.webproject.test.helpers.Dictionary.*;


public class ContactUsStepDefinition extends Setup {

    private WebAction webAction;
    private Customer customer;
    private LandingPage landingPage;

    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }


    @Given("que el cliente se encuentra en la plataforma en la parte de inicio")
    public void que_el_cliente_se_encuentra_en_la_plataforma_en_la_parte_de_inicio() {

        LandingContactUsController landingContactUsController = new LandingContactUsController();
        landingContactUsController.setWebAction(webAction);
        landingContactUsController.setBrowser(browser());
        landingContactUsController.setFeature(testInfo.getFeatureName());
        landingContactUsController.irHaciaContactUs();


    }
    @When("El cliente accede a la parte de contacto donde coloca su email, destinatario y el respectivo mensaje")
    public void el_cliente_accede_a_la_parte_de_contacto_donde_coloca_su_email_destinatario_y_el_respectivo_mensaje() {

         ContactUsControllerB contactUsControllerB = new ContactUsControllerB();
         contactUsControllerB.setEmail(Helper.generateCustomer(SPANISH_CODE_LANGUAGE,COUNTRY_CODE,EMAIL_DOMAIN).getEmail());
         contactUsControllerB.setMessage(MESSAGE_USER);
         contactUsControllerB.setWebAction(webAction);
         contactUsControllerB.crearMensajeSoport();
    }
    @Then("el cliente recibe un mensaje exitoso de que se envio correctamente")
    public void el_cliente_recibe_un_mensaje_exitoso_de_que_se_envio_correctamente() {

        String menssageGood;
        MyContactUsCrontoller myContactUsCrontoller = new MyContactUsCrontoller();
        myContactUsCrontoller.setWebAction(webAction);

       menssageGood = myContactUsCrontoller.messageVeryGood();

        Assert.Hard.thatString(MESSAGE_VIEW)
                .isEqualTo(menssageGood);
    }



    @After
    public void cerrarDriver()throws InterruptedException{
        //solo para emergencias
        //Thread.sleep(2000);
        if(webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();

        Report.reportInfo("*****HA FINALIZADO LA PRUEBA******"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }


    @Given("que el cliente ingresa a la pagina en la parte de inicio")
    public void que_el_cliente_ingresa_a_la_pagina_en_la_parte_de_inicio() {

        LandingContactUsController landingContactUsController = new LandingContactUsController();
        landingContactUsController.setWebAction(webAction);
        landingContactUsController.setBrowser(browser());
        landingContactUsController.setFeature(testInfo.getFeatureName());
        landingContactUsController.irHaciaContactUs();

    }
    @When("el cliente ingresa a contacto donde coloca el destinatario, email, reference y el mensaje")
    public void el_cliente_ingresa_a_contacto_donde_coloca_el_destinatario_email_reference_y_el_mensaje() {

        ContactUsReferenceController contactUsReferenceController = new ContactUsReferenceController();
        contactUsReferenceController.setWebAction(webAction);
        contactUsReferenceController.setEmail(Helper.generateCustomer(SPANISH_CODE_LANGUAGE,COUNTRY_CODE,EMAIL_DOMAIN).getEmail());
        contactUsReferenceController.setReference(REFERENCE);
        contactUsReferenceController.setMessage(MESSAGE_USER);

        contactUsReferenceController.crearMensajeSoport();
    }
    @Then("el cliente recibe un mensaje de que fue enviado correctamente")
    public void el_cliente_recibe_un_mensaje_de_que_fue_enviado_correctamente() {

        String menssageGood;
        MyContactUsCrontoller myContactUsCrontoller = new MyContactUsCrontoller();
        myContactUsCrontoller.setWebAction(webAction);

        menssageGood = myContactUsCrontoller.messageVeryGood();

        Assert.Hard.thatString(MESSAGE_VIEW)
                .isEqualTo(menssageGood);

    }


}
