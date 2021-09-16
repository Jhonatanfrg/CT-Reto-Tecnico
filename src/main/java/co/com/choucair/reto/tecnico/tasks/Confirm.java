package co.com.choucair.reto.tecnico.tasks;

import co.com.choucair.reto.tecnico.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Confirm implements Task {

    public static Confirm lastPage() {
        return Tasks.instrumented(Confirm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LastPage.WELCOME_TITLE));
    }
}
