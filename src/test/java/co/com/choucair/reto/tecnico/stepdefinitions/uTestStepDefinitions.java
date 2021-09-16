package co.com.choucair.reto.tecnico.stepdefinitions;

import co.com.choucair.reto.tecnico.model.UTestUserData;
import co.com.choucair.reto.tecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Jhonatan wants to sign in on UTest website$")
    public void thanJhonatanWantsToSignInOnUTestWebsite() {
        OnStage.theActorCalled("Jhonatan").wasAbleTo(OpenUp.thePage(), Pulse.joinToday());
    }

    @When("^he complete the form to sign in as new user$")
    public void heCompleteTheFormToSignInAsNewUser(List<UTestUserData> uTestUserData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                Complete.stepOne(uTestUserData.get(0).getStrFirstName(), uTestUserData.get(0).getStrLastName(),
                                 uTestUserData.get(0).getStrEmail(), uTestUserData.get(0).getStrBirthMonth(),
                                 uTestUserData.get(0).getStrBirthDay(), uTestUserData.get(0).getStrBirthYear()),
                Complete2.stepTwo(),
                Complete3.stepThree(),
                Complete4.stepFour(uTestUserData.get(0).getStrPassword(), uTestUserData.get(0).getStrConfirmPassword()));
    }

    @Then("^he completes the set up form$")
    public void heCompletesTheSetUpForm() {

    }

}
