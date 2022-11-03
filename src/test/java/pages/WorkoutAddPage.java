package pages;

import com.codeborne.selenide.Condition;
import dto.Workout;
import org.openqa.selenium.By;
import wrappers.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WorkoutAddPage {

    public void openPage() {
        open("/WorkoutAdd");
    }

    public void isOpened() {
        $("div#noneselected").shouldBe(Condition.visible);
    }

    public void createNewRunWorkout(Workout workout) {
        new TypeSelector(workout.getWorkoutType()).select();
        $(By.xpath("//a[text()='Hills']")).click();
//       $("#WorkoutDate").clear();
//       new Input("Date").write(workout.getWorkoutDate());
        new Input("Time of Day").write(workout.getWorkoutTime());
        new Input("Workout Name").write(workout.getWorkoutName());
        new TextArea("Workout Description").write(workout.getDescription());
        new CheckBox("PlannedWorkout").select();
        new Input("Planned Duration").write(workout.getPlannedDuration());
        new Input("Planned Distance").write(workout.getPlannedDistance());
        new DropDown("Distance").select(workout.getDistanceType());
        new Input("Distance").write(workout.getDistance());
        new Input("Duration").write(workout.getDuration());
        new Input("Duration").write(workout.getDuration());
        new DropDown("Pace").select(workout.getPaceType());
        new CheckBox("IsRace").select();
        new Input("Overall Place").write(workout.getOverallPlace());
        new Input("Age Group Place").write(workout.getAgeGroupPlace());
        new RadioButton("How I Felt").select(workout.getRadioButtonName());
        new DropDown("Perceived Effort").select(workout.getPerceivedEffort());
        new Input("Min HR").write(workout.getMinHR());
        new Input("Avg HR").write(workout.getAvgHR());
        new Input("Max HR").write(workout.getMaxHR());
        new Input("Calories Burned").write(workout.getBurnedkCal());
        new DropDownBox("Post Workout Notes & Results").click();
        new TextArea("Post Workout Notes/Results").write(workout.getPostWorkoutNotesResults());
        new DropDownBox("Weather").click();
        new CheckBox("Sunny").select();
        new DropDown("Temperature").select(workout.getTemperatureType());
        new Input("Temperature").write(workout.getTemperature());
        new Input("Humidity").write(workout.getHumidity());
        $("#saveButton").click();
        $("a#WorkoutEditLink .dropdown-toggle").shouldBe(Condition.visible);
        $(By.xpath("//div[text()='Test Workout']")).shouldBe(Condition.visible);
    }

    public void createNewBikeWorkout(Workout workout) {
        new TypeSelector(workout.getWorkoutType()).select();
//        $("#WorkoutDate").clear();
//        new Input("Date").write(workout.getWorkoutDate());
        new Input("Time of Day").write(workout.getWorkoutTime());
        new Input("Workout Name").write(workout.getWorkoutName());
        new TextArea("Workout Description").write(workout.getDescription());
        new CheckBox("PlannedWorkout").select();
        new Input("Planned Duration").write(workout.getPlannedDuration());
        new Input("Planned Distance").write(workout.getPlannedDistance());
        new DropDown("Distance").select(workout.getDistanceType());
        new Input("Distance").write(workout.getDistance());
        new Input("Duration").write(workout.getDuration());
        new Input("Duration").write(workout.getDuration());
        new DropDown("Pace").select(workout.getPaceType());
        new DropDown("Elevation Gain").select(workout.getElevationGainType());
        new Input("Elevation Gain").write(workout.getElevationGain());
        new DropDown("Elevation Loss").select(workout.getElevationLossType());
        new Input("Elevation Loss").write(workout.getElevationLoss());
        new CheckBox("IsRace").select();
        new Input("Overall Place").write(workout.getOverallPlace());
        new Input("Age Group Place").write(workout.getAgeGroupPlace());
        new RadioButton("How I Felt").select(workout.getRadioButtonName());
        new DropDown("Perceived Effort").select(workout.getPerceivedEffort());
        new Input("Avg Power").write(workout.getAvgPower());
        new Input("Max Power").write(workout.getMaxPower());
        new Input("Avg Cadence").write(workout.getAvgCadence());
        new Input("Max Cadence").write(workout.getMaxCadence());
        new Input("Min HR").write(workout.getMinHR());
        new Input("Avg HR").write(workout.getAvgHR());
        new Input("Max HR").write(workout.getMaxHR());
        new Input("Calories Burned").write(workout.getBurnedkCal());
        new DropDownBox("Post Workout Notes & Results").click();
        new TextArea("Post Workout Notes/Results").write(workout.getPostWorkoutNotesResults());
        new DropDownBox("Weather").click();
        new CheckBox("Sunny").select();
        new DropDown("Temperature").select(workout.getTemperatureType());
        new Input("Temperature").write(workout.getTemperature());
        new Input("Humidity").write(workout.getHumidity());
        $("#saveButton").click();
        $("a#WorkoutEditLink .dropdown-toggle").shouldBe(Condition.visible);
        $(By.xpath("//div[text()='Test Workout']")).shouldBe(Condition.visible);
    }

    public void createNewTransitionWorkout(Workout workout) {
        new TypeSelector(workout.getWorkoutType()).select();
//        $("#WorkoutDate").clear();
//        new Input("Date").write(workout.getWorkoutDate());
        new Input("Time of Day").write(workout.getWorkoutTime());
        new Input("Workout Name").write(workout.getWorkoutName());
        new TextArea("Workout Description").write(workout.getDescription());
        new CheckBox("PlannedWorkout").select();
        new Input("Planned Duration").write(workout.getPlannedDuration());
        new Input("Planned Distance").write(workout.getPlannedDistance());
        new DropDown("Distance").select(workout.getDistanceType());
        new Input("Distance").write(workout.getDistance());
        new Input("Duration").write(workout.getDuration());
        new Input("Duration").write(workout.getDuration());
        new DropDown("Pace").select(workout.getPaceType());
        new DropDown("Elevation Gain").select(workout.getElevationGainType());
        new Input("Elevation Gain").write(workout.getElevationGain());
        new DropDown("Elevation Loss").select(workout.getElevationLossType());
        new Input("Elevation Loss").write(workout.getElevationLoss());
        new RadioButton("How I Felt").select(workout.getRadioButtonName());
        new DropDown("Perceived Effort").select(workout.getPerceivedEffort());
        new Input("Avg Power").write(workout.getAvgPower());
        new Input("Max Power").write(workout.getMaxPower());
        new Input("Avg Cadence").write(workout.getAvgCadence());
        new Input("Max Cadence").write(workout.getMaxCadence());
        new Input("Min HR").write(workout.getMinHR());
        new Input("Avg HR").write(workout.getAvgHR());
        new Input("Max HR").write(workout.getMaxHR());
        new Input("Calories Burned").write(workout.getBurnedkCal());
        new DropDownBox("Post Workout Notes & Results").click();
        new TextArea("Post Workout Notes/Results").write(workout.getPostWorkoutNotesResults());
        new DropDownBox("Weather").click();
        new CheckBox("Sunny").select();
        new DropDown("Temperature").select(workout.getTemperatureType());
        new Input("Temperature").write(workout.getTemperature());
        new Input("Humidity").write(workout.getHumidity());
        $("#saveButton").click();
        $("a#WorkoutEditLink .dropdown-toggle").shouldBe(Condition.visible);
        $(By.xpath("//div[text()='Test Workout']")).shouldBe(Condition.visible);
    }

}
