package tests;


import dto.Workout;
import org.testng.annotations.Test;
import pages.WorkoutAddPage;

public class OtherCalculatorTest extends BaseTest{

    @Test
    public void otherPaceCalculator() {
        loginPage.openPage();
        loginPage.login(email, password);
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
        defaultPage.openPage();
        defaultPage.isOpened();
        defaultPage.calculatePace();
    }
}
