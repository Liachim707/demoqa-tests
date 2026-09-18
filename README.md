Для локального запуска тестов Elements и Forms в Chrome достаточно:

mvn test

Selenide сам управляет WebDriver и браузерной сессией.

Если нужно указать браузер Chrome, то команда будет выглядеть так:

mvn test -Dselenide.browser=chrome

Если нужно указать браузер Firefox, то команда будет выглядеть так:

mvn test -Dselenide.browser=firefox

Подключение Selenide к Selenoid:

Локальный запуск:

mvn test

Удалённый запуск:

mvn test -Dselenide.remote=http://localhost:4444/wd/hub

При втором варианте браузер будет запускаться внутри Selenoid.