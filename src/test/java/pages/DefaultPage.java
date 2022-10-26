package pages;

import com.codeborne.selenide.Condition;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DefaultPage {

    public void openPage() {
        open("/Default");
    }

    public void isOpened() {
        $("#LayoutProfilePic").shouldBe(Condition.visible);
    }


}

