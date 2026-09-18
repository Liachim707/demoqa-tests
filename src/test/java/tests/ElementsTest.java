package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

class ElementsTest {

    @Test
    void textBoxShouldBePresent() {
        open("https://demoqa.com/elements");

        $x("//div[contains(@class, 'element-list')]//span[text()='Text Box']")
                .shouldBe(visible);
    }
}