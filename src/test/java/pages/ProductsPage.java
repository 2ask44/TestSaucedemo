package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {

    private ElementsCollection productsArray = $$(By.xpath("//*[@class='inventory_item']"));
    private SelenideElement basket = $(By.id("shopping_cart_container"));

    public void addProduct(int index) {
        SelenideElement btnAdd = productsArray.get(0).$(By.id("add-to-cart-sauce-labs-backpack"));
        btnAdd.click();
        sleep(5000);
    }

    public BasketPage showBasket() {
        basket.click();
        sleep(5000);
        return new BasketPage();
    }
}