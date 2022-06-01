package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    private SelenideElement btnContinue = $(By.id("continue-shopping"));
    private SelenideElement btnCheckout = $(By.id("checkout"));
    private SelenideElement btnRemove = $(By.id("remove-sauce-labs-backpack"));

    public void clickBtnContinue() {
        btnContinue.click();
       // sleep(5000);
    }

    public OrderingPage clickBtnCheckout() {
        btnCheckout.click();
        return new OrderingPage();
    }

    public CheckoutPage clickBtnRemove() {
        btnRemove.click();
       // sleep(5000);
        return new CheckoutPage();
    }
}
