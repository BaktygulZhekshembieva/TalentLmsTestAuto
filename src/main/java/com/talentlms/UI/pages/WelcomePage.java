package com.talentlms.UI.pages;

import com.talentlms.UI.helperMathods.Helper;
import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage{

    @FindBy(xpath = "(//div[@class=\"d-col tl-onboarding-end-screen-title\"])[2]")
    public WebElement welcomeTitle;

    @FindBy(xpath = "(//div[@class=\"tl-onboarding-end-item tl-onboarding-end-item--hoverable\"])[3]")
    public WebElement adminDashboard;

//    public WelcomePage clickAdminDashboard(){
//        helper.click(adminDashboard);
//        return this;
//    }

}
