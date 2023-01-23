# Проект по автоматизации тестирования для Aston
<a target="_blank" href="https://astondevs.com/">Вэб сайт Aston</a>

## :scroll: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## 🔧 Используемые технологии:

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images_for_project/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images_for_project/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images_for_project/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images_for_project/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images_for_project/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images_for_project/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images_for_project/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images_for_project/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images_for_project/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :clipboard: Реализованные проверки:

- ✓ Проверка элементов главного меню.
- ✓ Проверка элементов меню в футере страницы.
- ✓ Проверка элемента 'Карьера' в главном меню.
- ✓ Проверка ссылки 'Карьера' в элементах подменю Карьера.
- ✓ Проверка работоспособнсти элемента меню 'Узнать стоимость'.
- ✓ Проверка работоспособности кнопки 'Отправьте нам сообщение'.

## <img src="images_for_project/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/C16-Denis_Antonov_0_0-unit14/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C16-Denis_Antonov_0_0-unit14/"><img src="images_for_project/Jenkins_build.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 100.0)
- browserSize (размер окна браузера, по умолчанию 1024x768)
- remoteUrl (логин, пароль и адрес удаленного сервера selenoid)

## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean test
```

Удаленный запуск в Jenkins:
```bash
clean
test
-Dremote_url=${REMOTE_URL}
-Dbrowser=${BROWSER}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser_size=${BROWSER_SIZE}
```

## <img src="images_for_project/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C16-Denis_Antonov_0_0-unit14/7/allure/#">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images_for_project/Allure_report_overview.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images_for_project/Allure_report_tests.png">
</p>

### Графики

<p align="center">
<img title="Allure Graphics" src="images_for_project/Allure_report_grafics.png">
</p>


## <img src="images_for_project/Telegram.svg" width="25" height="25"  alt="Telegram"/></a> Уведомление в Telegram

<p align="center">
<img title="Telegram" src="images_for_project/Telegram_notification.png">
</p>

### <img src="images/Selenoid.svg" width="25" height="25"  alt="Selenoid video"/></a> Видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images_for_project/video_for_project.gif" width="700" height="500"  alt="video"> 
</p>


