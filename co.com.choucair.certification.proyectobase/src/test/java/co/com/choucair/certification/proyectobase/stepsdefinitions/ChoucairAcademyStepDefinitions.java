package co.com.choucair.certification.proyectobase.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import tasks.Openup;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation al the academy Choucair$")
    public void thanBrandonwantsToLearnAutomationAtTheAcademyChoucair(){
        OnStage.theActorCalled("Brandon").wasAbleTo(Openup.thePage());

    }


    @When("^he search for the course Recursos Automatización Bancolombia in the choucair academy platform$")
    public void hesearchForTheCourseAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(){

    }


    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void hefindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(){

    }

}
