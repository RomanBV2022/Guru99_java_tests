package automation.tests.tests;

import automation.tests.HomePage;
import automation.tests.runner.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginAccountTest extends BaseTest {

    public WebDriver driver;
    private static final String MANAGER_ID = "Manger Id : mngr548824";


    @Test(priority = 0, alwaysRun = true)
    public void testLogin() {
        String homePage = new HomePage(getDriver())
                .scroollPage()
                .setLoginID()
                .setLoginPassword()
                .submitForm()
                .getTitleOfPage();


        Assert.assertEquals(homePage, "Guru99 Bank Manager HomePage");

    }

    @Test(priority = 1)
    public void testVerifyManager() {
        String getManagerID = new HomePage(getDriver())
                .scroollPage()
                .setLoginID()
                .setLoginPassword()
                .submitForm()
                .goToManagerPage()
                .getManagerId();

        Assert.assertEquals(getManagerID, MANAGER_ID);


    }

    @Test(priority = 10)
    public void invalidIdLogin() {
        String getInvalidMessage = new HomePage(getDriver())
                .scroollPage()
                .setInvalidLoginID()
                .setLoginPassword()
                .submitForm()
                .invalidMessage();


        Assert.assertEquals(getInvalidMessage, "User or Password is not valid");

    }


}
