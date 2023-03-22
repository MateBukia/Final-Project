package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Accountcreation_page {
   public static SelenideElement
                    accountcreationmsg = $(byText("Congratulations! Your new account has been successfully created!")),
                    continueing = $(byText("Continue"));
}
