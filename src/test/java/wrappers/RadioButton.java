package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RadioButton {

    String label;

    public RadioButton(String label) {
        this.label = label;
    }

    public void select(String text) {
        $(By.xpath(String.format("//label[text()='%s']/..//span[text()='%s']", label, text)))
                .click();
    }
}
