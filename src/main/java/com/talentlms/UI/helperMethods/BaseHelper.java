package com.talentlms.UI.helperMethods;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.driverFactory.DriverMethods;

public abstract class BaseHelper {

    protected DriverMethods driverMethods =new DriverMethods(Driver.getDriver());
    protected Helper helper = new Helper();
    protected BrowserHelper browserHelper = new BrowserHelper(Driver.getDriver());
}
