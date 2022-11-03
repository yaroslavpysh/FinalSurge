package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CalendarPage;
import pages.DefaultPage;
import pages.LoginPage;
import pages.WorkoutAddPage;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    String email;
    String password;
    LoginPage loginPage;
    DefaultPage defaultPage;
    WorkoutAddPage workoutAddPage;
    CalendarPage calendarPage;

    @BeforeMethod
    public void setup() {

        Configuration.baseUrl = PropertyReader.getProperty("finalsurge.url");
        email = PropertyReader.getProperty("finalsurge.email");
        password = PropertyReader.getProperty("finalsurge.password");
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.timeout = 10000;

        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        workoutAddPage = new WorkoutAddPage();
        calendarPage = new CalendarPage();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

        open();
        getWebDriver().manage().window().maximize();

    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if (getWebDriver() != null)
            getWebDriver().quit();

    }
}

