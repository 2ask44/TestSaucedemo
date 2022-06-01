package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CheckoutPage {

    private SelenideElement btnFinish = $(By.id("finish"));
    private SelenideElement btnContinue = $(By.id("continue-shopping"));

    public void clickBtnFinish() {
        btnFinish.click();
       // sleep(5000);
    }

    public void clickBtnContinue() {
        btnContinue.click();
       // sleep(5000);
    }
}
