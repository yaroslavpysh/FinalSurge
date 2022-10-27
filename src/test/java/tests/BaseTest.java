package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DefaultPage;
import pages.LoginPage;
import pages.WorkoutAddPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;
    DefaultPage defaultPage;
    WorkoutAddPage workoutAddPage;

    @BeforeMethod
    public void setup() {

        Configuration.baseUrl = "https://log.finalsurge.com";
        Configuration.browser = "chrome";
//        Configuration.headless = true;
        Configuration.timeout = 10000;

        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        workoutAddPage = new WorkoutAddPage();
        open();
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if (getWebDriver() != null)
            getWebDriver().quit();

    }
}

