package Stepobject;

import Pageobject.Home_page;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class Homepage_steps extends Home_page {
@Step("Check if home page is visible")
    public Homepage_steps Homepagevisible() {
        home.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    @Step("Click the signup / login button")
    public Homepage_steps signuploginclick() {
        signuploginbtn.click();
        return this;
    }
}
