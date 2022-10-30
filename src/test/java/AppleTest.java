import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest {
    //вынесение переменных в константы
    // private - доступна только в этом классе
    // final - мы не можем переопределить эту переменную, не можем изменить
    // static эта переменная инициализируется до инициализации класса
    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";

    @Test
    public void checkHref() throws InterruptedException {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(SEARCH_STRING);

        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        System.out.println("Href первой статьи: " + href);
        //подключаем библу junit
        //библиотека сравнений в методе ассерт. Нужно убедиться, что href ссылка содержит слово iPhone 13
        Assert.assertTrue(href.contains("iphone-13"));
        System.out.println("Test ok!");
    }

}
