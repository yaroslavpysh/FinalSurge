package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Input {

    String label;

    public Input(String label) {
        this.label = label;

    }

    public void write(String text) {
        $(By.xpath(String.format("//label[text()='%s']/..//input[not(ancestor::div[@style='display: none;'])]", label)))
                .sendKeys(text);
    }
}
