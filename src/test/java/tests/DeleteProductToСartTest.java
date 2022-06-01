package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import settings.Config;
import steps.Steps;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class DeleteProductToСartTest extends BaseTest {
    Steps steps = new Steps();

    @BeforeTest(description = "Предусловие")
    public void precondition()  {
        steps.openSite();
        steps.enterLogin();
        steps.enterPassword();
        steps.clickBtnLogin();
    }

    @Test(description = "Кейс №4:Удаление товара из корзины")
    public void Case4() {
        steps.clickBtnAddProduct();
        steps.showBasket();
        steps.clickBtnRemove();
        steps.clickBtnContinue();
    }
}




