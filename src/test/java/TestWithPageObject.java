import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestWithPageObject {

    @BeforeMethod
    public void before() {
        Configuration.browserSize = "1200x800";
        Configuration.timeout = 5000;
        open("https://rozetka.com.ua/");

    }

    @Test
    public void testSelenide() {
        new MainPageLogic().clickOnCategoryJS()
                .clickCategory(new CategoryPageLogic().laptopsCategory)
                .checkingTitleQuantity(60);
    }
}
