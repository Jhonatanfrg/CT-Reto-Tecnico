package co.com.choucair.reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {
    public static final Target WELCOME_TITLE = Target.the("Title to confirm our sign in as a new user")
            .located(By.xpath("//h1[contains(text(),'Welcome')]"));
}
