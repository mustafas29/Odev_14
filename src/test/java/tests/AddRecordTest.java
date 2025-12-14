package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRecordModal;
import pages.WebTablesPage;

public class AddRecordTest extends TestBase {

    @Test
    public void addAndEditRecordTest() {
        WebTablesPage table = new WebTablesPage();
        AddRecordModal modal = new AddRecordModal();

        table.openUrl("https://demoqa.com/webtables");

        table.clickAdd();
        modal.fill("Mustafa", "Sengul", "test@test.com", "35", "5000", "QA");

        Assert.assertTrue(table.getFirstCellText().contains("Mustafa"));

        table.clickEdit();
        modal.updateDepartment("Automation");

        Assert.assertTrue(table.getFirstCellText().contains("Automation"));
    }
}
