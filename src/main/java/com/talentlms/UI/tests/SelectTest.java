package com.talentlms.UI.tests;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.helperMethods.DropDownHelper;
import com.talentlms.UI.helperMethods.Helper;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectTest {

    @Test
    public void test1() {
        Driver.getDriver().get("https://qa.imoving.com/");
        WebElement element = Driver.getDriver().findElement(By.id("houseTypeSelectList"));
        DropDownHelper.selectUsingIndex(element, 2);
    }

//    LoginPage loginPage = new LoginPage();
//    @Test
//    public void addCourse(){
//        Driver.getDriver().get("https://baktygul.talentlms.com/index");
//        loginPage.inputUserNameOrEmail(ConfigReader.getProperty("username"));
//        loginPage.inputPassword(ConfigReader.getProperty("password"));
//
//    }

    @Test
    public void amazon() {
        Driver.getDriver().get("https://www.amazon.com/");
        Helper helper = new Helper();
        WebElement amazonCurrency = Driver.getDriver().findElement(By.xpath(".//a[text()='Amazon Currency Converter']"));
//        helper.javascriptScrollDownThePage();
        helper.jsClick(amazonCurrency);
    }

    @Test
    public void imoving(){
        Driver.getDriver().get("https://www.imoving.com/");
        Helper helper = new Helper();
        WebElement aboutUs = Driver.getDriver().findElement(By.xpath("//a[text()='About Us']"));
//        aboutUs.click(); // метод селениум
        helper.jsClick(aboutUs); //метод jsExecutor
    }
}
