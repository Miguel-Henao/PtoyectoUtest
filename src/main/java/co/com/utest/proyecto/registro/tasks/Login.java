package co.com.utest.proyecto.registro.tasks;

import co.com.utest.proyecto.registro.userinterface.uTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    private String strEmailLogin;
    private String strPasswordLogin;

    public Login(String strEmailLogin, String strPasswordLogin) {
        this.strEmailLogin = strEmailLogin;
        this.strPasswordLogin = strPasswordLogin;
    }

    public static Login onThePage (String strEmailLogin, String strPasswordLogin){
        return  Tasks.instrumented(Login.class, strEmailLogin, strPasswordLogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(uTestLoginPage.BUTTON_LG);
        Enter.keyValues(strEmailLogin).into(uTestLoginPage.IMPUT_EA);
        Enter.keyValues(strPasswordLogin).into(uTestLoginPage.IMPUT_LP);
        Click.on(uTestLoginPage.BUTTON_SI);
    }
}
