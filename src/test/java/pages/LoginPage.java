package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    @Step("Opening Login page")
    public void openPage() {
        open("/login");
    }

    public void isOpened() {
        $(By.xpath("button[@type='submit'][contains(text(),'Login')]")).shouldBe(Condition.visible);
    }

    @Step("Login")
    public void login(String email, String password) {
        $("#login_name").sendKeys(email);
        $("#login_password").sendKeys(password);
        $("button[type='submit']").click();
    }
}
