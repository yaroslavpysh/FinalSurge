package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import dto.Workout;
import org.openqa.selenium.By;
import wrappers.Input;

import static com.codeborne.selenide.Selenide.*;


public class CalendarPage {

    public void openPage() {
        open("/Calendar");
    }

    public void isOpened() {
        $("div#CalendarContent").shouldBe(Condition.visible);
    }

    public void deleteWorkout(Workout workout) {

        int amountWorkoutsBeforeDelete = $$(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName()))).size();
        $(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName()))).click();
        $(By.xpath("//div[contains(@class,'dropdown')][contains(@class,'open')]/ul/li/a[text()='Delete']"))
                .click();
        $(By.xpath("//div[@class='modal-footer']/a[text()='OK']")).click();
        $$(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName())))
                .shouldHave(CollectionCondition.size(amountWorkoutsBeforeDelete - 1));
    }

    public void updateWorkout(Workout workout, String changedName){
        $(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName()))).click();
        $(By.xpath("//div[contains(@class,'dropdown')][contains(@class,'open')]/ul/li/a[text()='Update Workout']"))
                .click();
        new Input("Workout Name").write(changedName);
        $("#saveButton").click();
        $(By.xpath(String.format("//div[text()='%s']", changedName))).shouldBe(Condition.visible);
    }

    public void dragAndDropWorkout(Workout workout) {
        int amountWorkoutsBeforeDragAndDrop = $$(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName()))).size();
        $(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName()))).dragAndDropTo($("td[data-day='4']"));
        $$(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName())))
                .shouldHave(CollectionCondition.size(amountWorkoutsBeforeDragAndDrop - 1));

    }



}



