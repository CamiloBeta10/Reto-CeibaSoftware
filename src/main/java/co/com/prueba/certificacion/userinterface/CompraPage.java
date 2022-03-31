package co.com.prueba.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CompraPage {
    public static final Target ORDEN_EXITOSA = Target.the("ORDEN INGRESADA CON EXITO")
            .locatedBy("//*[@id='checkout_complete_container']");
    public static final Target PRODUCTO_T_SHIRT = Target.the("CAMISETA")
            .locatedBy("//*[@id='inventory_container']/div/div[3]/div[2]");
    public static final Target ADD_BOTON_T_SHIRT = Target.the("BOTON DE AGREGAR")
            .locatedBy(" //*[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final Target CHECKOUT_BOTON = Target.the("BOTON DE VERIFICACION DE COMPRA")
            .locatedBy("//*[@id='checkout']");
    public static final Target NOMBRE = Target.the("INGRESO DE NOMBRE")
            .locatedBy("//input[@id='first-name']   ");
    public static final Target APELLIDO = Target.the("INGRESO APELLIDO")
            .locatedBy("//input[@id='last-name']");
    public static final Target CODIGO_POSTAL = Target.the("CODIGO POSTAL")
            .locatedBy("//input[@id='postal-code']");
    public static final Target BOTON_CONTINUE = Target.the("BOTON CONTINUAR")
            .locatedBy("//input[@id='continue']");
    public static final Target BOTON_FINALIZAR = Target.the("BOTON FINALIZAR")
            .locatedBy("//button[@id='finish']");
    public static final Target T_SHIRT = Target.the("COMPROBAR PRODUCTO")
            .locatedBy("//*[@id='item_1_title_link']/div");

}
