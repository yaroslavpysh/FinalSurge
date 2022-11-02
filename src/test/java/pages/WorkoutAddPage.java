package pages;

import com.codeborne.selenide.Condition;
import dto.Workout;
import org.openqa.selenium.By;
import wrappers.*;

import javax.swing.*;

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
//        $("#WorkoutDate").clear();
//        new Input("Date").write(workout.getWorkoutDate());
        new Input("Time of Day").write(workout.getWorkoutTime());
        new Input("Workout Name").write(workout.getWorkoutName());
        new TextArea("Workout Description").write(workout.getDescription());
        new CheckBox("PlannedWorkout").select();
//        $("#PlannedWorkout").click();//checkbox wrapper
        new Input("Planned Duration").write(workout.getPlannedDuration());
        new Input("Planned Distance").write(workout.getPlannedDistance());
        new DropDown("Distance").select(workout.getDistanceType());
        new Input("Distance").write(workout.getDistance());
        new Input("Duration").write(workout.getDuration());
        new Input("Duration").write(workout.getDuration());
        new DropDown("Pace").select(workout.getPaceType());
        new CheckBox("IsRace").select();
//        $("#IsRace").click();//checkbox wrapper
        new Input("Overall Place").write(workout.getOverallPlace());
        new Input("Age Group Place").write(workout.getAgeGroupPlace());
        new RadioButton("How I Felt").select(workout.getRadioButtonName());
//        $("#hf_normal").click();//radio wrapper
        new DropDown("Perceived Effort").select(workout.getPerceivedEffort());
        new Input("Min HR").write(workout.getMinHR());
        new Input("Avg HR").write(workout.getAvgHR());
        new Input("Max HR").write(workout.getMaxHR());
        new Input("Calories Burned").write(workout.getBurnedkCal());
        $("#saveButton").click();
        $("a#WorkoutEditLink .dropdown-toggle").shouldBe(Condition.visible);
        $(By.xpath("//div[text()='Test Workout']")).shouldBe(Condition.visible);
    }


}
