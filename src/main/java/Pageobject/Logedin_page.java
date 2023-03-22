package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Logedin_page {

    public SelenideElement
                           continueshopping = $(byText("Continue Shopping")),
                           myproductview = $(byAttribute("data-product-id", "1"));
}
