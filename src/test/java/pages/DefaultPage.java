package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DefaultPage {

    public void openPage() {
        open("/Default");
    }

    @Step("Opening Default page")
    public void isOpened() {
        $("#LayoutProfilePic").shouldBe(Condition.visible);
    }


}

