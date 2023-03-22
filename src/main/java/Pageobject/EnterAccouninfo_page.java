package Pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class EnterAccouninfo_page  {
   public SelenideElement
                   gender_1 = $(By.id("id_gender1")),
                   gender_2 = $(By.id("id_gender2")),
                   name = $(By.id("name")),
                   email = $(By.id("email")),
                   password = $(By.id("password")),
                   months = $(By.id("months")),
                   years = $(By.id("years")),
                   days  = $(By.id("days")),
                   optin = $(By.id("optin")),
                   firstname = $(By.id("first_name")),
                   lastname = $(By.id("last_name")),
                   company = $(By.id("company")),
                   address = $(By.id("address1")),
                   address_2 = $(By.id("address2")),
                   country = $(By.id("country")),
                   state = $(By.id("state")),
                   city = $(By.id("city")),
                   zipcode = $(By.id("zipcode")),
                   mobilenumber = $(By.id("mobile_number")),
                   accinfo = $(byText("Enter Account Information")),
                   createaccount = $(byText("Create Account"));


}
