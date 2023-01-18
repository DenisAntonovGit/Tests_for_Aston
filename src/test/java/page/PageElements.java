package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class PageElements {

    private SelenideElement header = $(".Header-module--topLine--1L6Tq");
    private SelenideElement footer = $(".Footer-module--main--qtoqu");

    public void openPage() {
        step("Открываем главную страницу", () -> {
            open("https://astondevs.com");
        });
    }

    public void checkHeader() {
        step("Проверяем пункты главного меню", () -> {
            header.shouldHave(text("Технологии"));
            header.shouldHave(text("Отрасли"));
            header.shouldHave(text("Услуги"));
            header.shouldHave(text("Проекты"));
            header.shouldHave(text("Компания"));
            header.shouldHave(text("Карьера"));
        });
    }

    public void checkFooter() {
        step("Проверяем пункты меню в футере страницы", () -> {
        footer.shouldHave(text("Карьера в Aston"));
        footer.shouldHave(text("Стажировка в Aston"));
        });
    }
}
