package SignupLoginPage_Tests;

import Pageobject.Signuplogin_page;
import Stepobject.Signuploginpage_steps;
import Utils.Signuploginpage_starter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.EnterAccountinfo_pagedata.myname;
import static Dataobject.Signuplogin_pageData.myemail;

public class RegisternewUser_test extends Signuploginpage_starter {
    Pageobject.Signuplogin_page Signuplogin_page = new Signuplogin_page();
    Stepobject.Signuploginpage_steps Signuploginpage_steps = new Signuploginpage_steps();
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Register new user")
    public void Newuserregister_Signuploginpage() {
        Assert.assertTrue(Signuplogin_page.newusersignup.is(Condition.visible),"New User Signup! check");
        Signuploginpage_steps.Nameinput();
        Assert.assertEquals(Signuplogin_page.name.getValue(),myname,"Name Check");
        Signuploginpage_steps.Emailinput_1();
        Assert.assertEquals(Signuplogin_page.email_1.getValue(),myemail ,"Email Check");
        Signuploginpage_steps.Signupbtn();
    }
}
