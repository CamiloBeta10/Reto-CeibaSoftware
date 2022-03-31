package co.com.prueba.certificacion.task;

import co.com.prueba.certificacion.model.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.hamcrest.core.IsEqual;

import java.util.List;

import static co.com.prueba.certificacion.userinterface.AddProductoPage.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Agregar implements Task {

    private List<Producto> producto;

    public Agregar( List<Producto> producto){
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(5, SECONDS);
        if (PRODUCTO_SELECCIONADO.resolveFor(actor).getText().equals(producto.get(0).getProducto())) {
            actor.attemptsTo(Click.on(PRODUCTO_SELECCIONADO));
        }
            BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(5, SECONDS);
            actor.attemptsTo(Click.on(BOTON_AGREGAR_PRODUCTO));
        actor.remember("Producto" ,producto.get(0).getProducto());
        actor.attemptsTo(Click.on(BOTON_CARRITO));
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait(7, SECONDS);

    }

    public static Agregar UnProducto(List<Producto> data) {
        return Tasks.instrumented(Agregar.class, data);
    }
}
