package co.com.choucair.reto.tecnico.tasks;

import co.com.choucair.reto.tecnico.userinterface.StepFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete4 implements Task {

    private String strPassword;
    private String strConfirmPassword;

    public Complete4(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Complete4 stepFour(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Complete4.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(StepFourPage.USER_PASSWORD),
                Enter.theValue(strConfirmPassword).into(StepFourPage.CONFIRM_PASSWORD),
                Click.on(StepFourPage.STAY_INFORMED),
                Click.on(StepFourPage.TERMS_OF_USE),
                Click.on(StepFourPage.PRIVACY_AND_SECURITY),
                Click.on(StepFourPage.LAST_BUTTON));
    }
}
