package co.com.choucair.reto.tecnico.tasks;

import co.com.choucair.reto.tecnico.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Pulse implements Task {
    public static Pulse joinToday() {
        return Tasks.instrumented(Pulse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestPage.LOGIN_BUTTON));
    }
}
