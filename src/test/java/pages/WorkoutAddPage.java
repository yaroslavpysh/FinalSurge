package pages;

import com.codeborne.selenide.Condition;
import dto.Workout;
import org.openqa.selenium.By;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

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
        $("a[data-code='run']").click();
        $("#WorkoutDate").clear();
        new Input("Date").write(workout.getWorkoutDate());
        new Input("Time of Day").write(workout.getWorkoutTime());
        new Input("Workout Name").write(workout.getWorkoutName());
        new TextArea("Workout Description").write(workout.getDescription());
        $("#PlannedWorkout").click();//checkbox wrapper
        new Input("Planned Duration").write(workout.getPlannedDuration());
        new Input("Planned Distance").write(workout.getPlannedDistance());
//        new DropDown("Distance").select(workout.getDistanceType());//не работает
        $("#Distance").sendKeys("10");
//        new Input("Distance").write(workout.getDistance());
        $("#DistType").selectOptionByValue("km");//dropdown
//        new Input("Distance").write(workout.getDistance());
//        new Input("Duration").write(workout.getDuration());
//        $("#Duration").sendKeys("10:20:00");
//        new Input("Duration").write(workout.getDuration());
//        $("#DistType").sendKeys(distanceType);
//        new DropDown("Pace").select(workout.getPaceType());
        $("#PaceType").selectOptionByValue("km");
        $("#IsRace").click();//checkbox wrapper
        new Input("Overall Place").write(workout.getOverallPlace());
        new Input("Age Group Place").write(workout.getAgeGroupPlace());
//        $("#OverallPlace").sendKeys(overallPlace);
//        $("#AgeGroupPlace").sendKeys(ageGroupPlace);
        $("#hf_normal").click();//radio wrapper
        new DropDown("Perceived Effort").select(workout.getPerceivedEffort());
//        $("Perceived Effort").selectOptionByValue(perceivedEffort);//dropdown
        new Input("Min HR").write(workout.getMinHR());
        new Input("Avg HR").write(workout.getAvgHR());
        new Input("Max HR").write(workout.getMaxHR());
        new Input("Calories Burned").write(workout.getBurnedkCal());
//        $("#MinHR").sendKeys(minHR);
//        $("#AvgHR").sendKeys(avgHR);
//        $("#MaxHR").sendKeys(maxHR);
//        $("#kCal").sendKeys(burnedkCal);
        $("#saveButton").click();
        $("a#WorkoutEditLink .dropdown-toggle").shouldBe(Condition.visible);
        $(By.xpath("//div[text()='Test Workout']")).shouldBe(Condition.visible);
    }


}
