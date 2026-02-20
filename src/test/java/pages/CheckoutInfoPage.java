package pages;

import org.openqa.selenium.By;

public class CheckoutInfoPage extends BasePage {

    private final By firstName = By.cssSelector("[data-test='firstName']");
    private final By lastName = By.cssSelector("[data-test='lastName']");
    private final By postalCode = By.cssSelector("[data-test='postalCode']");
    private final By continueBtn = By.cssSelector("[data-test='continue']");

    public void enterFirstName(String value) {
        type(firstName, value);
    }

    public void enterLastName(String value) {
        type(lastName, value);
    }

    public void enterPostalCode(String value) {
        type(postalCode, value);
    }

    public void clickContinue() {
        click(continueBtn);
    }
}