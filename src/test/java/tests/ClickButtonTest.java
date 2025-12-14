package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ButtonsPage;
import pages.ElementsPage;
import static com.codeborne.selenide.Selenide.*;

public class ClickButtonTest extends TestBase {

    @Test
    public void clickButtonTest() {
        // Sayfayı aç
        open("https://demoqa.com/elements");

        // Sayfa nesnelerini oluştur
        ElementsPage elements = new ElementsPage();
        ButtonsPage buttons = new ButtonsPage();

        // Butonlar menüsüne tıkla
        elements.clickButtonsMenu();

        // 'Click Me' butonuna tıkla
        buttons.clickClickMe();

        // Mesajı doğrula
        String actualMessage = buttons.getMessage();
        String expectedMessage = "You have done a dynamic click";

        Assert.assertEquals(actualMessage, expectedMessage,
                String.format("Beklenen mesaj: '%s', ancak alınan: '%s'", expectedMessage, actualMessage));
    }
}
