package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    /**
     * Инициализация selenide с настройками
     */
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }
    /**
     * Выполнение метода перед каждым запуском тестов
     */
    @BeforeClass(description = "Настройка браузера")
    public void init() {
        setUp();
    }

    /**
     * Выполнение метода после каждого закрытия тестов
     */
    @AfterClass(description = "Закрытие браузера")
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
