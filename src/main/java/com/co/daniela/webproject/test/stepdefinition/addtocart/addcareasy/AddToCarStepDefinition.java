package com.co.daniela.webproject.test.stepdefinition.addtocart.addcareasy;

import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import com.co.daniela.webproject.test.controllers.addtocar.addcareasy.AddToCarController;
import com.co.daniela.webproject.test.controllers.addtocar.addcareasy.CheckoutController;
import com.co.daniela.webproject.test.controllers.addtocar.addcareasy.MyAddToCarController;
import com.co.daniela.webproject.test.controllers.addtocar.addtocarhard.AddCarColorController;
import com.co.daniela.webproject.test.controllers.loginuser.CreateAnAccountWebController;
import com.co.daniela.webproject.test.controllers.loginuser.LoginPageController;
import com.co.daniela.webproject.test.controllers.openWebPage.StartBrowserWebController;
import com.co.daniela.webproject.test.data.objects.TestInfo;
import com.co.daniela.webproject.test.model.Customer;
import com.co.daniela.webproject.test.stepdefinition.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.co.daniela.webproject.test.helpers.Dictionary.MESSAGE_ADDCAR_COMPLETE;

public class AddToCarStepDefinition extends Setup {

    private WebAction webAction;
    private Customer customer;

    @Before
    public void setuo(Scenario scenario){
        testInfo = new TestInfo(scenario);
        webAction = new WebAction(testInfo.getFeatureName());
        webAction.setScenario(testInfo.getScenarioName());
    }

    @Given("que el usuario esta registrado y esta navegando en la plataforma")
    public void que_el_usuario_esta_registrado_y_esta_navegando_en_la_plataforma() {

      StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
      startBrowserWebController.setWebAction(webAction);
      startBrowserWebController.setBrowser(browser());
      startBrowserWebController.setFeature(testInfo.getFeatureName());
      startBrowserWebController.abrirTiendaOnline();

      LoginPageController loginPageController = new LoginPageController();
      loginPageController.setWebAction(webAction);
      loginPageController.irHaciaLoginPage();

      CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
      createAnAccountWebController.setWebAction(webAction);
      createAnAccountWebController.crearUnaCuenta();


    }
    @When("el usuario escoge algunos productos y hace el respectivos checkout")
    public void el_usuario_escoge_algunos_productos_y_hace_el_respectivos_checkout() {

        AddToCarController addToCarController = new AddToCarController(webAction);
        addToCarController.AgregarAlCarro();

        CheckoutController checkoutController = new CheckoutController(webAction);
        checkoutController.realizarLaCompra();
    }
    @Then("el cliente agrego correctamente y se hizo el respectivo checkout")
    public void el_cliente_agrego_correctamente_y_se_hizo_el_respectivo_checkout() {

        String mensajeCompletado;

        MyAddToCarController myAddToCarController = new MyAddToCarController(webAction);
        mensajeCompletado = myAddToCarController.messageCar();
        Assert.Hard.thatString(mensajeCompletado).isEqualTo(MESSAGE_ADDCAR_COMPLETE);


    }

    @When("el usuario escoge productos por color y hace el respectivo pago")
    public void el_usuario_escoge_productos_por_color_y_hace_el_respectivo_pago() {

        AddCarColorController addCarColorController = new AddCarColorController(webAction);
        addCarColorController.setWebAction(webAction);
        addCarColorController.AnadirAlCarroDeCompras();

        CheckoutController checkoutController = new CheckoutController(webAction);
        checkoutController.realizarLaCompra();

    }
    @Then("el usuario agrego correctamente y se hizo el respectivo checkout")
    public void el_usuario_agrego_correctamente_y_se_hizo_el_respectivo_checkout() {
        String mensajeCompletado;

        MyAddToCarController myAddToCarController = new MyAddToCarController(webAction);
        mensajeCompletado = myAddToCarController.messageCar();
        Assert.Hard.thatString(mensajeCompletado).isEqualTo(MESSAGE_ADDCAR_COMPLETE);
    }


    @After
    public void cerrarDriver() throws InterruptedException
    {
        //solo para emergencias
        //Thread.sleep(2000);
        if(webAction != null && webAction.getDriver() != null)
            webAction.closeBrowser();
        Report.reportInfo("*********HA FINALIZADO LA PRUEBA*********"
                .concat(testInfo.getFeatureName())
                .concat("-")
                .concat(testInfo.getScenarioName()));
    }
}
