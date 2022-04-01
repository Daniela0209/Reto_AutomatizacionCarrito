package com.co.daniela.webproject.test.stepdefinition.login;

import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import com.co.daniela.webproject.test.controllers.loginuser.CreateAnAccountWebController;
import com.co.daniela.webproject.test.controllers.loginuser.LoginPageController;
import com.co.daniela.webproject.test.controllers.loginuser.MyAccountWebController;
import com.co.daniela.webproject.test.data.objects.TestInfo;
import co.com.sofka.test.actions.WebAction;
import com.co.daniela.webproject.test.controllers.openWebPage.StartBrowserWebController;
import com.co.daniela.webproject.test.model.Customer;
import com.co.daniela.webproject.test.stepdefinition.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.co.daniela.webproject.test.helpers.Dictionary.SPACE_STRING;

public class CrearNuevaCuentaStepDefinition extends Setup {

    private WebAction webAction;
    private Customer customer;


    @Before
    public void setup(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

    @Dado("que el cliente esta en la pagina de inicio")
    public void que_el_cliente_esta_en_la_pagina_de_inicio() {

        StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
        startBrowserWebController.setWebAction(webAction);
        startBrowserWebController.setBrowser(browser());
        startBrowserWebController.setFeature(testInfo.getFeatureName());
        startBrowserWebController.abrirTiendaOnline();

    }
    @Cuando("el cliente registra sus datos para una cuenta en linea de forma exitosa")
    public void el_cliente_registra_sus_datos_para_una_cuenta_en_linea_de_forma_exitosa() {

        LoginPageController loginPageController = new LoginPageController();
        loginPageController.setWebAction(webAction);
        loginPageController.irHaciaLoginPage();

        CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
        createAnAccountWebController.setWebAction(webAction);
        createAnAccountWebController.crearUnaCuenta();
        customer = createAnAccountWebController.getCustomer();
    }
    @Entonces("como resultado el usuario quedara logueado dentro de su respectiva sesion per se.")
    public void como_resultado_el_usuario_quedara_logueado_dentro_de_su_respectiva_sesion_per_se() {

        MyAccountWebController myAccountWebController = new MyAccountWebController();
        myAccountWebController.setWebAction(webAction);

        String userName = myAccountWebController.obtenerNombreDeNuevoUsuario();

            Assert
                .Hard
                .thatString(userName)
                .isEqualTo(customer.getFirstName()+ SPACE_STRING + customer.getLastName());

    }
    @After
    public void cerrarDriver() throws InterruptedException
    {
        //solo para emergencias
        //Thread.sleep(2000);
        if(webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();

        Report.reportInfo("*****HA FINALIZADO LA PRUEBA******"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }

}
