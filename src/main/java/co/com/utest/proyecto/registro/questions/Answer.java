package co.com.utest.proyecto.registro.questions;

import co.com.utest.proyecto.registro.userinterface.uTestBuscadorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String pregunta;

    public Answer(String pregunta) {
        this.pregunta = pregunta;
    }

    public static Answer toThe(String pregunta){
    return new Answer(pregunta);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nombreCurso = Text.of(uTestBuscadorPage.NOMBRE_CURSO).viewedBy(actor).asString();
        if (pregunta.equals(nombreCurso)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
