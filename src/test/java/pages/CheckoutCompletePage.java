package pages;

import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutCompletePage extends BasePage {

    private final By completeHeader = By.cssSelector(".complete-header");

    public void assertOrderConfirmationDisplayed() {
        // SauceDemo usually shows: "Thank you for your order!"
        String text = driver().findElement(completeHeader).getText().trim();
        assertTrue(text.toLowerCase().contains("thank you"),
                "Order confirmation not displayed. Actual: " + text);
    }
}