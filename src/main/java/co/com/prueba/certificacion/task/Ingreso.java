package co.com.prueba.certificacion.task;

import co.com.prueba.certificacion.model.Compra;
import co.com.prueba.certificacion.model.DataCredencial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.prueba.certificacion.userinterface.AddProductoPage.PRODUCTO_EN_CARRITO;
import static co.com.prueba.certificacion.userinterface.CompraPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ingreso implements Task {
    private List<Compra> compra;
    public Ingreso(List<Compra> compra){
        this.compra = compra;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKOUT_BOTON));
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(5, SECONDS);
        actor.attemptsTo(
                Click.on(NOMBRE),
                Enter.theValue(compra.get(0).getNombre()).into(NOMBRE),
                Enter.theValue(compra.get(0).getApellido()).into(APELLIDO),
                Enter.theValue(compra.get(0).getCodigopostal()).into(CODIGO_POSTAL),
                Click.on(BOTON_CONTINUE)
        );
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(5, SECONDS);
        actor.attemptsTo( Click.on(BOTON_FINALIZAR));

    }
    public static Ingreso datosPersonales(List<Compra> compra){
        return instrumented(Ingreso.class,compra);
    }
}
