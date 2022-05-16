package steps;

import io.qameta.allure.Step;
import pages.AuthorizationPage;
import settings.Config;

import static com.codeborne.selenide.Selenide.open;

public class Steps {
    private AuthorizationPage authorizationPage = new AuthorizationPage();

    @Step("Предусловие - Открытие Сайта")
    public void openSite() {
        open(Config.baseUrl);
    }
    @Step("Шаг Ввести логин")
    public void enterLogin() {
        authorizationPage.enterLogin(Config.login);
    }
    @Step("Шаг - Введение пароля")
    public void enterPassword() {
        //System.out.println("Шаг 3 - Введение пароля");
        authorizationPage.enterPassword(Config.password);
    }
    @Step("Шаг- Клик кнопки ")
    public void clickBtnLogin() {
        //System.out.println("Шаг 4 - Клик кнопки ");
        authorizationPage.clickBtnLogin();
    }
}
