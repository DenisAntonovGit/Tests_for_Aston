package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.PageElements;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TestsForAston extends TestBase{


    @Test
    @DisplayName("Проверка элементов главного меню")
    void headerTest() {
        new PageElements().checkHeader();
    }

    @Test
    @DisplayName("Проверка элементов меню в футере страницы")
    void footerMenu() {
        new PageElements().checkFooter();
    }

    @Test
    @DisplayName("Проверка элемента Карьера в главном меню")
    void subOptionsElements() {
        step("Нажимаем на раздел Карьера главного меню", () -> {
            $(".Header-module--topLine--1L6Tq").find(byText("Карьера")).click();
        });
        step("Проверям наличие раздела Карьера в подменю", () -> {
            $$(".SubMenu-module--link--a13yV").findBy(visible).shouldHave(text("Карьера"));
        });
        step("Проверям наличие раздела Стажировка в подменю", () -> {
            $$(".SubMenu-module--link--a13yV").last().shouldHave(text("Стажировка"));
        });
    }

    @Test
    @DisplayName("Проверка ссылки 'Карьера' в элементах подменю Карьера")
    void checkSubMenuOption() {
        step("Нажимаем на раздел Карьера главного меню", () -> {
            $(".Header-module--topLine--1L6Tq").find(byText("Карьера")).click();
        });
        step("Нажимаем на ссылку Карьера в подменю", () -> {
            $(byLinkText("Карьера")).click();
        });
        step("Проверяем текст заголовка обновленной страницы", () -> {
            $(".Intro-module--contentLayout--cGmJL").shouldHave(text("Карьера в Aston"));
        });
    }

    @Test
    @DisplayName("Проверка работоспособнсти элемента меню 'Узнать стоимость'")
    void checkButtonAboutPrice() {
        step("Нажимаем кнопку меню Узнать стоимость", () -> {
            $(byLinkText("Узнать стоимость")).click();
        });
        step("Проверям текст заголовка обновленной страницы", () -> {
            $(".CalculatorWithTabs-module--wrapper--1TAzC").shouldHave(text("Запросить оценку стоимости ИT-проекта"));
        });
    }

    @Test
    @DisplayName("Проверка работоспособности баттона 'Отправьте нам сообщение'")
    void sendMessageToUs() {
        step("Нажимаем на элемент страницы Отправьте нам сообщение", () -> {
            $(".hoverl_e869").click();
        });
        step("Проверям наличие текста в окне для ввода сообщения", () -> {
            $("#jcont").shouldHave(text("У вас возникли вопросы? Мы с удовольствием ответим!"));
        });
    }
}
