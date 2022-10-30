import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * возвращает href из первой статьи
     */

    public String getHrefFromFirstArticle() {
        return articleTitles.first().getAttribute("href");
    }
}
