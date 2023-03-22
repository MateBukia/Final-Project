package SignupLoginPage_Tests;

import Pageobject.Signuplogin_page;
import Stepobject.Homepage_steps;
import Stepobject.Signuploginpage_steps;
import Utils.Chromerunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.EnterAccountinfo_pagedata.*;


public class Registeruserwithexistingemail_test extends Chromerunner {
    Stepobject.Homepage_steps Homepage_steps = new Homepage_steps();
    Pageobject.Signuplogin_page Signuplogin_page = new Signuplogin_page();
    Stepobject.Signuploginpage_steps Signuploginpage_steps = new Signuploginpage_steps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("login with existing user")
    public void Existinguser(){
        Homepage_steps.Homepagevisible();
        Homepage_steps.signuploginclick();
        Assert.assertTrue(Signuplogin_page.newusersignup.is(Condition.visible),"New User Signup! check");
        Signuploginpage_steps.Nameinput();
        Assert.assertEquals(Signuplogin_page.name.getValue(),myname,"Name Check");
        Signuploginpage_steps.Emailinput_1();
        Assert.assertEquals(Signuplogin_page.email_1.getValue(),myemail,"Email Check");
        Signuploginpage_steps.Signupbtn();
        Assert.assertTrue(Signuplogin_page.Signuperrormsg.is(Condition.visible),"Error message check");

    }
}
