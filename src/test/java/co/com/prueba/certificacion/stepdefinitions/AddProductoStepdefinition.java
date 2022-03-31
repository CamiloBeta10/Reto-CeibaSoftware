package co.com.prueba.certificacion.stepdefinitions;

import co.com.prueba.certificacion.model.DataCredencial;
import co.com.prueba.certificacion.model.Producto;
import co.com.prueba.certificacion.question.EnCarrito;
import co.com.prueba.certificacion.task.Agregar;
import co.com.prueba.certificacion.task.Autentica;
import co.com.prueba.certificacion.utils.drivers.MyChromeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AddProductoStepdefinition {
    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Yo como usuario me logue en la pagina$")
    public void yoComoUsuarioMeLogueEnLaPagina(List<DataCredencial> credenciales) throws Exception {
        OnStage.theActorCalled("Camilo");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.web().enLaPagina("https://www.saucedemo.com")));
        OnStage.theActorInTheSpotlight().attemptsTo(Autentica.EnLaPagina(credenciales));
    }
    @Cuando("^Selecciono y agrego un producto al carrito de compra$")
    public void seleccionoYAgregoUnProductoAlCarritoDeCompra(List<Producto>producto) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Agregar.UnProducto(producto));
    }
    @Entonces("^Visualizo el producto en el carrito de compra$")
    public void visualizoElProductoEnElCarritoDeCompra() throws Exception {
      OnStage.theActorInTheSpotlight().should(seeThat(EnCarrito.deCompras()));
    }



}
