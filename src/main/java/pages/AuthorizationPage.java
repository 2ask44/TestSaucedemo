package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class AuthorizationPage {

     private SelenideElement login = $(By.name("user-name"));
     private SelenideElement password = $(By.name("password"));
     private SelenideElement btnLogin = $(By.id("login-button"));

     public void enterLogin(String value) {
         login.setValue(value);
     };

    public void enterPassword(String value) {
        password.setValue(value);
    };


    public ProductsPage clickBtnLogin() {
        btnLogin.click();
        sleep(5000);
        return new ProductsPage();
    }
}
