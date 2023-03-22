package SignupLoginPage_Tests;

import Pageobject.Signuplogin_page;
import Stepobject.Homepage_steps;
import Stepobject.Signupuserpage_steps;
import Utils.Chromerunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.Signuplogin_pageData.*;

public class LoginUnexistinguser_test extends Chromerunner {
    Stepobject.Homepage_steps Homepage_steps = new Homepage_steps();
    Pageobject.Signuplogin_page Signuplogin_page = new Signuplogin_page();
    Signupuserpage_steps Signupuserpage_steps = new Signupuserpage_steps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("login with not existing password and email")
    public void Unexistingemail_pswd(){
        Homepage_steps.signuploginclick();
        Assert.assertTrue(Signuplogin_page.logintoyouracc.is(Condition.visible),"Signup / Login page check");
        Signupuserpage_steps.IncorrectEmailinput();
        Assert.assertEquals(Signuplogin_page.email_0.getValue(),myincorrectemail,"Email input check");
        Signupuserpage_steps.Incorrectpswdinput();
        Assert.assertEquals(Signuplogin_page.loginpassword.getValue(),myincorrectpassword,"Password input check");
        Signupuserpage_steps.loginbtn();
        Assert.assertTrue(Signuplogin_page.Errormsg.is(Condition.visible),"Error message check");
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("login with not existing password")
    public void Unexistingpswd(){
        Homepage_steps.signuploginclick();
        Assert.assertTrue(Signuplogin_page.logintoyouracc.is(Condition.visible),"Signup / Login page check");
        Signupuserpage_steps.Emailinput_0();
        Assert.assertEquals(Signuplogin_page.email_0.getValue(),myemail,"Email input check");
        Signupuserpage_steps.Incorrectpswdinput();
        Assert.assertEquals(Signuplogin_page.loginpassword.getValue(),myincorrectpassword,"Password input check");
        Signupuserpage_steps.loginbtn();
        Assert.assertTrue(Signuplogin_page.Errormsg.is(Condition.visible),"Error message check");
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("login with not existing email")
    public void Unexistingemail(){
        Homepage_steps.signuploginclick();
        Assert.assertTrue(Signuplogin_page.logintoyouracc.is(Condition.visible),"Signup / Login page check");
        Signupuserpage_steps.IncorrectEmailinput();
        Assert.assertEquals(Signuplogin_page.email_0.getValue(),myincorrectemail,"Email input check");
        Signupuserpage_steps.Passwordinput();
        Assert.assertEquals(Signuplogin_page.loginpassword.getValue(),mypassword,"Password input check");
        Signupuserpage_steps.loginbtn();
        Assert.assertTrue(Signuplogin_page.Errormsg.is(Condition.visible),"Error message check");
    }
}
