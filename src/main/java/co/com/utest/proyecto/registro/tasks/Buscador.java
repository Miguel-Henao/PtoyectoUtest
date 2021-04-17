package co.com.utest.proyecto.registro.tasks;

import co.com.utest.proyecto.registro.userinterface.uTestBuscadorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscador implements Task {
    private String strCurso;

    public Buscador(String strCurso) {
        this.strCurso = strCurso;
    }

    public static Buscador the(String strCurso){
        return Tasks.instrumented(Buscador.class, strCurso);

    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(uTestBuscadorPage.BUTTON_SC),
                Enter.theValue(strCurso).into(uTestBuscadorPage.NOMBRE_CURSO)
        );

    }
}
