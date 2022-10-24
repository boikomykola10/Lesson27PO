import com.codeborne.selenide.CollectionCondition;

public class SearchPageLogic extends SearchPageElements {

    public SearchPageLogic checkingTitleQuantity(int size) {
        titles.shouldHave(CollectionCondition.size(size));
        return this;
    }
}
