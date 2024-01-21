package automation.tests;

import automation.tests.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class HomePage extends BasePage {
    private static final String USER_ID = "mngr548824";
    private static final String PASSWORD = "tArabAq";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "uid")
    WebElement id;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "btnLogin")
    WebElement buttonSubmit;

    @FindBy(xpath = "//*[@id='save']")
    WebElement acceptCookies;

    @FindBy(id = "gdpr-consent-notice")
    WebElement iFrame;


    public HomePage setLogin() {
        id.clear();
        id.sendKeys(USER_ID);
        password.clear();
        password.sendKeys(PASSWORD);
        getDriver().switchTo().frame(iFrame);
        acceptCookies.click();


        return this;
    }

    public HomePage submitForm() {
        getWait5();
        WebElement until = getWait2().until(ExpectedConditions.elementToBeClickable(buttonSubmit));
        until.click();
        return this;
    }

    public HomePage scroollPage() {
        getActions().scrollByAmount(10, 1000);
        getActions().perform();

        return this;
    }


    public String getTitleOfPage() {

        return getDriver().getTitle();
    }
}
