package com.todoist.web.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.todoist.config.CredentialsConfig;
import com.todoist.config.WebDriverProvider;
import com.todoist.helpers.Attach;
import com.todoist.web.pages.LoginPage;
import com.todoist.web.pages.MainPage;
import com.todoist.web.pages.SignupPage;
import com.todoist.web.pages.TodayPage;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class WebTestBase {

    static CredentialsConfig credentialsConfig = ConfigFactory.create(CredentialsConfig.class);

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    TodayPage todayPage = new TodayPage();

    @Step("Выполняем настройку запуска")
    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
        Configuration.pageLoadTimeout = 15000;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @Step("Загрузка Attachments")
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
