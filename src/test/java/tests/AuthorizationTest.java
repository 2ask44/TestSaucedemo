package tests;
import org.testng.annotations.Test;
import pages.*;
import settings.Config;
import steps.Steps;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTest extends BaseTest  {
    public Steps steps = new Steps();

    @Test
    public void Case1() {

        //System.out.println("Шаг 1 - Открытие Сайта");
        steps.openSite();
        steps.enterLogin();
        steps.enterPassword();
        steps.clickBtnLogin();
        ///System.out.println("Шаг 2 - Введение логина");
//        AuthorizationPage authorizationPage = new AuthorizationPage();
//        authorizationPage.enterLogin(Config.login);
//        System.out.println("Шаг 3 - Введение пароля");
//        authorizationPage.enterPassword(Config.password);
//        System.out.println("Шаг 4 - Клик кнопки ");
//        authorizationPage.clickBtnLogin();
        }

}




