package pages;

import org.openqa.selenium.By;

public class CheckoutOverviewPage extends BasePage {

    private final By finishBtn = By.cssSelector("[data-test='finish']");

    public void clickFinish() {
        click(finishBtn);
    }
}