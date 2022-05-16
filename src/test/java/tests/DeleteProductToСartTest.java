package tests;

import org.testng.annotations.Test;
import pages.*;
import settings.Config;

import static com.codeborne.selenide.Selenide.open;

public class DeleteProductToСartTest extends BaseTest  {

    @Test
    public void Case4() {
        System.out.println("Предусловие 1 - Открытие Сайта");
        open(Config.baseUrl);
        System.out.println("Предусловие 2 - Введение логина");
        AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.enterLogin(Config.login);
        System.out.println("Предусловие 3 - Введение пароля");
        authorizationPage.enterPassword(Config.password);
        System.out.println("Предусловие 4 - Клик кнопки");
        ProductsPage productsPage = authorizationPage.clickBtnLogin();
        System.out.println("Шаг 1 - Добавить товар");
        productsPage.addProduct(0);
        System.out.println("Шаг 2 - Перейти в корзину");
        BasketPage basketPage = productsPage.showBasket();
        System.out.println("Шаг 3 - Нажать кнопку Remove");
        CheckoutPage checkoutPage = basketPage.clickBtnRemove();
        System.out.println("Шаг 4 - Нажать кнопку Continue Shopping");
        checkoutPage.clickBtnContinue();
    }
}




