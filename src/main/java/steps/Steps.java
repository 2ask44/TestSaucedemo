package steps;

import io.qameta.allure.Step;
import pages.*;
import settings.Config;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class Steps {
    private AuthorizationPage authorizationPage = new AuthorizationPage();
    private ProductsPage productsPage = new ProductsPage();
    private BasketPage basketPage = new BasketPage();
    private OrderingPage orderingPage = new OrderingPage();
    private CheckoutPage checkoutPage = new CheckoutPage();

    public String readProperties() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("seting.properties"));
        String baseUrl=System.getProperty("baseUrl");
        return baseUrl;
    }

    @Step("Предусловие - Открытие Сайта")
    public void openSite() {
        open(Config.baseUrl);
        //readProperties();
       //open(readProperties());
       //int i=0;
    }

    @Step("Шаг - Ввести логин")
    public void enterLogin() {
        authorizationPage.enterLogin(Config.login);

    }

    @Step("Шаг - Введение пароля")
    public void enterPassword() {
        authorizationPage.enterPassword(Config.password);
    }

    @Step("Шаг- Клик кнопки Логин ")
    public void clickBtnLogin() {
        authorizationPage.clickBtnLogin();
    }

    @Step("Шаг- Добавить товар")
    public void clickBtnAddProduct() {
        productsPage.addProduct(0);
    }

    @Step("Шаг- Перейти в корзину")
    public void showBasket() {
        productsPage.showBasket();
    }

    @Step("Шаг - Нажать кнопку Continue Shopping")
    public void clickBtnContinue() {
        basketPage.clickBtnContinue();
    }

    @Step("Шаг-Нажать на кнопку Checkout")
    public void clickBtnCheckout() {
        basketPage.clickBtnCheckout();
    }

    @Step("Шаг-Ввод полей")
    public void enterFields(String clientFirstname, String clientLastname, String clientPostalCode) {
        orderingPage.enterFirstname(clientFirstname);
        orderingPage.enterLastname(clientLastname);
        orderingPage.enterPostname(clientPostalCode);
    }

    @Step("Шаг - Нажать на кнопку Continue")
    public void clickBtnContinueOrderingPage() {
        orderingPage.clickBtnContinue();
    }

    @Step("Шаг - Нажать на кнопку Finish")
    public void clickBtnFinish() {
        checkoutPage.clickBtnFinish();
    }

    @Step("Шаг - Нажать кнопку Remove")
    public void clickBtnRemove() {
        basketPage.clickBtnRemove();
    }


}
