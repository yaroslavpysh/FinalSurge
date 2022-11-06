package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBox {

    String labelFor;

    public CheckBox(String labelFor) {
        this.labelFor = labelFor;
    }

    public void select() {
        $(By.xpath(String.format("//label[@for='%s']//input[@type='checkbox']", labelFor)))
                .click();
    }
}
