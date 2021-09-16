package co.com.choucair.reto.tecnico.tasks;


import co.com.choucair.reto.tecnico.userinterface.StepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Complete3 implements Task {
    public static Complete3 stepThree() {
        return Tasks.instrumented(Complete3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepThreePage.NEXT_BUTTON));
    }
}
