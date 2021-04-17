package co.com.utest.proyecto.registro.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRegistroPage {
    public static final Target INPUT_FN = Target.the("First name").located(By.id("firstName"));
    public static final Target INPUT_LN = Target.the("Last name").located(By.id("lastName"));
    public static final Target INPUT_E = Target.the("Email address").located(By.id("email"));
    public static final Target INPUT_B = Target.the("Date of birth").located(By.xpath("//label[@for='birthDate']"));
    public static final Target INPUT_L = Target.the("Languages (spoken)").located(By.xpath("//label[@for='languages']"));
    public static final Target BUTTON_NL = Target.the("Next step - define your location").located(By.xpath("//a[@class='btn btn-blue'] //span[contains(text('Next: Location'))]"));
    public static final Target INPUT_C = Target.the("City").located(By.id("city"));
    public static final Target INPUT_ZPC = Target.the("Zip or Postal Code").located(By.id("zip"));
    public static final Target INPUT_CO = Target.the("Country").located(By.xpath("//div[@class = 'ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required auto-detected']"));
    public static final Target BUTTON_NSYD = Target.the("Next step - select your devices").located(By.xpath("//a[@class='btn btn-blue'] //span[contains(text('Next: Devices'))]"));
    public static final Target INPUT_YC = Target.the("Your Computer").located(By.id("web-device"));
    public static final Target INPUT_YM = Target.the("Your Mobile Device").located(By.id("mobile-device"));
    public static final Target BUTTON_NLS = Target.the("Next: Last Step").located(By.xpath("//a[@class='btn btn-blue'] //span[contains(text('Next: Last Step'))]"));
    public static final Target INPUT_PW  = Target.the( "Create your uTest password").located(By.id("password"));
    public static final Target INPUT_CPW = Target.the("Confirm password").located(By.id("confirmPassword"));
    public static final Target INPUT_SI = Target.the("STAY INFORMED! (optional)").located(By.xpath("input [@class = 'ing-valid ng-empty ng-dirty ng-valid-parse ng-touched']"));
    public static final Target INPUT_UTOU = Target.the("I have read and accept the uTest Terms of Use").located(By.id("termOfUse"));
    public static final Target INPUT_PSP = Target.the("I have read and accept the Privacy & Security Policy").located(By.id("privacySetting"));



}
