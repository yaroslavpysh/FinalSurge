package tests;

import dto.Workout;
import org.testng.annotations.Test;
import pages.WorkoutAddPage;

public class WorkoutTest extends BaseTest {

    @Test
    public void addRunWorkout() {
        loginPage.openPage();
        loginPage.login("yaroslav_15@tut.by", "BlaBla123");
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
    }

    @Test
    public void addBikeWorkout() {
        loginPage.openPage();
        loginPage.login("yaroslav_15@tut.by", "BlaBla123");
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutBike = WorkoutFactory.get("Bike");
        new WorkoutAddPage().createNewBikeWorkout(workoutBike);
    }

    @Test
    public void addTransitionWorkout() {
        loginPage.openPage();
        loginPage.login("yaroslav_15@tut.by", "BlaBla123");
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutTransition = WorkoutFactory.get("Transition");
        new WorkoutAddPage().createNewTransitionWorkout(workoutTransition);
    }
}
