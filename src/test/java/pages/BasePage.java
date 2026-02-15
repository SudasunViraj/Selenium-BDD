package pages;

import org.openqa.selenium.*;
import utils.DriverFactory;
import utils.WaitUtils;

public abstract class BasePage {

    protected WebDriver driver() {
        return DriverFactory.getDriver();
    }

    protected void type(By locator, String text) {
        WebElement el = WaitUtils.visible(driver(), locator);
        el.clear();
        el.sendKeys(text);
    }

    protected void click(By locator) {
        WaitUtils.clickable(driver(), locator).click();
    }

    protected boolean isDisplayed(By locator) {
        return WaitUtils.visible(driver(), locator).isDisplayed();
    }
}
