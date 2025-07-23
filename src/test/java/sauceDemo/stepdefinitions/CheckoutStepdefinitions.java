package sauceDemo.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import sauceDemo.models.CheckoutLombokData;
import sauceDemo.tasks.CheckoutTask;
import sauceDemo.tasks.SeleccionarProductosTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;
import static sauceDemo.questions.ElementoEsVisible.enPantalla;
import static sauceDemo.userInterfaces.CheckoutUI.BTN_BACK_HOME;

public class CheckoutStepdefinitions {

    @Cuando("selecciona los productos a comprar, selecciona el carrito")
    public void seleccionaLosProductosAComprarSeleccionaElCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarProductosTask.on()
        );
    }

    @Cuando("diligencia los datos de la compra finalizandola")
    public void diligenciaLosDatosDeLaCompraFinalizandola(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CheckoutTask.on(CheckoutLombokData.setData(dataTable).get(0))
        );
    }

    @Entonces("visualiza el el titulo de la orden despachada")
    public void visualizaElElTituloDeLaOrdenDespachada() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(enPantalla(BTN_BACK_HOME), is(true))
        );
    }
}
