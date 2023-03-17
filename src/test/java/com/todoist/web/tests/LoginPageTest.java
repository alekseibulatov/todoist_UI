package com.todoist.web.tests;


import com.todoist.config.AuthConfig;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author alekseibulatov (Aleksei Bulatov)
 *
 *
 */

@Feature("LoginPage")
@DisplayName("Тестирование страницы авторизации")
public class LoginPageTest extends WebTestBase {

    static AuthConfig authConfig = ConfigFactory.create(AuthConfig.class);

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Авторизация на сайте  с корректным логином и паролем")
    @Tag("ui")
    void successLoginOnLoginPageTest() {
        loginPage.openLoginPage()
                .verificationOpenLoginPage()
                .setEmail(authConfig.login())
                .setPassword(authConfig.password())
                .ClickToButtonLogin();


        todayPage.closeTab();

        todayPage.verificationSuccessLoginOnTodayPage();

        todayPage.loginOut();
    }

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Авторизация на сайте без ввода логина и пароля")
    @Tag("ui")
    void unsuccessfulLoginOnLoginPageTest() {
        loginPage.openLoginPage()
                .verificationOpenLoginPage()
                .setEmail("")
                .setPassword("")
                .ClickToButtonLogin()
                .checkWhenEmptyLoginField();
    }

    @Test
    @Owner("alekseibulatov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка перехода по ссылке Гугл на странице авторизации")
    @Tag("ui")
    void switchToGoogleTest() {
        loginPage.openLoginPage()
                .clickToGoogleButton()
                .verificationOpenGooglePage();
    }
}
