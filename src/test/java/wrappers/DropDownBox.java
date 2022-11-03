package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDownBox {
    String label;

    public DropDownBox(String label) {
        this.label = label;

    }

    public void click() {
        $(By.xpath(String.format("//h4[text()='%s']/parent::div[@class='w-box-header']", label))).scrollIntoView(false)
                .click();
    }

}
