package Stepobject;

import Pageobject.Accountcreation_page;
import io.qameta.allure.Step;

public class Createaccounpage_steps extends Accountcreation_page {
@Step("Click on the continue button")
    public Createaccounpage_steps continuecreation(){
        continueing.click();
        return this;
    }
}
