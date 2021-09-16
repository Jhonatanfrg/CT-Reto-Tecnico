package co.com.choucair.reto.tecnico.tasks;

import co.com.choucair.reto.tecnico.userinterface.StepOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Complete implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;

    public Complete(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }

    public static Complete stepOne(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear) {
        return Tasks.instrumented(Complete.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(StepOnePage.FIRST_NAME),
        Enter.theValue(strLastName).into(StepOnePage.LAST_NAME),
        Enter.theValue(strEmail).into(StepOnePage.INPUT_EMAIL),
        Enter.keyValues(strBirthMonth).into(StepOnePage.BIRTH_MONTH),
        Enter.keyValues(strBirthDay).into(StepOnePage.BIRTH_DAY),
        Enter.keyValues(strBirthYear).into(StepOnePage.BIRTH_YEAR),
                Click.on(StepOnePage.NEXT_BUTTON)
        );
    }
}
