package com.talentlms.UI.tests;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.helperMethods.BaseHelper;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NambaFoodTest extends BaseHelper {


    @Test
    public void TestNamba() {

        driverMethods.goOpenWebSite("https://nambafood.kg/?language=ru");

        WebElement eda = Driver.getDriver().findElement(By.xpath("(//a[@class='menu-link '])[1]"));
        eda.click();
        helper.pause(3000);
        browserHelper.goBack();
        helper.pause(3000);
        browserHelper.goForward();
        helper.pause(3000);
        browserHelper.refresh();
    }

    @Test
    public void TestDemoQA(){
        driverMethods.goOpenWebSite("https://demoqa.com/browser-windows");

    }
}
