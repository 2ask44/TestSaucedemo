package tests;

import org.testng.annotations.Test;
import steps.Steps;

import java.io.IOException;

public class AuthorizationTest extends BaseTest {
    public Steps steps = new Steps();

    @Test(description = "Кейс №1:Проверка авторизации")
    public void Case1() {
        steps.openSite();
        steps.enterLogin();
        steps.enterPassword();


        steps.clickBtnLogin();
    }

}




