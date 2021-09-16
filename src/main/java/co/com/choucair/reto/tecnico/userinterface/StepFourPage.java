package co.com.choucair.reto.tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepFourPage {
    public static final Target USER_PASSWORD = Target.the("where do we write our password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("where do we confirm our password")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("where do we confirm to stay informed")
            .located(By.xpath("//label[@class='input-check-box signup-consent signup-consent--highlight']"));
    public static final Target TERMS_OF_USE = Target.the("where do we confirm that we read the use terms")
            .located(By.xpath("//input[@name='termOfUse']"));
    public static final Target PRIVACY_AND_SECURITY = Target.the("where do we confirm that we read the privacy and security terms")
            .located(By.xpath("//input[@name='privacySetting']"));
    public static final Target LAST_BUTTON = Target.the("Last Button in the form")
            .located(By.xpath("//a[@aria-label='Complete Setup']"));
}
