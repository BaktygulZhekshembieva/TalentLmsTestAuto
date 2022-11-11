package com.talentlms.UI.tests;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.helperMethods.AlertHelper;
import com.talentlms.UI.helperMethods.Helper;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertTest {

    @Test
    public void test1() {
        Helper helper = new Helper();
        AlertHelper alertHelper = new AlertHelper(Driver.getDriver());

        Driver.getDriver().get("https://demoqa.com/alerts");

        WebElement element1 = Driver.getDriver().findElement(By.xpath("//button[@id='alertButton']"));
//        helper.click(element1);
        element1.click();
        alertHelper.acceptAlert();


        WebElement element2 = Driver.getDriver().findElement(By.xpath("//button[@id='timerAlertButton']"));
//        helper.click(element2);
        element2.click();
        //1-способ ждать пока появится алерт
//        helper.pause(5000);

        //2-способ ждать пока появится алерт
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//        alertHelper.acceptAlert();

        //3-способ ждать пока появится алерт
        alertHelper.isAlertPresent();


        WebElement element3 = Driver.getDriver().findElement(By.xpath("//button[@id='confirmButton']"));
        element3.click();
        alertHelper.dismissAlert();

        element3.click();
        alertHelper.acceptAlert();

        WebElement element4 = Driver.getDriver().findElement(By.id("promtButton"));
        element4.click();
        alertHelper.dismissAlert();

        element4.click();
        alertHelper.acceptPrompt("Baktygul");

    }
}
