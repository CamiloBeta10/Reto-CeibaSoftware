package co.com.prueba.certificacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.core.IsEqual;

import static co.com.prueba.certificacion.userinterface.AddProductoPage.PRODUCTO_EN_CARRITO;
import static org.junit.Assert.assertThat;

public class EnCarrito  implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean blnexistElement = false;
        if (PRODUCTO_EN_CARRITO.resolveFor(actor).isVisible()) {
            blnexistElement = true;
            assertThat(PRODUCTO_EN_CARRITO.getName(), Text.of(PRODUCTO_EN_CARRITO).viewedBy(actor).asString(), IsEqual.equalTo(actor.recall("Producto")));

        }
        return blnexistElement;
    }
    public static EnCarrito deCompras(){
        return new EnCarrito();
    }
}
