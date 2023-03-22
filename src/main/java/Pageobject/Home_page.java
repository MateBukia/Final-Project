package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Home_page {
   public SelenideElement
                         home = $(byText("Home")),
                         signuploginbtn = $(byText("Signup / Login"));

}
