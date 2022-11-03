package tests;

import dto.Workout;

import org.testng.annotations.Test;
import pages.WorkoutAddPage;

public class CalendarTest extends BaseTest {
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
    public void updateWorkout(){
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
        calendarPage.openPage();
        calendarPage.isOpened();
        calendarPage.updateWorkout(workoutRun,"TestWorkout1");
    }

}
