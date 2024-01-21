package automation.tests.tests;

import automation.tests.HomePage;
import automation.tests.runner.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginAccountTest extends BaseTest {

    public WebDriver driver;
    private static final String BASE_URL = "https://www.demo.guru99.com/V4/";


    @Test
    public void testLogin() {
        String homePage = new HomePage(getDriver())
                .scroollPage()
                .setLogin()
                .submitForm()
                .getTitleOfPage();


        Assert.assertEquals(homePage, "Guru99 Bank Manager HomePage");


    }


}
