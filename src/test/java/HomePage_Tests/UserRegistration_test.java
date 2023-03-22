package HomePage_Tests;

import Stepobject.Homepage_steps;
import Utils.Chromerunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class UserRegistration_test extends Chromerunner {

Stepobject.Homepage_steps Homepage_steps = new Homepage_steps();
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Register new user")
    public void Userregister() {

        Homepage_steps.Homepagevisible();
        Homepage_steps.signuploginclick();
    }
}