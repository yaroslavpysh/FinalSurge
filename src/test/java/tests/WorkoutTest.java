package tests;

import org.testng.annotations.Test;

public class WorkoutTest extends BaseTest{

    @Test
    public void addRunWorkout() {
        loginPage.openPage();
        loginPage.login("yaroslav_15@tut.by", "BlaBla123");
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        workoutAddPage.createNewRunWorkout("10/23/2022","06:00 AM", "Test Workout",
                "BLABLA", "10", "km", "01:12:12", "10",
                "km","01:20:00", "km", "1","30", "1", "8",
                "100", "120", "1000");



    }
}
