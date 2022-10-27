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
        Workout workoutRun = Workout
                .builder()
                .workoutDate("10/23/2022")
                .workoutTime("06:00 AM")
                .workoutName("Test Workout")
                .description("BLABLA")
                .plannedDuration("01:12:12")
                .plannedDistance("10")
                .plannedDistanceType("km")
                .distance("10")
                .distanceType("km")
                .duration("01:20:00")
                .paceType("km")
                .overallPlace("1")
                .ageGroupPlace("30")
                .perceivedEffort("1")
                .minHR("80")
                .avgHR("100")
                .maxHR("120")
                .burnedkCal("1000")
                .build();
        new WorkoutAddPage().createNewRunWorkout(workoutRun);
    }

}
