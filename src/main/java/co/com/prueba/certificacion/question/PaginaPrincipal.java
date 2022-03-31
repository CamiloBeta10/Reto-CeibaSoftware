package co.com.prueba.certificacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.prueba.certificacion.userinterface.LoguinPage.TITLE_MAIN_PAGE;

public class PaginaPrincipal implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean strElemtoExistente = false;
        if(TITLE_MAIN_PAGE.resolveFor(actor).isVisible()){
            strElemtoExistente = true;
        }
        return strElemtoExistente;
    }

    public static PaginaPrincipal esVisible(){
        return new PaginaPrincipal();
    }
}
