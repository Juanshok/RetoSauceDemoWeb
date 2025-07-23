package sauceDemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class ElementoEsVisible implements Question<Boolean> {

    private final Target elemento;

    public ElementoEsVisible(Target elemento) {
        this.elemento = elemento;
    }

    public static ElementoEsVisible enPantalla(Target elemento) {
        return new ElementoEsVisible(elemento);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            elemento.resolveFor(actor).waitUntilVisible()
                    .withTimeoutOf(Duration.ofSeconds(10));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
