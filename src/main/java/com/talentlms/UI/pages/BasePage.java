package com.talentlms.UI.pages;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.helperMathods.Helper;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    Helper helper = new Helper();


}
