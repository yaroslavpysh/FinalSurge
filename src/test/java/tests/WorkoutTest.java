package tests;

import dto.Workout;
import org.testng.annotations.Test;
import pages.WorkoutAddPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WorkoutTest extends BaseTest {

    @Test
    public void addRunWorkout() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutRun = WorkoutFactory.get("Run");
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
    }

    @Test
    public void addBikeWorkout() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutBike = WorkoutFactory.get("Bike");
        new WorkoutAddPage().createNewBikeWorkout(workoutBike);
    }

    @Test
    public void addTransitionWorkout() {
        loginPage.openPage();
        loginPage.login(email, password);
        defaultPage.isOpened();
        workoutAddPage.openPage();
        workoutAddPage.isOpened();
        Workout workoutTransition = WorkoutFactory.get("Transition");
        new WorkoutAddPage().createNewTransitionWorkout(workoutTransition);
    }
    @Test
    public void asd(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
    }


}
