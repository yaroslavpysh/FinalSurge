package tests;


import org.testng.annotations.Test;

public class OtherCalculatorTest extends BaseTest{

    @Test
    public void otherPaceCalculator() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        defaultPage.calculatePace();
    }
}
