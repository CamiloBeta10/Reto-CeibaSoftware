package co.com.prueba.certificacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.prueba.certificacion.userinterface.CompraPage.ORDEN_EXITOSA;

public class Orden implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
       boolean blnElemtoExistente = false;
       if (ORDEN_EXITOSA.resolveFor(actor).isDisplayed()){
           blnElemtoExistente = true;
           actor.should(String.valueOf(ORDEN_EXITOSA.resolveFor(actor).isPresent()));
       }
        return blnElemtoExistente;
    }

    public static Orden ingresadaConExito(){
        return new Orden();
    }
}
