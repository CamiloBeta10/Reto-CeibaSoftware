package co.com.prueba.certificacion.stepdefinitions;

import co.com.prueba.certificacion.model.DataCredencial;
import co.com.prueba.certificacion.question.PaginaPrincipal;
import co.com.prueba.certificacion.task.Autentica;
import co.com.prueba.certificacion.utils.drivers.MyChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;


public class LoguinStepdefinition {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Yo como usuario del portal web$")
    public void yoComoUsuarioDelPortalWeb() throws Exception {
       OnStage.theActorCalled("Camilo");
       OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.web().enLaPagina("https://www.saucedemo.com")));
    }

    @Cuando("^Ingreso credenciale para la autenticacion$")
    public void ingresoCredencialeParaLaAutenticacion(List<DataCredencial>credenciales) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Autentica.EnLaPagina(credenciales));
    }
    @Entonces("^Visualizo la pantalla principal$")
    public void visualizoLaPantallaPrincipal() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(PaginaPrincipal.esVisible()));
    }

}
