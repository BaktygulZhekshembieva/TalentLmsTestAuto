package myTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TalentLMSTest {

    @Test
    public void TeamTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app.talentlms.com/login");

        WebElement domain=driver.findElement(By.xpath("//input[@name='domain']"));
        domain.sendKeys("theateam");

        WebElement userName=driver.findElement(By.xpath("//input[@name='login']"));
        userName.sendKeys("Team1");
        WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys("TheATeam1@");
        WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
        login.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement administrator=driver.findElement(By.xpath("//a[@href='https://theateam.talentlms.com/dashboard/index/role:administrator']"));
        administrator.click();


        WebElement users=driver.findElement(By.xpath("(//a[@href='https://theateam.talentlms.com/user/index/gridPref:reset'])[2]"));
        users.click();

        WebElement addUser=driver.findElement(By.xpath("(//a[@href='https://theateam.talentlms.com/user/create'])[2]"));
        addUser.click();

        WebElement FirstNameInput= driver.findElement(By.xpath("//input[@name='name']"));
        FirstNameInput.sendKeys("James");

        WebElement LastNameInput= driver.findElement(By.xpath("//input[@name='surname']"));
        LastNameInput.sendKeys("Bond");

        WebElement emailInput= driver.findElement(By.xpath("//input[@placeholder='e.g. jdoe@example.com']"));
        emailInput.sendKeys("James00@gmail.com");

        WebElement UsernameInput= driver.findElement(By.xpath("//input[@placeholder='e.g. jdoe']"));
        UsernameInput.sendKeys("");

        WebElement passwordInput= driver.findElement(By.xpath("//input[@placeholder='Blank for random password']"));
        passwordInput.sendKeys("1234$Jbond");


        WebElement bioInput= driver.findElement(By.xpath("//textarea[@name='description']"));
        bioInput.sendKeys(" is a British literary and film character. He is often depicted as a peerless spy. He is also designated as agent 007 ");


        WebElement chooseUserType=driver.findElement(By.xpath("//a[@class='select2-choice']"));
        chooseUserType.click();
        chooseUserType.sendKeys("L");
        chooseUserType.sendKeys(Keys.ENTER);

//        chooseUserType.sendKeys("Learner-Type");
//        chooseUserType.sendKeys(Keys.ENTER);

//        WebElement userTypes = driver.findElement(By.xpath("(//span[@class='select2-match'])[2]"));
//        userTypes.click();

//        Select leanerTypes = new Select(driver.findElement(By.xpath("(//span[@class=\"select2-match\"])[4]")));
//        leanerTypes.selectByVisibleText("Learner-Types");


        WebElement timesZoneClick= driver.findElement(By.xpath("//div[@id='s2id_135425876']"));
        timesZoneClick.click();

        WebElement pole = driver.findElement(By.xpath("(//input[@type=\"text\"])[14]"));
        pole.sendKeys("Alm");
        pole.sendKeys(Keys.ENTER);



        timesZoneClick.sendKeys("Alm");
        timesZoneClick.sendKeys(Keys.ENTER);

//        WebElement times = driver.findElement(By.xpath("(//li[@class=\"select2-results-dept-0 select2-result select2-result-selectable\"])[110]"));
//        times.click();


//        WebElement Languageclick= driver.findElement(By.xpath("(//div[@class='select2-container tl-select2'])[3]"));
//        Languageclick.click();
////        Languageclick.sendKeys("English");
////        Languageclick.sendKeys(Keys.ENTER);
//
//        WebElement language = driver.findElement(By.xpath("(//div[@class=\"select2-result-label\"])[1]"));
//        language.click();
//
//        WebElement Activeclick= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
//        Activeclick.click();
//
//        WebElement addUsers=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
//        //  addUsers.click();

    }
}
