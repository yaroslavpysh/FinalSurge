package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Workout {
    String workoutType;
    String workoutDate;
    String workoutTime;
    String workoutName;
    String description;
    String isPlannedWorkout;
    String plannedDistance;
    String plannedDistanceType;
    String plannedDuration;
    String distance;
    String distanceType;
    String duration;
    String paceType;
    String isRace;
    String overallPlace;
    String ageGroupPlace;
    String radioButtonName;
    String perceivedEffort;
    String minHR;
    String avgHR;
    String maxHR;
    String burnedkCal;
    String postWorkoutNotesResults;
    String temperature;
    String temperatureType;
    String humidity;
    String elevationGain;
    String elevationGainType;
    String elevationLoss;
    String elevationLossType;
    String avgPower;
    String maxPower;
    String avgCadence;
    String maxCadence;
    String comments;

}
