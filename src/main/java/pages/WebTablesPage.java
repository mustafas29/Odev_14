package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage {

    private final SelenideElement addButton = $("#addNewRecordButton");
    private final SelenideElement editButton = $("span[title='Edit']");
    private final SelenideElement firstCell = $("div.rt-td");

    public void clickAdd() { addButton.click(); }
    public void clickEdit() { editButton.click(); }
    public String getFirstCellText() { return firstCell.getText(); }
}
