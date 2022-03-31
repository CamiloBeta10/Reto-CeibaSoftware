package co.com.prueba.certificacion.stepdefinitions;

import co.com.prueba.certificacion.model.Compra;
import co.com.prueba.certificacion.question.Orden;
import co.com.prueba.certificacion.task.Ingreso;
import cucumber.api.java.Before;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ComprarStepdefinitions {

    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Entonces("^Ingreso mis datos para la compra$")
    public void ingresoMisDatosParaLaCompra(List<Compra> compra) throws Exception {
       OnStage.theActorInTheSpotlight().attemptsTo(Ingreso.datosPersonales(compra));
    }

    @Entonces("^Visualizo la orden ingreso exitosamente$")
    public void visualizoLaOrdenIngresoExitosamente() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(Orden.ingresadaConExito()));

    }

}
