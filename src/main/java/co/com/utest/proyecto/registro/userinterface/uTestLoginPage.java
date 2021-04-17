package co.com.utest.proyecto.registro.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestLoginPage {
    public static final Target BUTTON_LG = Target.the("Log In").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target IMPUT_EA = Target.the("Email Address").located(By.id("username"));
    public static final Target IMPUT_LP = Target.the("Password").located(By.id("password"));
    public static final Target BUTTON_SI = Target.the("Sign in").located(By.id("kc-login"));
}
