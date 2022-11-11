package com.talentlms.UI.driverFactory;

import org.openqa.selenium.WebDriver;

public class DriverMethods {

    private WebDriver driver;

    public DriverMethods(WebDriver driver){
        this.driver = driver;
    }

    public void goOpenWebSite(String url){
        driver.navigate().to(url);
    }
}
