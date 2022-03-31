package co.com.prueba.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;


public class LoguinPage {
    public static final Target USER_NAME = Target.the("TEXBOX DE INGRESO DE USUARIO")
            .locatedBy("//input[@id='user-name']");
    public static final Target PASS_BOX = Target.the("TEXBOX INGRESO DE CLAVE")
            .locatedBy("//input[@id='password']");
    public static final Target LOGIN_BUTTON = Target.the("BOTON DE INICIO DE SESION")
            .locatedBy("//input[@id='login-button']");
    public static final Target TITLE_MAIN_PAGE = Target.the("TITULO PAGINA PRINCIPAL")
            .locatedBy("//span[contains(text(),'Products')]");
}
