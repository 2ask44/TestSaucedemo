package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.Steps;

import java.io.IOException;

public class RegistrationProductTest extends BaseTest {

    String clientFirstname = "Георгий";
    String clientLastname = "Жигарев";
    String clientPostalCode = "156000";
    Steps steps = new Steps();

    @BeforeTest(description = "Предусловие")
    public  void precondition() {
        steps.openSite();
        steps.enterLogin();
        steps.enterPassword();
        steps.clickBtnLogin();
        steps.clickBtnAddProduct();
        steps.showBasket();
    }

    @Test(description = "Кейс №3:Оформение товара")
    public void Case3() {
        steps.clickBtnCheckout();
        steps.enterFields(clientFirstname, clientLastname, clientPostalCode);
        steps.clickBtnContinueOrderingPage();
        steps.clickBtnFinish();
            }

}




