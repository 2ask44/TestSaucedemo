package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class OrderingPage {

    private SelenideElement firstname =  $(By.id("first-name"));
    private SelenideElement lastname =  $(By.id("last-name"));
    private SelenideElement postname =  $(By.id("postal-code"));
    private SelenideElement btnContinue = $(By.id("continue"));

    public void enterFirstname(String value) {
        firstname.setValue(value);
    }

    public void enterLastname(String value) {
        lastname.setValue(value);
    }

    public void enterPostname(String value) {
        postname.setValue(value);
    }

    public CheckoutPage clickBtnContinue() {
        btnContinue.click();
       // sleep(5000);
        return new CheckoutPage();
    }
}
