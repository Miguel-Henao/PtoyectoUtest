package co.com.utest.proyecto.registro.tasks;

import co.com.utest.proyecto.registro.userinterface.uTestRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registro implements Task {
    private String strNombre;
    private String strApellido;
    private String strEmail;
    private String strNacimiento;
    private String strLenguaje;
    private String strCiudad;
    private String strCPostal;
    private String strPais;
    private String strComputador;
    private String strMovil;
    private String strPassword;
    private String strCPassword;
    private String strStayInformed;
    private String strTermUse;
    private String strPSP;



    public Registro(String strNombre, String strApellido,  String strEmail, String strNacimiento, String strLenguaje, String strCiudad, String strCPostal ,String strPais, String strComputador, String strMovil, String strPassword, String strCPassword, String strStayInformed, String strTermUse, String strPSP){
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.strNacimiento = strNacimiento;
        this.strLenguaje = strLenguaje;
        this.strCiudad = strCiudad;
        this.strCPostal = strCPostal;
        this.strPais= strPais;
        this.strComputador = strComputador;
        this.strMovil = strMovil;
        this.strPassword = strPassword;
        this.strCPassword = strCPassword;
        this.strStayInformed = strStayInformed;
        this.strTermUse = strTermUse;
        this.strPSP = strPSP;


    }
    public static   Registro onThePage(String strNombre, String strApellido,  String strEmail, String strNacimiento, String strLenguaje, String strCiudad, String strCPostal ,String strPais, String strComputador, String strMovil, String strUsuario, String strPassword, String strCPassword, String strStayInformed, String strTermUse, String strPSP){
        return Tasks.instrumented(Registro.class, strNombre, strApellido, strEmail, strNacimiento, strLenguaje, strCiudad, strCPostal, strPais, strComputador, strMovil,  strUsuario, strPassword, strCPassword,strStayInformed, strTermUse, strPSP);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strNombre).into(uTestRegistroPage.INPUT_FN),
                Enter.theValue(strApellido).into(uTestRegistroPage.INPUT_LN),
                Enter.theValue(strEmail).into(uTestRegistroPage.INPUT_E),
                Enter.theValue(strNacimiento).into(uTestRegistroPage.INPUT_B),
                Enter.theValue(strLenguaje).into(uTestRegistroPage.INPUT_L),
                Click.on(uTestRegistroPage.BUTTON_NL),
                Enter.theValue(strCiudad).into(uTestRegistroPage.INPUT_C),
                Enter.theValue(strCPostal).into(uTestRegistroPage.INPUT_ZPC),
                Enter.theValue(strPais).into(uTestRegistroPage.INPUT_CO),
                Click.on(uTestRegistroPage.BUTTON_NSYD),
                Enter.theValue(strComputador).into(uTestRegistroPage.INPUT_YC),
                Enter.theValue(strMovil).into(uTestRegistroPage.INPUT_YM),
                Click.on(uTestRegistroPage.BUTTON_NLS),
                Enter.theValue(strPassword).into(uTestRegistroPage.INPUT_PW),
                Enter.theValue(strCPassword).into(uTestRegistroPage.INPUT_CPW),
                Enter.theValue(strStayInformed).into(uTestRegistroPage.INPUT_SI),
                Enter.theValue(strTermUse).into(uTestRegistroPage.INPUT_UTOU),
                Enter.theValue(strPSP).into(uTestRegistroPage.INPUT_PSP)

        );

    }

}
