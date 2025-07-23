package sauceDemo.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    LoginUI() {
    }
    public static final Target TXT_USERNAME = Target.the("Txt Username").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("Txt Password").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Btn Login").located(By.id("login-button"));
    public static final Target LBL_LOGIN = Target.the("Lbl Titulo Inicial").located(By.xpath("//div[@class='app_logo']"));

}
