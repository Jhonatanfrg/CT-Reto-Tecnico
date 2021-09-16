package co.com.choucair.reto.tecnico.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com")
public class UTestPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to join")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));
}
