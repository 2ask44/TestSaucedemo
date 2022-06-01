package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {

     private SelenideElement login = $(By.name("user-name"));
     private SelenideElement password = $(By.name("password"));
     private SelenideElement btnLogin = $(By.id("login-button"));
     private ElementsCollection fffd= $$x("");


     public void enterLogin(String value) {
         login.setValue(value);
     };

    public void enterPassword(String value) {
        password.setValue(value);
        btnLogin.getText();
        int i=0;
    };

    public ProductsPage clickBtnLogin() {
        btnLogin.click();
       // sleep(5000);
        return new ProductsPage();
    }
}
