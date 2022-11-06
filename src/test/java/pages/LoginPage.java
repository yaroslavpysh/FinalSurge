package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import wrappers.Input;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public void openPage() {
        open("/login");
    }

    public void isOpened() {
        $(By.xpath("button[@type='submit'][contains(text(),'Login')]")).shouldBe(Condition.visible);
    }

    public void login(String email, String password) {
        $("login_name").sendKeys(email);
        $("login_password").sendKeys(password);
         $("button[type='submit']").click();
    }
}
