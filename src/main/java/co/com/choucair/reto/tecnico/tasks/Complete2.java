package co.com.choucair.reto.tecnico.tasks;

import co.com.choucair.reto.tecnico.userinterface.StepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Clear;

public class Complete2 implements Task {


    public static Complete2 stepTwo() {
        return Tasks.instrumented(Complete2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepTwoPage.NEXT_BUTTON));
    }
}
