## Учебный проект по автоматизации тестирования (Web UI)
<a name="Ссылка"></a>
### Веб сайт <a target="_blank" href="https://todoist.com/">todoist.com</a>

<p align="center">
<img title="Сайт todoist.com" src="images/screen/todoist_screen.png">
</p>

## :maple_leaf: Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Atlassian Jira
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

## :maple_leaf: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="images/logo/jira-logo.svg" width="50" height="50"  alt="Atlassian Jira"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :maple_leaf: Список проверок, реализованных в автотестах

- [x] Проверка загрузки главной станицы
- [x] Проверка наличия элементов меню на главной станице
- [x] Проверка кликабельности элементов меню на главной станице
- [x] Проверка авторизации пользователя с валидными данными логина и пароля
- [x] Проверка кликабельности элементов меню на странице авторизации станице
- [x] Проверка авторизации пользователя с пустыми полями логина и пароля


## :maple_leaf: Список проверок, реализованных в ручных тестах

- [x] Проверка отображения стоимости тарифов на странице Тарифы 
- [x] Проверка выбора валюты оплаты на странице Тарифы

## :maple_leaf: Запуск тестов

###  Локальный запуск :
Пример командной строки:
```bash
gradle clean test -Denv=remote
gradle clean test -Denv=local
```
Получение отчёта:
```bash
allure serve build/allure-results
```

###  Удаленный запуск (в Jenkins):
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/021-bulatov-UI/">проект</a>

![This is an image](images/screen/Jenkins_1.png)

2. Выбрать пункт **Собрать с параметрами**
3. В случае необходимости изменить параметры, выбрав значения из выпадающих списков
4. Нажать **Собрать**
5. Результат запуска сборки можно посмотреть в отчёте Allure

![This is an image](images/screen/Jenkins_2.png)

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/021-bulatov-UI/16/allure/">Allure report</a>

###  Главное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/screen/Allure_Report_1.png">
</p>

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screen/Allure_Report_2.png">
</p>

###  Графики

<p align="center">
<img title="Allure Graphics" src="images/screen/Allure_Report_3.png">
</p>


## <img src="images/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/20672">Allure TestOps</a>
### Общий список всех кейсов: ручных и авто
<p align="center">
<img title="Allure Graphics" src="images/screen/Allure_Testops_1.png">
</p>

### Dashboard с общими результатами тестирования
<p align="center">
<img title="Allure Graphics" src="images/screen/Allure_Testops_4.png">
</p>

### Пример отчёта выполнения одного из автотестов
<p align="center">
<img title="Allure Graphics" src="images/screen/Allure_Testops_5.png">
</p>

## <img src="images/logo/jira-logo.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-600">Atlassian Jira</a>
<p align="center">
<img title="Jira" src="images/screen/Jira_1.png">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram о результатах прогона тестов

<p align="center">
<img title="Allure Overview Dashboard" src="images/screen/telegramBot.png" >
</p>

## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Selenoid"/></a> Видео прохождения тестов
<p align="center">
<img src="images/video/videoTests.gif" alt="video"/></a>
</p>

[Вернуться к оглавлению ⬆](#Ссылка)