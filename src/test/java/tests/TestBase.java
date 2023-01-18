package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import page.PageElements;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1080x800";
    }
    @BeforeEach
    void beforeEach() {
        new PageElements().openPage();
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
