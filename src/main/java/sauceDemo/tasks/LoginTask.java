package sauceDemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import sauceDemo.models.LoginLombokData;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static sauceDemo.userInterfaces.LoginUI.*;


public class LoginTask implements Task {

    protected LoginLombokData loginLombokData;

    public LoginTask(LoginLombokData loginLombokData) {
        this.loginLombokData = loginLombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USERNAME, isVisible()).forNoMoreThan(20).seconds(), //Espera
                Enter.theValue(loginLombokData.getUsername()).into(TXT_USERNAME),
                Enter.theValue(loginLombokData.getPassword()).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static LoginTask on(LoginLombokData loginLombokData){
        return Instrumented.instanceOf(LoginTask.class).withProperties(loginLombokData);
    }
}
