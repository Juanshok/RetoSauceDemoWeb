package sauceDemo.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutUI {

    CheckoutUI() {
    }
    public static final Target BTN_FIRTS_PRODUCT = Target.the("Btn Firts Product").located(By.xpath("(//button[@class = 'btn btn_primary btn_small btn_inventory '])[1]"));
    public static final Target BTN_SECOND_PRODUCT = Target.the("Btn Second Product").located(By.xpath("(//button[@class = 'btn btn_primary btn_small btn_inventory '])[2]"));
    public static final Target BTN_SHOPPING_CAR = Target.the("Btn Shopping Car").located(By.id("shopping_cart_container"));
    public static final Target BTN_CHECKOUT = Target.the("Btn CheckOut").located(By.id("checkout"));
    public static final Target TXT_FIRST_NAME = Target.the("Txt First Name").located(By.id("first-name"));
    public static final Target TXT_LAST_NAME = Target.the("Txt Last Name").located(By.id("last-name"));
    public static final Target TXT_POSTAL_CODE = Target.the("Txt Postal Code").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("Btn Continue").located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("Btn Finish").located(By.id("finish"));
    public static final Target BTN_BACK_HOME = Target.the("Btn Back Home").located(By.id("back-to-products"));

}
