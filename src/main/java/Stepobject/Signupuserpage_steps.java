package Stepobject;

import Pageobject.Signuplogin_page;
import io.qameta.allure.Step;

import static Dataobject.Signuplogin_pageData.*;

public class Signupuserpage_steps extends Signuplogin_page {
/*    myemail myemail = new myemail();
    finalemail finalemail = new  finalemail();*/
    //ExistingUser
    @Step("Enter email to log in")
    public Signupuserpage_steps Emailinput_0() {
        email_0.setValue(myemail);
        return this;
    }
@Step("Enter password to login")
    public Signupuserpage_steps Passwordinput() {
        loginpassword.setValue(mypassword);
        return this;
    }
@Step("Click login button")
    public Signupuserpage_steps loginbtn() {
        login.click();
        return this;
    }
    @Step("click logout button")
    public Signupuserpage_steps logoutbtn() {
        logout.click();
        return this;
    }
    //UnexistingUser
    @Step("Enter incorrect email to login")
    public Signupuserpage_steps IncorrectEmailinput() {
        email_0.setValue(myincorrectemail);
        return this;
    }
    @Step("Enter incorrect password to log in")
    public Signupuserpage_steps Incorrectpswdinput() {
        loginpassword.setValue(myincorrectpassword);
        return this;
    }

}
