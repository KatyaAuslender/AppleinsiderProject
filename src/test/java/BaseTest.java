import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

// abstract - от него можно только наследоваться. Не сможем создать экземпляр класса.
// обшая конструкция для других тестовых классов
abstract public class BaseTest {
// метод для настройки, инициализации и установки браузера
    public void setUp() {
        //используем библиотеку webdrivermanager для установки вебраузера
        //метод setup - одной строкой скачаем вебдрайвер, автоматически укажем путь и осуществим настройки
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome"; // необходимо указать конфигурацию браузера
        Configuration.driverManagerEnabled = true; //говорим селениду, что у нас используется библа webDriverManager
        //размер окна нашего браузераю Желательно указать размер монитора
        Configuration.browserSize = "1920x1080";
        //headless будем ли мы видеть выполнение теста
        Configuration.headless = false;
    }
    //методы до и после каждого теста
    //до
    @Before
    public void init() {
        //перед каждым запуском тестов будет происходить инициализация вебрайвера
        setUp();
    }
    //после
//    @After
//    public void tearDown() {
//        //закрыть вебрайвер
//        Selenide.closeWebDriver();
//    }
}
