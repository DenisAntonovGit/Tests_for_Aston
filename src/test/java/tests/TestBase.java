package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import page.PageElements;


public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1080x800";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

    }

    @BeforeEach
    void beforeEach() {
        new PageElements().openPage();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {

    }
}
