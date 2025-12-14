package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class ButtonsPage extends BasePage {
    // More specific selector for the Click Me button
    private final SelenideElement clickMeButton = $("button.btn-primary");
    private final SelenideElement clickMessage = $("#dynamicClickMessage");

    public void clickClickMe() {
        System.out.println("Clicking the 'Click Me' button...");
        clickMeButton.shouldBe(visible).click();
    }

    public String getMessage() {
        return clickMessage.shouldBe(visible).getText();
    }
}
