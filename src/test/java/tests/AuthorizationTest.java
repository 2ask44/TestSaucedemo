package tests;

import org.testng.annotations.Test;
import pages.*;
import settings.Config;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTest extends BaseTest  {

    @Test
    public void Case1() {
        System.out.println("Шаг 1 - Открытие Сайта");
        open(Config.baseUrl);
        System.out.println("Шаг 2 - Введение логина");
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.enterLogin(Config.login);
        System.out.println("Шаг 3 - Введение пароля");
        authorizationPage.enterPassword(Config.password);
        System.out.println("Шаг 4 - Клик кнопки ");
        authorizationPage.clickBtnLogin();
        }

}




