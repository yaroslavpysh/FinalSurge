package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import dto.Workout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import wrappers.Input;
import wrappers.TextArea;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class CalendarPage {

    public void openPage() {
        open("/Calendar");
    }

    public void isOpened() {
        $("div#CalendarContent").shouldBe(Condition.visible);
    }

    public void addWorkout(Workout workout) {

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

    public void updateWorkout(Workout workout, String changedWorkoutName){
        $(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName()))).click();
        $(By.xpath("//div[contains(@class,'dropdown')][contains(@class,'open')]/ul/li/a[text()='Update Workout']"))
                .click();
        new Input("Workout Name").write(changedWorkoutName);
        $("#saveButton").click();
        $(By.xpath(String.format("//div[text()='%s']", changedWorkoutName))).shouldBe(Condition.visible);
    }

    //Selenide dragAndDropTo doesn't work
    public void dragAndDropWorkout(Workout workout, String todayDataDay, String changedDataDay) {
        WebDriver driver = getWebDriver();
        Actions actions = new Actions(driver);

        int amountWorkoutsBeforeDragAndDrop = $$(By.xpath(String.format("//td[@data-day='%s']//div[@data-title='%s']",
                        todayDataDay, workout.getWorkoutName())))
                .size();

        actions.clickAndHold(driver.findElement(By.xpath(String.format("//td[@data-day='%s']//div[@data-title='%s']",
                        todayDataDay, workout.getWorkoutName()))))
                .moveToElement(driver.findElement(By.xpath(String.format("//td[@data-day='%s']", changedDataDay))))
                .release()
                .build()
                .perform();

        $$(By.xpath(String.format("//td[@data-day='%s']//div[@data-title='%s']", todayDataDay, workout.getWorkoutName())))
                .shouldHave(CollectionCondition.size(amountWorkoutsBeforeDragAndDrop - 1));
    }

    public void painAndInjury(Workout workout) {
        $(By.xpath(String.format("//div[@data-title='%s']", workout.getWorkoutName()))).click();
        $(By.xpath("//div[contains(@class,'dropdown')][contains(@class,'open')]/ul/li/a[text()='Pain & Injury']"))
                .click();
        switchTo().frame("PainInjuryFrame").findElement(By.xpath("//div[@class='dot-inner-hover']")).click();
        new TextArea("Pain Notes").write(workout.getDescription());
        $(By.xpath("//input[@id='painPointSave']")).click();
        switchTo().defaultContent();
        $("div#PainInjuryModal a.close-reveal-modal").click();
        refresh();
        $(By.xpath(String.format("//div[@data-title='%s']/div/i[contains(@class,'medical-case')]", workout.getWorkoutName()))).click();
    }

    public void deleteAllWorkouts() {
        int amountWorkoutsBeforeDelete = $$(By.xpath("//div[@data-title]")).size();
        while (amountWorkoutsBeforeDelete != 0) {
            $(By.xpath("//div[@data-title]")).click();
            $(By.xpath("//div[contains(@class,'dropdown')][contains(@class,'open')]/ul/li/a[text()='Delete']"))
                    .click();
            $(By.xpath("//div[@class='modal-footer']/a[text()='OK']")).click();
            amountWorkoutsBeforeDelete--;
        }
        $$(By.xpath(("//div[@data-title]")))
                .shouldBe(CollectionCondition.empty);
    }
}



