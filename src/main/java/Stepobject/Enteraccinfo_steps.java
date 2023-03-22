package Stepobject;

import Pageobject.EnterAccouninfo_page;
import io.qameta.allure.Step;

import static Dataobject.EnterAccountinfo_pagedata.*;



public class Enteraccinfo_steps extends EnterAccouninfo_page {
    @Step("Fill the gender checkbox")
    public Enteraccinfo_steps Genderinput() {
        gender_1.click();
       return this;
    }
    @Step("Send value to the password input")
    public Enteraccinfo_steps Passwordinput() {
        password.setValue(mypassword);
        return this;
    }
    @Step("Set day number")
    public Enteraccinfo_steps Dayinput() {
        days.sendKeys(daynum);
        return this;
    }
    @Step("Set month value")
    public Enteraccinfo_steps Monthinput() {
        months.sendKeys(monthvalue);
        return this;
    }
    @Step("Set year value")
    public Enteraccinfo_steps Yearinput() {
        years.sendKeys(yearsnum);
        return this;
    }
    @Step("Scroll into view")
    public Enteraccinfo_steps scrolldown() {
        optin.scrollIntoView(true);;
        return this;
    }
    @Step("Fil the optin checkbox")
    public Enteraccinfo_steps Optininput() {
        optin.click();
        return this;
    }
    @Step("Enter firstname")
    public Enteraccinfo_steps Firstnameinput() {
        firstname.setValue(myfirstname);
        return this;
    }
    @Step("Enter lastname")
    public Enteraccinfo_steps Lastnameinput() {
        lastname.setValue(mylastname);
        return this;
    }
    @Step("Enter company")
    public Enteraccinfo_steps Companyinput() {
        company.setValue(mycompany);
        return this;
    }
    @Step("Enter address")
    public Enteraccinfo_steps Addressinput() {
        address.setValue(myaddress);
        return this;
    }
    @Step("Enter address_2")
    public Enteraccinfo_steps Address_2input() {
        address_2.setValue(myaddress_2);
        return this;
    }
    @Step("Enter country")
    public Enteraccinfo_steps Countryinput() {
        country.sendKeys(mycountry);
        return this;
    }
    @Step("Enter state")
    public Enteraccinfo_steps Stateinput() {
        state.setValue(mystate);
        return this;
    }
    @Step("Enter city")
    public Enteraccinfo_steps Cityinput() {
        city.setValue(mycity);
        return this;
    }
    @Step("Enter zipcode")
    public Enteraccinfo_steps Zipcodeinput() {
        zipcode.setValue(myzipcode);
        return this;
    }@Step("Enter mobilenumber")
    public Enteraccinfo_steps Mobilenuminput() {
        mobilenumber.setValue(mymobilenumber);
        return this;
    }
    @Step("Click create account")
    public Enteraccinfo_steps Createclick() {
        createaccount.click();
        return this;
    }
}
