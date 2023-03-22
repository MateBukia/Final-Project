package Stepobject;

import Pageobject.Signuplogin_page;
import io.qameta.allure.Step;

import static Dataobject.Signuplogin_pageData.myemail;
import static Dataobject.Signuplogin_pageData.myname;

public class Signuploginpage_steps extends Signuplogin_page {
@Step("Enbter name to sign up")
    public Signuploginpage_steps Nameinput() {
        name.setValue(myname);
        return this;

    }
@Step("Enter email to sign up")
    public Signuploginpage_steps Emailinput_1() {
        email_1.setValue(myemail);
        return this;
    }
@Step("Click the signup button")
    public Signuploginpage_steps Signupbtn() {
        Signup.click();
        return this;
    }

}