package tests;

import dto.Workout;

public class WorkoutFactory {

    public static Workout get(String workoutType){
        return Workout
                .builder()
                .workoutType(workoutType)
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
                .radioButtonName("Good")
                .perceivedEffort("1")
                .minHR("80")
                .avgHR("100")
                .maxHR("120")
                .burnedkCal("1000")
                .build();
    }
}
