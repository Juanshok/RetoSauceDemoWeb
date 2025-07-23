package sauceDemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sauceDemo.models.CheckoutLombokData;

import javax.swing.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static sauceDemo.userInterfaces.CheckoutUI.*;

public class CheckoutTask implements Task {

    protected CheckoutLombokData checkoutLombokData;

    public CheckoutTask(CheckoutLombokData checkoutLombokData) {
        this.checkoutLombokData = checkoutLombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(TXT_FIRST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(checkoutLombokData.getFirstName()).into(TXT_FIRST_NAME),
                Enter.theValue(checkoutLombokData.getLastName()).into(TXT_LAST_NAME),
                Enter.theValue(checkoutLombokData.getPostalCode()).into(TXT_POSTAL_CODE),
                Click.on(BTN_CONTINUE),
                WaitUntil.the(BTN_FINISH, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_FINISH)
        );

    }

    public static CheckoutTask on(CheckoutLombokData checkoutLombokData) {
        return Instrumented.instanceOf(CheckoutTask.class).withProperties(checkoutLombokData);
    }

}
