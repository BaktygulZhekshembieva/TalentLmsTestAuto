package com.talentlms.UI.helperMethods;

import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver;

    public AlertHelper(WebDriver driver){
        this.driver = driver;
    }

    public Alert getAlert(){ //переключение на алерт
        return driver.switchTo().alert();
    }

    public void acceptAlert(){ //ok
        getAlert().accept();
    }

    public void dismissAlert(){ //отмена
        getAlert().dismiss();
    }

//    public boolean isAlertPresent(){
////        try {
////            driver.switchTo().alert().accept();
////            return true;
////        }catch (NoAlertPresentException e){
////            return false;
////        }
////    }


    public boolean isAlertPresent(){
        try {
           WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
           wait.until(ExpectedConditions.alertIsPresent());
           return true;
        }catch (NoAlertPresentException e){
           return false;
        }
    }
    public void acceptPrompt(String txt){
//        if (!isAlertPresent())
//            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.accept();
    }
}
