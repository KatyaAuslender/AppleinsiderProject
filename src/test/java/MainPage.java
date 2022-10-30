/**
 * Главная страница сайта https://appleinsider.ru
 */

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.xpath;

public class MainPage {

    // конструктор - вызывается сразу после создания класса
    // Создается, чтобы сразу после создания экземпляра класса открывалась ссылка (url аргумент)
    public MainPage(String url){
        Selenide.open(url);
    }

    // конопка поиска с лупой
    private final SelenideElement searchButton = $x("//form");
    // поле для написания текста для поиска
    public final SelenideElement textBoxInput = $x("//input[@name='s']");


    // метод кликнуть на элемент
    public void clickOnSearch() { searchButton.click(); }

    /**
     * Выполняется поиск среди статей и нажимается кнопка Enter
     * @param searchString поисковая строка
     */

    // метод вписать значение и нажать Enter
    public void search(String searchString) {
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
    }



}
