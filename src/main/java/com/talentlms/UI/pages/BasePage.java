package com.talentlms.UI.pages;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.helperMathods.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    Helper helper = new Helper();
    protected WebDriver driver = Driver.getDriver();


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
