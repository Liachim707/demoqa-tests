package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

class FormsTest {

    @Test
    void practiceFormShouldBePresent() {
        open("https://demoqa.com/forms");

        $x("//div[contains(@class, 'element-list')]//span[text()='Practice Form']")
                .shouldBe(visible);
    }
}