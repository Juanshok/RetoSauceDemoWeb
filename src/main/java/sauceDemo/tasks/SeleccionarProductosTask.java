package sauceDemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static sauceDemo.userInterfaces.CheckoutUI.*;

public class SeleccionarProductosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_FIRTS_PRODUCT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_FIRTS_PRODUCT),
                Click.on(BTN_SECOND_PRODUCT),
                Click.on(BTN_SHOPPING_CAR),
                WaitUntil.the(BTN_CHECKOUT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CHECKOUT)

        );

    }

    public static SeleccionarProductosTask on() {
        return Instrumented.instanceOf(SeleccionarProductosTask.class).withProperties();
    }

}
