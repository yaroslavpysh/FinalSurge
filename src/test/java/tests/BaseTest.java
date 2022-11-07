package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.CalendarPage;
import pages.DefaultPage;
import pages.LoginPage;
import pages.WorkoutAddPage;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Listeners(TestListener.class)
public class BaseTest {
    String email;
    String password;
    LoginPage loginPage;
    DefaultPage defaultPage;
    WorkoutAddPage workoutAddPage;
    CalendarPage calendarPage;

    @Parameters({"browser"})
    @BeforeMethod(description = "Opening browser")
    public void setup(@Optional("firefox") String browser, ITestContext testContext) {
        if(browser.equals("chrome")){
            Configuration.browser = "chrome";
        } else if(browser.equals("firefox")){
            Configuration.browser = "firefox";
        }
        Configuration.baseUrl = ("https://log.finalsurge.com");
        email = System.getProperty("EMAIL", PropertyReader.getProperty("email"));
        password = System.getProperty("PASSWORD", PropertyReader.getProperty("password"));
        Configuration.headless = true;
        Configuration.timeout = 10000;

        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        workoutAddPage = new WorkoutAddPage();
        calendarPage = new CalendarPage();
        open();
        getWebDriver().manage().window().maximize();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        WebDriver driver = getWebDriver();
        testContext.setAttribute("driver", driver);


    }

    @AfterMethod(description = "Closing browser", alwaysRun = true)
    public void close() {
        if (getWebDriver() != null)
            getWebDriver().quit();

    }
}

