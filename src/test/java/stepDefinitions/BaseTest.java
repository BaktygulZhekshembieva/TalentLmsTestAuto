package stepDefinitions;

import com.talentlms.UI.helperMethods.FluentWait1;
import com.talentlms.UI.helperMethods.Helper;
import com.talentlms.UI.pages.AddNewUserPage;
import com.talentlms.UI.pages.AdminHomePage;
import com.talentlms.UI.pages.BasePage;
import com.talentlms.UI.pages.LoginPage;

public abstract class BaseTest extends BasePage {

    protected LoginPage loginPage = new LoginPage();
    protected Helper helper = new Helper();
    protected AdminHomePage adminHomePage = new AdminHomePage();
    protected AddNewUserPage addNewUserPage = new AddNewUserPage();
    FluentWait1 fluentWait1 = new FluentWait1();
}
