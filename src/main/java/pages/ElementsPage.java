package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class ElementsPage extends BasePage {
    // More specific selector for the Buttons menu
    private final SelenideElement buttonsMenu = $("div.element-list.collapse.show ul.menu-list li#item-4");

    public void clickButtonsMenu() {
        System.out.println("Clicking on Buttons menu...");
        buttonsMenu.shouldBe(visible).click();
    }
}
