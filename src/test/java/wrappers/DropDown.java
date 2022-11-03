package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDown {

    String label;

    public DropDown(String label) {
        this.label = label;

    }

    public void select(String text) {
        $(By.xpath(String.format("//label[text()='%s']/..//select[not(ancestor::div[@style='display: none;'])]", label)))
                .selectOptionByValue(text);
    }

}

