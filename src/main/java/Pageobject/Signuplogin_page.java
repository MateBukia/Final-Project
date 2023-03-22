package Pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Dataobject.Signuplogin_pageData.myname;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Signuplogin_page {
   public SelenideElement
            name = $(By.name("name")),
            email_1= $(By.name("email"),1),
            password = $(By.id("password")),
            Signup = $(byText("Signup")),
            Login = $(byText("Signup / Login")),
            logintoyouracc = $(byText("Login to your account")),
            newusersignup = $(byText("New User Signup!")),
            loginuser = $(byText(myname)),
            email_0= $(By.name("email"),0),
            login = $(byText("Login")),
            loginpassword = $(By.name("password")),
            logout = $(byText("Logout")),
            Errormsg = $(byText("Your email or password is incorrect!")),
            Signuperrormsg = $(byText("Email Address already exist!"));

}
