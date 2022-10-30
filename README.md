# selenideStudy1
selenium-java selenide webdrivermanager junit

Проект написан на основе данного видео Oleh Pendrak
https://www.youtube.com/watch?v=IGaAZWmqZEE&list=PLS-CH047rQ3U8iIUIb9gm3cyf9kbOSasP

selenium-java selenide webdrivermanager junit

По уроку Олега Пендрака https://www.youtube.com/watch?v=IGaAZWmqZEE&list=PLS-CH047rQ3U8iIUIb9gm3cyf9kbOSasP&index=4

Задача тест кейса:
1) открыть сайт appleinsider.ru
2) нажать на кнопку поиска сверху справа
3) ввести текст "Чем iPhone 13 отличается от iPhone 12" и нажать enter
4) в найденных статьях получить href атрибут первой найденной статьи
5) убедиться, что href ссылка содержит слово iPhone 13 (обрати вниание как это слово выглядт в href ссылке)

Шаги:
1) создать проект
2) добавить зависимости в pom
   pom
   selenium-java selenide webdrivermanager junit

    1. selenium-java
    2. selenium-chrome-driver
    3. selenide - улучшенный селениум под джаву. Инициализация элементов страницы без доп методов (без pageFactory)
    4. webdrivermanager - упрощение работы с веб драйвером
    5. junit
3) core/BaseTest - инициализация и настройка selenide (тип браузера, разрешение экрана и другие доп методы)
   три метода:
   настройки браузера public void setUp()
   открыть браузер @Before public void init() {setUp()}
   закрыть браузер @After public void tearDown()
4) создать тест AppleTest extends BaseTest - наследует BaseTest
   создать константы - неизменные переменные
   создать тест @Test
5) создать page по каждой странице сайта, где будет тестироваться логика