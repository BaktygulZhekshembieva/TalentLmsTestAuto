package com.talentlms.UI.helperMethods;

import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class BrowserHelper {
    private WebDriver driver;

    public BrowserHelper(WebDriver driver){
        this.driver = driver;
    }

    /*
    Navigating to previos page
    */
    public void goBack(){
        driver.navigate().back();
    }

    /*
   Navigating to forward page
   */
    public void goForward(){
        driver.navigate().forward();
    }

    /*
   Refreshing the page
   */
    public void refresh(){
        driver.navigate().refresh();
    }

    /*
   Counting window amount and storing in Set
   */
    public Set<String> getWindows(){
        return driver.getWindowHandles();
    }

    /**
     Switches between windows(tabs) with index
     * @param index
     * @throws IllegalArgumentException in case of invalid value
     */
    public void switchToWindow(int index){

        LinkedList<String> windowId = new LinkedList<>(getWindows());

        if (index < 0 || index > windowId.size())
            throw new IllegalArgumentException("Invalid Index " + index);

        driver.switchTo().window(windowId.get(index));
    }



    public void switchToParentWindow(){
        LinkedList<String> windowId = new LinkedList<>(getWindows());

        driver.switchTo().window(windowId.get(0));
    }
}
