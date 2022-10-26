package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Workout {

    String workoutDate;
    String workoutTime;
    String workoutName;
    String description;
    String plannedDistance;
    String plannedDistanceType;
    String plannedDuration;
    String distance;
    String distanceType;
    String duration;
    String paceType;
    String overallPlace;
    String ageGroupPlace;
    String perceivedEffort;
    String minHR;
    String avgHR;
    String maxHR;
    String burnedkCal;
}
