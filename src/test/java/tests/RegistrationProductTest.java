package tests;

import org.testng.annotations.Test;
import pages.*;
import settings.Config;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationProductTest extends BaseTest  {

    String clientFirstname = "Георгий";
    String clientLastname = "Жигарев";
    String clientPostalCode = "156000";

    @Test
    public void Case3() {
        // Предусловия
        System.out.println("Предусловие 1 - Открытие Сайта");
        open(Config.baseUrl);
        System.out.println("Предусловие 2 - Введение логина");
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.enterLogin(Config.login);
        System.out.println("Предусловие 3 - Введение пароля");
        authorizationPage.enterPassword(Config.password);
        System.out.println("Предусловие 4 - Клик кнопки");

        ProductsPage productsPage = authorizationPage.clickBtnLogin();
        System.out.println("Предусловие 5 - Добавить товар");
        productsPage.addProduct(0);
        System.out.println("Предусловие 6 - Перейти в корзину");

        BasketPage basketPage = productsPage.showBasket();
        System.out.println("Шаг 1 - Нажать на кнопку Checkout");
        OrderingPage orderingPage = basketPage.clickBtnCheckout();
        System.out.println("Шаг 2 - Ввод полей");
        orderingPage.enterFirstname(clientFirstname);
        orderingPage.enterLastname(clientLastname);
        orderingPage.enterPostname(clientPostalCode);
        System.out.println("Шаг 3 - Нажать на кнопку Continue");
        CheckoutPage checkoutPage = orderingPage.clickBtnContinue();
        System.out.println("Шаг 4 - Нажать на кнопку Finish");
        checkoutPage.clickBtnFinish();
    }

}




