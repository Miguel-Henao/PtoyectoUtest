package co.com.utest.proyecto.registro.stepdefinitions;


import co.com.utest.proyecto.registro.model.uTestData;
import co.com.utest.proyecto.registro.questions.Answer;
import co.com.utest.proyecto.registro.tasks.Login;
import co.com.utest.proyecto.registro.tasks.OpenUp;
import co.com.utest.proyecto.registro.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class uTestStepDefintions {
    @Before

    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^miguel se registra en el portal$")
    public void miguelSeRegistraEnElPortal(List<uTestData>utestData) throws Exception {
    OnStage.theActorCalled("Miguel").wasAbleTo(OpenUp.thePage(), Registro.onThePage(
            utestData.get(0).getStrNombre(),
            utestData.get(0).getStrApellido(),
            utestData.get(0).getStrEmail(),
            utestData.get(0).getStrNacimiento(),
            utestData.get(0).getStrLenguaje(),
            utestData.get(0).getStrCiudad(),
            utestData.get(0).getStrCPostal(),
            utestData.get(0).getStrPais(),
            utestData.get(0).getStrComputador(),
            utestData.get(0).getStrMovil(),
            utestData.get(0).getStrUsusuario(),
            utestData.get(0).getStrPassword(),
            utestData.get(0).getStrCPassword(),
            utestData.get(0).getStrStayInformed(),
            utestData.get(0).getStrTermUse(),
            utestData.get(0).getStrPSP()

    ));

    }


    @When("^ingresa al portal con los datos$")
    public void ingresaAlPortalConLosDatos(List<uTestData>utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(
                utestData.get(0).getStrEmailLogin(),
                utestData.get(0).getStrPasswordLogin()
        ));
    }

    @Then("^busca el curso$")
    public void buscaElCurso(List<uTestData>utestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(
                utestData.get(0).getStrCurso()))
        );
    }

}
