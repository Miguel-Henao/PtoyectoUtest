package co.com.utest.proyecto.registro.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestBuscadorPage {
    public static final Target BUTTON_SC = Target.the("Search").located(By.className("ntux-nav-header-search__icon"));
    public static final Target NOMBRE_CURSO = Target.the("Swrite the name of the course").located(By.id("searchInput"));

}
