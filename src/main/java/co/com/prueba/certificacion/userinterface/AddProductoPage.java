package co.com.prueba.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddProductoPage {

    public static final Target PRODUCTO_SELECCIONADO = Target.the("PRODUCTO SELECCIONADO")
            .locatedBy("(//*[@id='inventory_container']/div/div[1])[2]");
    public static final Target BOTON_AGREGAR_PRODUCTO = Target.the("BOTON PARA AGREGAR PRODUCTO")
            .locatedBy("//button[@id= 'add-to-cart-sauce-labs-backpack']");
    public static final Target BOTON_CARRITO = Target.the("BOTO CARRITO DE COMPRAS")
            .locatedBy("//*[@id='shopping_cart_container']");
    public static final Target PRODUCTO_EN_CARRITO = Target.the("NOMBRE DE EL PRODUCTO EN CARRITO")
            .locatedBy("//*[@id='item_4_title_link']/div");
}
