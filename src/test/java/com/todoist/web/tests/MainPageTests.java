package com.todoist.web.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author alekseibulatov (Aleksei Bulatov)
 *
 */

@Feature("MainPage")
public class MainPageTests extends WebTestBase {

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Главная страница сайта загружена ")
    @Tag("ui")
    void currentOpenMainPageTest() {
        mainPage.openPage()
                .verificationMainPage();
    }

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("В шапке на главной странице отображаются ссылки 'ВОЗМОЖНОСТИ, ШАБЛОНЫ, ДЛЯ КОМАНД," +
            "РЕСУРСЫ, ТАРИФЫ, ВОЙТИ, НАЧАТЬ БКСПЛАТНО'")
    @Tag("ui")
    void verificationHeaderMainPageTest() {
        mainPage.openPage()
                .verificationHeaderMainPage();
    }

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("При клике на 'Тарифы' происходит переход на страницу с тарифами")
    @Tag("ui")
    void openPricingPageWhenClickPriceTest() {
        mainPage.openPage()
                .openPricingPage();
    }

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("При клике на 'Войти' переходим на страницу Войти")
    @Tag("ui")
    void openLoginPageWhenClickLoginTest() {
        mainPage.openPage()
                .openLoginPage();
        loginPage.verificationOpenLoginPage();

    }

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("При клике на 'Начать бесплатно' переходим на страницу Регистрации")
    @Tag("ui")
    void openSignupPageWhenClickSignupTest() {
        mainPage.openPage()
                .openSignupPage();
        signupPage.verificationOpenSignupPage();
    }
}
