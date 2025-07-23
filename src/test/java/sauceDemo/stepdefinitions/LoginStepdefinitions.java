package sauceDemo.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import sauceDemo.models.LoginLombokData;
import sauceDemo.tasks.LoginTask;

import static org.hamcrest.CoreMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static sauceDemo.questions.ElementoEsVisible.enPantalla;
import static sauceDemo.userInterfaces.LoginUI.LBL_LOGIN;
import static sauceDemo.utils.Constans.*;

public class LoginStepdefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra en la pagina web de Sauce Demo")
    public void queElUsuarioSeEncuentraEnLaPaginaWebDeSauceDemo() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @Cuando("ingresa con credenciales correctas")
    public void ingresaConCredencialesCorrectas(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginTask.on(LoginLombokData.setData(dataTable).get(0))
        );
    }

    @Entonces("visualiza el titulo inicial")
    public void visualizaElTituloInicial() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(enPantalla(LBL_LOGIN), is(true))
        );
    }

}
