package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import wrappers.DropDown;
import wrappers.Input;

import static com.codeborne.selenide.Selenide.*;

public class DefaultPage {

    public void openPage() {
        open("/Default");
    }

    public void isOpened() {
        $("#LayoutProfilePic").shouldBe(Condition.visible);
    }

    public void calculatePace() {
        $(By.xpath("//a[@data-reveal-id='OtherCalc']")).click();
        switchTo().frame("OtherCalciFrame");
        $(By.xpath("//a[text()='Pace Calculator']")).click();
        new Input("Distance:").write("7");
        new DropDown("Distance:").select("km");
        $("#TimeMM").sendKeys("45");
        $("#TimeSS").sendKeys("55");
        $("#saveButtonSettings").click();
        $(By.xpath("//h4[text()='Pace Chart']")).shouldBe(Condition.visible);
        switchTo().defaultContent();
        $("div#OtherCalc a.close-reveal-modal").click();
    }
}

