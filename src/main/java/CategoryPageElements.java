import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPageElements {
    SelenideElement laptopsCategory = $(
            By.xpath("//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted']"));

}
