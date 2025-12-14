package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class AddRecordModal extends BasePage {

    private final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");
    private final SelenideElement email = $("#userEmail");
    private final SelenideElement age = $("#age");
    private final SelenideElement salary = $("#salary");
    private final SelenideElement department = $("#department");
    private final SelenideElement submit = $("#submit");

    public void fill(String f, String l, String e, String a, String s, String d) {
        firstName.setValue(f);
        lastName.setValue(l);
        email.setValue(e);
        age.setValue(a);
        salary.setValue(s);
        department.setValue(d);
        submit.click();
    }

    public void updateDepartment(String newDept) {
        department.clear();
        department.setValue(newDept);
        submit.click();
    }
}
