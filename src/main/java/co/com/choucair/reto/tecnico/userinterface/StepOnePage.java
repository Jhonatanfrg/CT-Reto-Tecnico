package co.com.choucair.reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepOnePage {
    public static final Target FIRST_NAME = Target.the("where do we write our first name")
            .located(By.xpath("//input[@id='firstName']"));
    public static final Target LAST_NAME = Target.the("where do we write our last name")
            .located(By.xpath("//input[@id='lastName']"));
    public static final Target INPUT_EMAIL = Target.the("where do we write our email")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("where do we select our birth month")
            .located(By.name("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("where do we select our birth day")
            .located(By.name("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("where do we select our birth year")
            .located(By.name("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("The button to continue with the next step")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
