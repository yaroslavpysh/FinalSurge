package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TextArea {

    String label;

    public TextArea(String label) {
        this.label = label;

    }

    public void write(String text) {
        $(By.xpath(String.format("//textarea/../*[text()='%s']/following-sibling::textarea", label))).clear();
        $(By.xpath(String.format("//textarea/../*[text()='%s']/following-sibling::textarea", label))).sendKeys(text);
    }

}
