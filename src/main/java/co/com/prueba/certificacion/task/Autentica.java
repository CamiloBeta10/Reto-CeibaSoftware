package co.com.prueba.certificacion.task;

import co.com.prueba.certificacion.model.DataCredencial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.prueba.certificacion.userinterface.LoguinPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Autentica implements Task {
    private List<DataCredencial> credenciales;
    public Autentica( List<DataCredencial> credenciales){
        this.credenciales = credenciales;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(5, SECONDS);
        actor.attemptsTo(
                Click.on(USER_NAME),
                Enter.theValue(credenciales.get(0).getUsuario()).into(USER_NAME),
                Enter.theValue(credenciales.get(0).getClave()).into(PASS_BOX),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static Autentica EnLaPagina(List<DataCredencial> credenciales){
        return instrumented(Autentica.class,credenciales);
    }
}
