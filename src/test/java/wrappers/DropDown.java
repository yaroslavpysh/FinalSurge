package wrappers;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

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

