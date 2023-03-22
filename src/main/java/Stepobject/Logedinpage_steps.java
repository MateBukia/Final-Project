package Stepobject;

import Pageobject.Logedin_page;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public class Logedinpage_steps extends Logedin_page {
    @Step("Scroll down to view product")
    public Logedinpage_steps logintoview(){
        myproductview.scrollIntoView(true);
        return this;
    }
    @Step("Select firs 4 products")
    public Logedinpage_steps taketocart() {
        for (int i = 1; i < 5; i++) {

           String b = Integer.toString(i);
            SelenideElement viewproduct = $(byAttribute("data-product-id", b));
            viewproduct.click();
            continueshopping.click();
        }
        return this;
    }

}
