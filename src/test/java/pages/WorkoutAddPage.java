package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WorkoutAddPage {

    public void openPage() {
        open("/WorkoutAdd");
    }

    public void isOpened() {
        $("div#noneselected").shouldBe(Condition.visible);
    }

    public void createNewRunWorkout(String workoutDay, String workoutTime, String workoutName, String description,
                                    String plannedDistance, String plannedDistanceType, String plannedDuration, String distance,
                                    String distanceType, String duration, String paceType, String overallPlace, String ageGroupPlace,
                                    String perceivedEffort, String minHR, String avgHR, String maxHR, String burnedkCal) {
        $("a[data-code='run']").click();
        $("#WorkoutDate").clear();
        $("#WorkoutDate").sendKeys(workoutDay);
        $("#WorkoutTime").sendKeys(workoutTime);
        $("#Name").sendKeys(workoutName);
        $("#Desc").sendKeys(description);
        $("#PlannedWorkout").click();
        $("#PDuration").sendKeys(plannedDuration);
        $("#PDistance").sendKeys(plannedDistance);
        $("#PDistType").selectOptionByValue(plannedDistanceType);//dropdown
        $("#Distance").sendKeys(distance);
        $("#DistType").selectOptionByValue(distanceType);//dropdown
        $("#Duration").sendKeys(duration);
        $("#DistType").sendKeys(distanceType);
        $("#PaceType").selectOptionByValue(paceType);
        $("#IsRace").click();
        $("#OverallPlace").sendKeys(overallPlace);
        $("#AgeGroupPlace").sendKeys(ageGroupPlace);
        $("#hf_normal").click();
        $("#PerEffort").selectOptionByValue(perceivedEffort);//dropdown
        $("#MinHR").sendKeys(minHR);
        $("#AvgHR").sendKeys(avgHR);
        $("#MaxHR").sendKeys(maxHR);
        $("#kCal").sendKeys(burnedkCal);
        $("#saveButton").click();
        $("a#WorkoutEditLink .dropdown-toggle").shouldBe(Condition.visible);
        $(By.xpath("//div[text()='Test Workout']")).shouldBe(Condition.visible);
    }


}
