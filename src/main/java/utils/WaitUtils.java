import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class WaitUtils {

    public static void waitForVisible(SelenideElement element) {
        element.shouldBe(visible);
    }

    public static void waitForClickable(SelenideElement element) {
        element.shouldBe(visible);
    }
}
