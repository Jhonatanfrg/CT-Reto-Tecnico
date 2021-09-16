package co.com.choucair.reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepTwoPage {
    public static final Target NEXT_BUTTON = Target.the("The button to continue with the next step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
