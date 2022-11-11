package com.talentlms.UI.helperMethods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class AssertHelper {

    static Helper helper = new Helper();

    public static void assertText(String expectedText, WebElement element){
        helper.waitElementToBeDisplayed(element);
        Assertions.assertEquals(expectedText,helper.getText(element));
    }


}
