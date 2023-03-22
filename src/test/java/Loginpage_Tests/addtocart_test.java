package Loginpage_Tests;

import Dataobject.Signuplogin_pageData;
import Pageobject.Signuplogin_page;
import Stepobject.Logedinpage_steps;
import Stepobject.Signuploginpage_steps;
import Stepobject.Signupuserpage_steps;
import Utils.Signuploginpage_starter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.Signuplogin_pageData.myname;
import static Dataobject.Signuplogin_pageData.mypassword;

public class addtocart_test extends Signuploginpage_starter {
    Pageobject.Signuplogin_page Signuplogin_page = new Signuplogin_page();
    Stepobject.Signuploginpage_steps Signuploginpage_steps = new Signuploginpage_steps();
    Stepobject.Signupuserpage_steps Signupuserpage_steps = new Signupuserpage_steps();
    Stepobject.Logedinpage_steps Logedinpage_steps = new Logedinpage_steps();
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Register new user")
    public void addproducttocart() {

        Assert.assertTrue(Signuplogin_page.logintoyouracc.is(Condition.visible),"Signup / Login page check");
        Signupuserpage_steps.Emailinput_0();
        Assert.assertEquals(Signuplogin_page.email_0.getValue(), Signuplogin_pageData.myemail,"Email Check");
        Signupuserpage_steps.Passwordinput();
        Assert.assertEquals(Signuplogin_page.loginpassword.getValue(),mypassword,"Password Check");
        Signupuserpage_steps.loginbtn();
        Assert.assertEquals(Signuplogin_page.loginuser.getText(),myname,"Logged in Check");
        Logedinpage_steps.logintoview();
        Logedinpage_steps.taketocart();
    }
}
