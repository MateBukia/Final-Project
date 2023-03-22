package AccCreationPage_Tests;

import Pageobject.Accountcreation_page;
import Pageobject.EnterAccouninfo_page;
import Pageobject.Signuplogin_page;
import Stepobject.Createaccounpage_steps;
import Stepobject.Enteraccinfo_steps;
import Stepobject.Signuploginpage_steps;
import Utils.Signuploginpage_starter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dataobject.EnterAccountinfo_pagedata.*;
import static Dataobject.EnterAccountinfo_pagedata.mymobilenumber;
import static Dataobject.Signuplogin_pageData.myemail;
import static Dataobject.Signuplogin_pageData.mypassword;

public class Acccreation_test extends Signuploginpage_starter {
    Stepobject.Enteraccinfo_steps Enteraccinfo_steps = new Enteraccinfo_steps();
    Pageobject.EnterAccouninfo_page EnterAccouninfo_page = new EnterAccouninfo_page();
    Pageobject.Signuplogin_page Signuplogin_page = new Signuplogin_page();
    Stepobject.Signuploginpage_steps Signuploginpage_steps = new Signuploginpage_steps();
    Stepobject.Createaccounpage_steps Createaccounpage_steps = new Createaccounpage_steps();
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Register new user")
    public void Newuserregister_Acccreationpage() {
        Assert.assertTrue(Signuplogin_page.newusersignup.is(Condition.visible),"New User Signup! check");
        Signuploginpage_steps.Nameinput();
        Assert.assertEquals(Signuplogin_page.name.getValue(),myname,"Name Check");
        Signuploginpage_steps.Emailinput_1();
        Assert.assertEquals(Signuplogin_page.email_1.getValue(),myemail ,"Email Check");
        Signuploginpage_steps.Signupbtn();
        Assert.assertTrue(EnterAccouninfo_page.accinfo.is(Condition.visible),"Enter account information page check");
        Enteraccinfo_steps.Genderinput();
        Assert.assertTrue(EnterAccouninfo_page.gender_1.isSelected(),"Check box check");
        Assert.assertEquals(EnterAccouninfo_page.name.getValue(),myname, "Name check");
        Assert.assertEquals(EnterAccouninfo_page.email.getValue(),myemail, "Email check");
        Enteraccinfo_steps.Passwordinput();
        Assert.assertEquals(EnterAccouninfo_page.password.getValue(),mypassword,"Password check");
        Enteraccinfo_steps.Dayinput();
        Assert.assertEquals(EnterAccouninfo_page.days.getValue(),daynum,"Days check");
        Enteraccinfo_steps.Monthinput();
        Assert.assertEquals(EnterAccouninfo_page.months.getText(),monthvalue,"Month check");
        Enteraccinfo_steps.Yearinput();
        Assert.assertEquals(EnterAccouninfo_page.years.getValue(),yearsnum,"Month check");
        Enteraccinfo_steps.Optininput();
        Assert.assertTrue(EnterAccouninfo_page.optin.isSelected(),"Optin box check");
        Enteraccinfo_steps.Firstnameinput();
        Assert.assertEquals(EnterAccouninfo_page.firstname.getValue(),myfirstname,"First Name check");
        Enteraccinfo_steps.Lastnameinput();
        Assert.assertEquals(EnterAccouninfo_page.lastname.getValue(),mylastname,"Last Name check");
        Enteraccinfo_steps.Companyinput();
        Assert.assertEquals(EnterAccouninfo_page.company.getValue(),mycompany,"Company check");
        Enteraccinfo_steps.Addressinput();
        Assert.assertEquals(EnterAccouninfo_page.address.getValue(),myaddress,"Address check");
        Enteraccinfo_steps.Address_2input();
        Assert.assertEquals(EnterAccouninfo_page.address_2.getValue(),myaddress_2,"Address_2 check");
        Enteraccinfo_steps.Countryinput();
        Assert.assertEquals(EnterAccouninfo_page.country.getValue(),mycountry,"Country check");
        Enteraccinfo_steps.Stateinput();
        Assert.assertEquals(EnterAccouninfo_page.state.getValue(),mystate,"State check");
        Enteraccinfo_steps.Cityinput();
        Assert.assertEquals(EnterAccouninfo_page.city.getValue(),mycity,"City check");
        Enteraccinfo_steps.Zipcodeinput();
        Assert.assertEquals(EnterAccouninfo_page.zipcode.getValue(),myzipcode,"Zipcode check");
        Enteraccinfo_steps.Mobilenuminput();
        Assert.assertEquals(EnterAccouninfo_page.mobilenumber.getValue(),mymobilenumber,"Mobilenumber check");
        Enteraccinfo_steps.Createclick();
        Assert.assertTrue(Accountcreation_page.accountcreationmsg.is(Condition.visible),"Account creation message");
        Createaccounpage_steps.continuecreation();
    }
}
