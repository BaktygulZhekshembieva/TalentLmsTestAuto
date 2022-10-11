package stepDefinitions;

import com.talentlms.UI.helperMathods.Helper;
import com.talentlms.UI.pages.AdminHomePage;
import com.talentlms.UI.pages.LoginPage;

public abstract class BaseTest {

    protected LoginPage loginPage = new LoginPage();
    protected Helper helper = new Helper();
    protected AdminHomePage adminHomePage = new AdminHomePage();
}
