package automation.tests;

import automation.tests.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ManagerPage extends BasePage {
    public ManagerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//tr[@class = \"heading3\"]/td")
    WebElement managerId;




    public String getManagerId() {
        WebElement untilManagerAppear = getWait2().until(ExpectedConditions.visibilityOf(managerId));

       return untilManagerAppear.getText();
    }
}
