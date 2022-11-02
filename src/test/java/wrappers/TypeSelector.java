package wrappers;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TypeSelector {

    String typeName;

    public TypeSelector(String label) {
        this.typeName = label;

    }

    public void select() {
        $(By.xpath(String.format("//a[contains(text(),'%s')]", typeName))).click();

    }
}
