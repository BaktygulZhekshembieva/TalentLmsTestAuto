package stepDefinitions;

import com.talentlms.UI.dataProvider.ConfigReader;
import com.talentlms.UI.driverFactory.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginSteps extends BaseTest{

    @Given("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("qaEnv"));
    }

    @Given("Enter {string} in userName or Email input field")
    public void enter_in_user_name_or_email_input_field(String userNameOrEmail) {
        loginPage.inputUserNameOrEmail(userNameOrEmail);
    }

    @Given("Enter {string} in password input field")
    public void enter_in_password_input_field(String password) {
        loginPage.inputPassword(password);
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginBotton();
    }

    @Then("user should logged in")
    public void user_should_logged_in() {
//        Assertions.assertEquals("Home", helper.getText(adminHomePage.adminHomeTitle));
            Assertions.assertEquals("Home", adminHomePage.adminHomeTitle.getText());
            fluentWait1.fluentWaitUnitclickable(By.xpath("//div[@class='tl-bold-link'])[1]"));
    }


}
