package tests;

import dto.Workout;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.WorkoutAddPage;

public class CalendarTest extends BaseTest {

    private static String TODAY_DATA_DAY= "7";

    @Test
    public void deleteWorkout() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
        calendarPage.openPage();
        calendarPage.isOpened();
        calendarPage.deleteWorkout(workoutRun);
    }

    @Test
    public void updateWorkout() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
        calendarPage.openPage();
        calendarPage.isOpened();
        calendarPage.updateWorkout(workoutRun, "TestWorkout1");
    }

    @Test
    public void reportPainAndInjury() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
        calendarPage.openPage();
        calendarPage.isOpened();
        calendarPage.painAndInjury(workoutRun);
    }

    @Test
    public void dragAndDropWorkout() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
        calendarPage.openPage();
        calendarPage.isOpened();
        calendarPage.dragAndDropWorkout(workoutRun, TODAY_DATA_DAY, "4");
    }
    @Ignore
    @Test(enabled = false, priority = 1)
    public void deleteAllWorkouts()
    {
        loginPage.openPage();
        loginPage.login(email, password);
        calendarPage.openPage();
        calendarPage.deleteAllWorkouts();
    }
}
