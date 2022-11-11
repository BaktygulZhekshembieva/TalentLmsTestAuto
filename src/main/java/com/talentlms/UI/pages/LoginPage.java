package com.talentlms.UI.pages;

import com.talentlms.UI.dataProvider.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name=\"login\"]")
    public WebElement userNameOrEmailInput;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name=\"submit\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//img[@class=\"avatar-square\"]")
    public WebElement avatar;
    @FindBy(xpath = "(//a[@href=\"https://baktygul.talentlms.com/user/create\"])[2]")
    private WebElement addNewUserButton;

    public LoginPage login(String url){
        driver.get(url);
        inputUserNameOrEmail(ConfigReader.getProperty("username"))
                .inputPassword(ConfigReader.getProperty("password"));
        clickLoginBotton();
        return this;
    }

    public LoginPage inputUserNameOrEmail(String userNameOrEmail){
        helper.sendKeys(userNameOrEmailInput,userNameOrEmail);
        return this;
    }

    public LoginPage inputPassword(String password){
        helper.sendKeys(passwordInput,password);
        return this;
    }

    public LoginPage clickLoginBotton(){
        helper.click(loginButton);
        return this;
    }

    public LoginPage clickAvatar(){
        helper.click(avatar);
        return this;
    }

    public LoginPage goToAddNewUserPage(){
        helper.click(addNewUserButton);
        return this;
    }
}